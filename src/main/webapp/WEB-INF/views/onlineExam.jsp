<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Exam</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Online Exam</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Online Exam</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							<thead>
								<tr>
									<th>Exam ID</th>
									<th>Subject</th>
									<th>Total Questions</th>
									<th>Marks</th>
									<th>Time Limit</th>
									<th>Action</th>
								</tr>

								<c:forEach var="onlineExam" items="${onlineExamList}">
									<tr class="odd gradeX">
										<td>${onlineExam.getOnlineExamId()}</td>
										<td>${onlineExam.getSubject()}</td>
										<td>${onlineExam.getTotalQuestions()}</td>
										<td>${onlineExam.getMarks()}</td>
										<td>${onlineExam.getTimeLimit()}</td>
										<td><a href="/online-Exam1" class="btn btn-success">Start</a></td>
										
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
</html>l>