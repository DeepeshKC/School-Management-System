
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Assignment</title>
</head>
<body>
	<jsp:include page="teacherHeader.jsp" />
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Assignment</div>

				<div class="panel-body">
					<div class="row">
						<div class="col-lg-offset-3 col-lg-6">
							<form:form name="qryform" method="POST" action="add-addAssignments"
								modelAttribute="assignment">

								<div class="form-group">
									<label>Please Add Assignment Title</label>
									<form:input path="assignmentTitle" class="form-control"
										placeholder="Enter assignment title" />
								</div>
								<div class="form-group">
									<label>Please Add Assignment Description</label>
									<form:input path="assignmentDescription" class="form-control"
										placeholder="Enter assignment description" />
								</div>
								<div class="form-group">
									<label>Please Add Assignment Deadline</label>
									<form:input path="assignmentDeadline" class="form-control"
										placeholder="Enter assignment deadline" />
								</div>
								<div class="form-group">
									<label>Please Add Assignment File Name</label>
									<form:input path="assignmentFile" class="form-control"
										placeholder="Enter assignment file name" />
								</div>

								<button type="submit" class="btn btn-success">Submit</button>
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
