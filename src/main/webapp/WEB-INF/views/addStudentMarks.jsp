<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">View Student</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Student Details</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							<thead>
								<tr>
									<th>Student ID</th>
									<th>First Name</th>
									<th>Last Name</th>
									<th>Username</th>
									<th>Email Address</th>
									<th>Address</th>
									<th>Contact Number</th>
									<th>User Type</th>
									<th>Add marks</th>
								</tr>

								<c:forEach var="student" items="${studentList}">
									<tr class="odd gradeX">
										<td>${student.getId()}</td>
										<td>${student.getFirstName()}</td>
										<td>${student.getLastName()}</td>
										<td>${student.getUsername()}</td>
										<td>${student.getEmail()}</td>
										<td>${student.getAddress()}</td>
										<td>${student.getContactNo()}</td>
										<td>${student.getUserType().getUserType()}</td>
										
									
									<td><a href="addStudentMarks?id=${student.getId()}&class_id=${class_id}"
											class="btn btn-primary">Add</a></td>
									
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