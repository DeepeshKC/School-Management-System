<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parent Details</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">View Parents</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Parent Details</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							<thead>
								<tr>
									<th>Parent ID</th>
									<th>First Name</th>
									<th>Last Name</th>
									<th>Username</th>
									<th>Email Address</th>
									<th>Address</th>
									<th>Contact Number</th>
									<th>User Type</th>
									<th>Action</th>
								</tr>

								<c:forEach var="parent" items="${parentList}">
									<tr class="odd gradeX">
										<td>${parent.getParentId()}</td>
										<td>${parent.getFirstName()}</td>
										<td>${parent.getLastName()}</td>
										<td>${parent.getUsername()}</td>
										<td>${parent.getEmail()}</td>
										<td>${parent.getAddress()}</td>
										<td>${parent.getContactNo()}</td>
										<td>${parent.getUserType().getUserType()}</td>
										<td><a
											href="update-updateParent?id=${parent.getParentId()}"
											class="btn btn-success"><span class="fa fa-edit"></span></a>|<a
											href="delete-deleteParent?id=${parent.getParentId()}"
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