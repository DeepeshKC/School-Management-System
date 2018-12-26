
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Student</div>

				<div class="panel-body">
					<div class="row">
						<div class="col-lg-offset-3 col-lg-6">
							<form:form name="qryform" method="POST" action="add-addStudent"
								modelAttribute="student">
								<div class="form-group">
									<label>Please add first name</label>
									<form:input path="firstName" class="form-control"
										placeholder="Enter Student's First Name" />
								</div>
								<div class="form-group">
									<label>Please add last name</label>
									<form:input path="lastName" class="form-control"
										placeholder="Enter Student's Last Name" />
								</div>
								<div class="form-group">
									<label>Please add username</label>
									<form:input path="username" class="form-control"
										placeholder="Enter Student's Username" />
								</div>
								<div class="form-group">
									<label>Please add email address</label>
									<form:input path="email" class="form-control"
										placeholder="Enter E-mail Address" />
								</div>

								<div class="form-group">
									<label>Please add password</label>
									<form:input path="password" class="form-control"
										placeholder="Enter password" />
								</div>

								<div class="form-group">
									<label>Please add Address</label>
									<form:input path="address" class="form-control"
										placeholder="Enter Address" />
								</div>

								<div class="form-group">
									<label>Please add Contact Number</label>
									<form:input path="contactNo" class="form-control"
										placeholder="Enter Contact Number" />
								</div>

								<button type="submit" class="btn btn-success">Submit</button>
								<button type="reset" class="btn btn-warning">Reset</button>
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
