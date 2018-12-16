
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Admin's Details</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Admin</div>

				<div class="panel-body">
					<div class="row">
						<div class="col-lg-offset-3 col-lg-6">
							<form:form name="qryform" method="POST"
								action="update-updateAdmin" modelAttribute="admin">
								<form:hidden path="teacherId" value="${admin.getAdminId()}}" />
								<div class="form-group">
									<label>Please update first name</label>
									<form:input path="firstName" class="form-control"
										value="${admin.getFirstName()}" />
								</div>
								<div class="form-group">
									<label>Please update last name</label>
									<form:input path="lastName" class="form-control"
										value="${admin.getLastName()}" />
								</div>
								<div class="form-group">
									<label>Please update username</label>
									<form:input path="username" class="form-control"
										value="${admin.getUsername()}" />
								</div>
								<div class="form-group">
									<label>Please update email address</label>
									<form:input path="email" class="form-control"
										value="${admin.getEmail()}" />
								</div>

								<div class="form-group">
									<label>Please update password</label>
									<form:input path="password" class="form-control"
										value="${admin.getPassword()}" />
								</div>

								<div class="form-group">
									<label>Please update address</label>
									<form:input path="address" class="form-control"
										value="${admin.getAddress()}" />
								</div>

								<div class="form-group">
									<label>Please update Contact Number</label>
									<form:input path="contactNo" class="form-control"
										value="${admin.getContactNo()}" />
								</div>
								<button type="submit" class="btn btn-default">Update</button>
								<button type="reset" class="btn btn-default">Reset</button>
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
