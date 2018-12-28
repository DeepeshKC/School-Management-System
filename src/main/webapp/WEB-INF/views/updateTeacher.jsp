
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Teacher's Details</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Teacher</div>

				<div class="panel-body">
					<div class="row">
						<div class="col-lg-offset-3 col-lg-6">
							<form:form name="qryform" method="POST" action="update-updateTeacher"
								modelAttribute="teachers">
								<form:hidden path="teacherId" value="${teachers.getTeacherId()} }"/>
								
  
								<div class="form-group">
									<label>Please add first name</label>
									<form:input path="firstName" class="form-control"
										value="${teachers.getFirstName()}" />
								</div>
								<div class="form-group">
									<label>Please add last name</label>
									<form:input path="lastName" class="form-control"
										value="${teachers.getLastName()}" />
								</div>
								<div class="form-group">
									<label>Please add username</label>
									<form:input path="username" class="form-control"
										value="${teachers.getUsername()}"/>
								</div>
								<div class="form-group">
									<label>Please add email address</label>
									<form:input path="email" class="form-control"
										value="${teachers.getEmail()}"/>
								</div>

								<div class="form-group">
									<label>Please add password</label>
									<form:input path="password" class="form-control"
										value="${teachers.getPassword()}"/>
								</div>

								<div class="form-group">
									<label>Please add Address</label>
									<form:input path="address" class="form-control"
									value="${teachers.getAddress()}" />
								</div>

								<div class="form-group">
									<label>Please add Contact Number</label>
									<form:input path="contactNo" class="form-control"
										value="${teachers.getContactNo()}" />
								
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
