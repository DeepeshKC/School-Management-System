<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher Details</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">View Teacher</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Teacher Details</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							<thead>
								<tr>
									<th>Teacher ID</th>
									<th>First Name</th>
									<th>Last Name</th>
									<th>Username</th>
									<th>Email Address</th>
									<th>Address</th>
									<th>Contact Number</th>
									<th>User Type</th>
									<th>Action</th>
								</tr>

								<c:forEach var="teacher" items="${teachersList}">
									<tr class="odd gradeX">
										<td>${teacher.getTeacherId()}</td>
										<td>${teacher.getFirstName()}</td>
										<td>${teacher.getLastName()}</td>
										<td>${teacher.getUsername()}</td>
										<td>${teacher.getEmail()}</td>
										<td>${teacher.getAddress()}</td>
										<td>${teacher.getContactNo()}</td>
										<td>${teacher.getUserType().getUserType()}</td>
										<td><a
											href="update-updateTeacher?id=${teacher.getTeacherId()}"
											class="btn btn-success"><span class="fa fa-edit"></span></a>|<a
											href="delete-deleteTeacher?id=${teacher.getTeacherId()}"
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