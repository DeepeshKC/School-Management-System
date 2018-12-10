
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Teacher</title>
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
							<form:form name="qryform" method="POST" action="add-add-teacher"
								modelAttribute="teacher">

								<div class="form-group">
									<label>Please add first name</label>
									<form:input path="Teacher" class="form-control"
										placeholder="Enter Teacher's First Name" />
								</div>
								<div class="form-group">
									<label>Please add last name</label>
									<form:input path="Teacher" class="form-control"
										placeholder="Enter Teacher's Last Name" />
								</div>
								<div class="form-group">
									<label>Please add username</label>
									<form:input path="Teacher" class="form-control"
										placeholder="Enter Teacher's Username" />
								</div>
								<div class="form-group">
									<label>Please add email address</label>
									<form:input path="Teacher" class="form-control"
										placeholder="Enter E-mail Address" />
								</div>

								<div class="form-group">
									<label>Please add password</label>
									<form:input path="Teacher" class="form-control"
										placeholder="Enter password" />
								</div>

								<div class="form-group">
									<label>Please add Address</label>
									<form:input path="Teacher" class="form-control"
										placeholder="Enter Address" />
								</div>

								<div class="form-group">
									<label>Please add Contact Number</label>
									<form:input path="Teacher" class="form-control"
										placeholder="Enter Contact Number" />
								</div>
								<button type="submit" class="btn btn-default">Submit</button>
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
