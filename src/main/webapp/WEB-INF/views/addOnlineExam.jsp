
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Online Exam</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Online Exam</div>

				<div class="panel-body">
					<div class="row">
						<div class="col-lg-offset-3 col-lg-6">
						
							<form:form name="qryform" method="POST"
								action="add-addOnlineExam" modelAttribute="onlineExam">
								<div class="form-group">
									<label>Please add subject name</label>
									<form:input path="subject" class="form-control"
										placeholder="Enter Subject Name" />
								</div>
								<div class="form-group">
									<label>Please add total number of question</label>
									<form:input path="totalQuestions" class="form-control"
										placeholder="Enter Question Number" />
								</div>
								<div class="form-group">
									<label>Please add marks</label>
									<form:input path="marks" class="form-control"
										placeholder="enter marks" />
								</div>
								<div class="form-group">
									<label>Please add time limit</label>
									<form:input path="timeLimit" class="form-control"
										placeholder="Enter time limit" />
								</div>
								<button type="submit" class="btn btn-primary">Submit</button>
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
