<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question Paper</title>
</head>
<body>
	<jsp:include page="teacherHeader.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">View Question Papers</h1>
			</div>

			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">Question Papers</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<table width="100%"
								class="table table-striped table-bordered table-hover"
								id="dataTables-example">
								<thead>
								<thead>
									<tr>
										<th>Question Paper ID</th>
										<th>Question Paper Name</th>
										<th>Question1</th>
										<th>Option1</th>
										<th>Option2</th>
										<th>Option3</th>
										<th>Option4</th>
										<th>Right Answer</th>
										<th>Class ID</th>
										<th>Action</th>
									</tr>

									<c:forEach var="questionPaper" items="${questionPaperList}">
										<tr class="odd gradeX">
											<td>${questionPaper.getQuestionPaperId()}</td>
											<td>${questionPaper.getQuestionPaperName()}</td>
											<td>${questionPaper.getQuestion1()}</td>
											<td>${questionPaper.getOption1()}</td>
											<td>${questionPaper.getOption2()}</td>
											<td>${questionPaper.getOption3()}</td>
											<td>${questionPaper.getOption4()}</td>
											<td>${questionPaper.getRightAnswer()}</td>
											<td>${questionPaper.getClasses1() .getClassId()}</td>
											<td><a
												href="update-updateQuestionPapers?id=${questionPaper.getQuestionPaperId()}"
												class="btn btn-success"><span class="fa fa-edit"></span></a>|<a
												href="delete-deleteQuestionPapers?id=${questionPaper.getQuestionPaperId()}"
												class="btn btn-danger"><span class="fa fa-trash"></span></a></td>
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