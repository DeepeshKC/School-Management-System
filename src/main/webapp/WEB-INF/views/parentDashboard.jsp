<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Parent Dashboard</title>

<!-- Bootstrap core CSS-->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">

<!-- Page level plugin CSS-->
<link href="vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin.css" rel="stylesheet">
</head>
<body id="page-top">
	<jsp:include page="parentHeader.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Parent Dashboard</h1>

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
									
									<th>Email Address</th>
									<th>Address</th>
									<th>Contact Number</th>
									
									
									<th>View Marks</th>
									<th>View Attendance</th>
									<th>View Routine</th>
								</tr>

								<c:forEach var="student" items="${studentList}">
									<tr class="odd gradeX">
										<td>${student.getStudent().getId()}</td>
										<td>${student.getStudent().getFirstName()}</td>
										<td>${student.getStudent().getLastName()}</td>
										
										<td>${student.getStudent().getEmail()}</td>
										<td>${student.getStudent().getAddress()}</td>
										<td>${student.getStudent().getContactNo()}</td>
										
									
									<td><a
											href="parent/viewExams?id=${student.getStudent().getId()}"
											class="btn btn-primary">View marks </a></td>
									
										<td><a
											href="parent/viewStudentAttendance?id=${student.getStudent().getId()}"
											class="btn btn-primary">View Attendance</a></td>
											<td><a
											href="parent/viewRoutines?id=${student.getStudent().getId()}"
											class="btn btn-warning">View Routine</a></td>

									</tr>
								</c:forEach>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>

</body>



</html>
</body>
</html>