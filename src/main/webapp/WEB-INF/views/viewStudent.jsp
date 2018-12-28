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
		<input type="text" id="search" class="form-control"
			placeholder="Search">


		<div class="row">

			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Student Details</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="studentTable">
							<thead>
								<tr class='header'>
									<th>Student ID</th>
									<th >First Name</th>
									<th >Last Name</th>
									<th>Username</th>
									<th>Email Address</th>
									<th>Address</th>
									<th>Contact Number</th>
									<th>User Type</th>
									<th>Action</th>
									


								</tr>
							</thead>
							<tbody>
								<c:forEach var="student" items="${studentsList}">
									<tr class="odd gradeX">
										<td class="studentid">${student.getId()}</td>
										<td class='firstname'>${student.getFirstName()}</td>
										<td class='lastname'>${student.getLastName()}</td>
										<td>${student.getUsername()}</td>
										<td>${student.getEmail()}</td>
										<td>${student.getAddress()}</td>
										<td>${student.getContactNo()}</td>
										<td>${student.getUserType().getUserType()}</td>
										<td><a href="updateStudents?id=${student.getId()}"
											class="btn btn-success"><span class="fa fa-edit"></span></a>|
											<a href="deleteStudents?id=${student.getId()}"
											class="btn btn-danger"><span class="fa fa-trash"></span></a></td>





									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script>
	$(document)
			.ready(
					function() {
						$("#search")
								.on(
										"keyup",
										function() {
											var value = $(this).val()
													.toLowerCase();
											$("#studentTable .odd ")
													.filter(
															function() {
																$(this)
																		.toggle(
																				$(
																						'.firstname,.lastname,.studentid',
																						this)
																						.text()
																						.toLowerCase()
																						.indexOf(
																								value) > -1)
															});
										});
					});
</script>
</html>