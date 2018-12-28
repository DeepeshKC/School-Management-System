
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
							<div>${message}Upload Assignment</div>
							<form:form name="qryform" method="POST" action="add-addTestPaper"
								modelAttribute="testPaper" enctype="multipart/form-data">
								<div class="form-group">
									<label>Select class</label>
									<form:select path="classes" items="${classList}"
										itemLabel="className" itemValue="classId" class="form-control" />
								</div>
								<div class="form-group">
									<label>Select Exam</label>
									<form:select path="exam" items="${examList}"
										itemLabel="examTitle" itemValue="examId" class="form-control" />
								</div>
								<div class="form-group">
									<label>Select subject</label>
									<form:select path="subject" items="${subjectList}"
										itemLabel="subjectName" itemValue="subjectId" class="form-control" />
								</div>

								<div class="form-group">
									<label>Upload File</label> <input type="file" name="file" />
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
