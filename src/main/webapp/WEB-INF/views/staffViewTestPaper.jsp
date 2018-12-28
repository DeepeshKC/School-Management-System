<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Paper</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Paper</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							<thead>
								<tr>
									<th>Paper ID</th>
									<th>Class </th>
									<th>Exam </th>
								
									<th>Subject</th>
									<th>File</th>
									
								</tr>

								<c:forEach var="assignment" items="${testPaperList}">
									<tr class="odd gradeX">
										<td>${assignment.getId()}</td>
										<td>${assignment.getClasses().getClassId()}</td>
										<td>${assignment.getExam().getExamTitle()}</td>
										<td>${assignment.getSubject().getSubjectName()}</td>
										<td><form action="/downloadPaper" method="get">
											<input type="hidden" name="link" value="${assignment.getPaper()}"/>
											<button type="submit" class="btn btn-primary">Download File</button>
										</form></td>
										
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