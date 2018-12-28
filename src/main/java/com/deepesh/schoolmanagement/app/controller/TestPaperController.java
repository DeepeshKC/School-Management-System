package com.deepesh.schoolmanagement.app.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.deepesh.schoolmanagement.app.model.Resource;
import com.deepesh.schoolmanagement.app.model.TestPaper;
import com.deepesh.schoolmanagement.app.repository.ClassesRepository;
import com.deepesh.schoolmanagement.app.repository.ExamRepository;
import com.deepesh.schoolmanagement.app.repository.SubjectRepository;
import com.deepesh.schoolmanagement.app.repository.TestPaperRepository;

@Controller
public class TestPaperController {
	
	@Autowired private TestPaperRepository testPaperRepository;
	@Autowired private ClassesRepository classesRepository;
	@Autowired private ExamRepository examRepository;
	@Autowired private SubjectRepository subjectRepository;
	
	@ModelAttribute("testPaper")
	public TestPaper getTests() {
		return new TestPaper();
	}
	public String fileUpload(@RequestParam("file") MultipartFile file) {
		String update = "";

		Path directoryPath = Paths.get("Questions");
		if (!Files.exists(directoryPath)) {
			try {
				Files.createDirectory(directoryPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String UPLOADED_FOLDER = directoryPath.toString();
		if (file.isEmpty()) {
			update = "0";
			return update;
		}

		try {
// Get the file and save it somewhere
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER, file.getOriginalFilename());
			Files.write(path, bytes);

			update = path.toString();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return update;
	}

	
	@RequestMapping(value="**/teacher/addTestPapers", method=RequestMethod.GET)
	public String loadTeatPage(Model model, Model model2, Model model3) {
		model.addAttribute("examList", examRepository.findAll());
       model.addAttribute("classList", classesRepository.findAll());
       model3.addAttribute("subjectList", subjectRepository.findAll());
       return "teacherAddTestPaper";
	}

	
	@RequestMapping(value = "**/teacher/add-addTestPaper", method = RequestMethod.POST)
	public String addAssignments(@ModelAttribute("testPaper") TestPaper testPaper,
			@RequestParam("file") MultipartFile file) {
		String fileName = fileUpload(file);
		testPaper.setPaper(!fileName.equals("0") ? fileName : null);
		testPaperRepository.save(testPaper);
		return "redirect:teacher/viewTestPapers";
	}
	
	@RequestMapping(value = "**/teacher/viewTestPapers", method = RequestMethod.GET)
	public String ad_iewAssignments(Model model) {
		model.addAttribute("testPaperList", testPaperRepository.findAll());
		return "teacherViewPaper";
	}
	
	@RequestMapping(value = "**/staff/viewTestPapers", method = RequestMethod.GET)
	public String  staffViewTeatPapaer(Model model) {
		model.addAttribute("testPaperList", testPaperRepository.findAll());
		return "staffViewTestPaper";
	}
	@GetMapping(value = "downloadPaper", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	@ResponseBody
	public byte[] download(@RequestParam("link") String link) {

		try {
			if (Files.exists(Paths.get(link))) {
				InputStream in = Files.newInputStream(Paths.get(link));
				return IOUtils.toByteArray(in);
			}
		} catch (IOException io) {
			io.getMessage();
		}
		return null;
	}
	
}
