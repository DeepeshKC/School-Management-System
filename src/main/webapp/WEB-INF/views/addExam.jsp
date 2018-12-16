<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Exam</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Exam</div>

				<div class="panel-body">
					<div class="row">
						<div class="col-lg-offset-3 col-lg-6">
							<form:form name="qryform" method="POST" action="add-add-exam"
								modelAttribute="exam">

								<div class="form-group">
									<label>Please add new Exam</label>
									<form:input path="examTitle" class="form-control"
										placeholder="Enter Exam Title" />
								</div>
								
									<div class="form-group">
									<label>Please add Exam Description</label>
									<form:input path="examDescription" class="form-control"
										placeholder="Enter Exam Description" />
								</div>

									<div class="form-group">
									<label>Please add date</label>
									<form:input path="examDate" class="form-control"
										placeholder="Enter Exam Date" />
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