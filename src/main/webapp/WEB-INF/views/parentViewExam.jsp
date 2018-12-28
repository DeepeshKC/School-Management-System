<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Exam</title>
</head>
<body>
	<jsp:include page="parentHeader.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Exam</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Exam Details</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							<thead>
								<tr>
									<th>Exam ID</th>
									<th>Exam Name</th>
									<th>Exam Description</th>
									<th>Exam Date</th>
									
									<th>View Marks</th>

								</tr>
								<c:forEach var="exam" items="${examList}">
									<tr class="odd gradeX">
									<tr class="odd gradeX">
										<td>${exam.getExamId()}</td>
										<td>${exam.getExamTitle()}</td>
										<td>${exam.getExamDescription()}</td>
										<td>${exam.getExamDate()}</td>
										
									<td><a href="parent/viewMarks?id=${exam.getExamId()}&student_id=${student}" class="btn btn-success">View Legder</a>
											</td>
									
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