<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Administrative Staff Details</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">View Administrative Staff</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Administrative Staff Details</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							<thead>
								<tr>
									<th>Administrative Staff ID</th>
									<th>First Name</th>
									<th>Last Name</th>
									<th>Username</th>
									<th>Email Address</th>
									<th>Address</th>
									<th>Contact Number</th>
									<th>User Type</th>
									<th>Action</th>
								</tr>

								<c:forEach var="administrativeStaff" items="${adminStaffList}">
									<tr class="odd gradeX">
										<td>${administrativeStaff.getAdministativeStaffId()}</td>
										<td>${administrativeStaff.getFirstName()}</td>
										<td>${administrativeStaff.getLastName()}</td>
										<td>${administrativeStaff.getUsername()}</td>
										<td>${administrativeStaff.getEmail()}</td>
										<td>${administrativeStaff.getAddress()}</td>
										<td>${administrativeStaff.getContactNo()}</td>
										<td>${administrativeStaff.getUserType().getUserType()}</td>
										<td><a
											href="update-updateAdminStaff?id=${administrativeStaff.getAdministativeStaffId()}"
											class="btn btn-success"><span class="fa fa-edit"></span></a>|<a
											href="delete-deleteAdminStaff?id=${administrativeStaff.getAdministativeStaffId()}"
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