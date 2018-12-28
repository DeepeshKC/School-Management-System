<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send Email</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Email</div>

				<div class="panel-body">
					<div class="row">
						<div class="col-lg-offset-3 col-lg-6">
							<form:form name="qryform" method="POST" action="sendMail"
								modelAttribute="mail">

								<div class="form-group">
									<label>To</label>
									<form:input path="receiver" class="form-control"
										placeholder="Receiver's email" value="${email}"/>
								
									<div class="form-group">
									<label>Please add subject</label>
									<form:input path="subject" class="form-control"
										placeholder="Enter Subject" />
								</div>

									<div class="form-group">
									<label>Please Type Message</label>
									<form:input path="message" class="form-control"
										placeholder="Type Message" />
								</div>
								<button type="submit" class="btn btn-success">Send</button>
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