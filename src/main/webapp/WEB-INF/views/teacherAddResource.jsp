
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
				<div class="panel-heading">Resource</div>

				<div class="panel-body">
					<div class="row">
					

						<div class="col-lg-offset-3 col-lg-6">
							<div>
							${message}
							Upload Assignment

						</div>
							<form:form name="qryform" method="POST"
								action="add-addResource" modelAttribute="resource" enctype="multipart/form-data">

								<form:hidden path="teacher" value="${teacher} " />
								
								<div class="form-group">
									<label>Please Add Resource Title</label>
									<form:input path="title" class="form-control"
										placeholder="Enter Resource title" />
								</div>
							

							<div class="form-group">
								<label>Upload File</label>
								<input type="file" name="file" />
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
