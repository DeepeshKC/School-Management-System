
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Parent's Details</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Parent</div>

				<div class="panel-body">
					<div class="row">
						<div class="col-lg-offset-3 col-lg-6">
							<form:form name="qryform" method="POST"
								action="update-updateParent" modelAttribute="parent">
								<form:hidden path="parentId" value="${parent.getParentId()} }" />
								<div class="form-group">
									<label>Please Update first name</label>
									<form:input path="firstName" class="form-control"
										value="${parent.getFirstName()}" />
								</div>
								<div class="form-group">
									<label>Please Update last name</label>
									<form:input path="lastName" class="form-control"
										value="${parent.getLastName()}" />
								</div>
								<div class="form-group">
									<label>Please Update username</label>
									<form:input path="username" class="form-control"
										value="${parent.getusername()}" />
								</div>
								<div class="form-group">
									<label>Please Update email address</label>
									<form:input path="email" class="form-control"
										value="${parent.getEmail()}" />
								</div>

								<div class="form-group">
									<label>Please Update password</label>
									<form:input path="password" class="form-control"
										value="${parent.getPassword()}" />
								</div>

								<div class="form-group">
									<label>Please Update address</label>
									<form:input path="address" class="form-control"
										value="${parent.getAddress()}" />
								</div>

								<div class="form-group">
									<label>Please Update Contact Number</label>
									<form:input path="contactNo" class="form-control"
										value="${parent.getContactNo()}" />
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
