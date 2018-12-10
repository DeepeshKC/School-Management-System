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
									<th>Action</th>
								</tr>

								<c:forEach var="Student" items="${StudentsList}">
									<tr class="odd gradeX">
										<td>${Student.getStudentId()}</td>
										<td>${Student.getFirstName()}</td>
										<td>${Student.getLastName()}</td>
										<td>${Student.getUsername()}</td>
										<td>${Student.getEmail()}</td>
										<td>${Student.getAddress()}</td>
										<td>${Student.getContactNo()}</td>
										<td>${Student.getUserType().getUserType()}</td>
										<td><a
											href="update-updateStudent?id=${Student.getStudentId()}"
											class="btn btn-success"><span class="fa fa-edit"></span></a>|<a
											href="delete-deleteStudent?id=${Student.getStudentId()}"
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