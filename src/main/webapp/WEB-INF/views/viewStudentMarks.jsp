<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Exam Marks</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Exam Marks</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Exam Marks</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							<thead>
								<tr>
									<th>Student ID</th>
									
									<th>Class Name</th>
										<th>Exam Name</th>
									<th>Student Name</th>
									<th>Science</th>
									<th>English</th>
									<th>Math</th>
									<th>Nepali</th>
									<th>Computer</th>
									<th>Status</th>
									<th>Action</th>
									
								</tr>
								<c:forEach var="examMarks" items="${examMarksList}">
									<tr class="odd gradeX">
									<tr class="odd gradeX">
									<td>${examMarks.getStudent().getId()}</td>
									
										<td>${examMarks.getClass1().getClassName()}</td>
										<td>${examMarks.getExam().getExamTitle()}</td>
										<td>${examMarks.getStudent().getUsername()}</td>
										<td>${examMarks.getScience()}</td>
										<td>${examMarks.getMath()}</td>
										<td>${examMarks.getEnglish()}</td>
										<td>${examMarks.getNepali()}</td>
										<td>${examMarks.getComputer()}</td>
										<td>${examMarks.getStatus()}</td>
										<td><a href="promoteStudent?id=${examMarks.getClass1().getClassId()}&student_id=${examMarks.getStudent().getId()}"
											class="btn btn-primary">Promote</a>
												
													
									</tr>
								</c:forEach>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>