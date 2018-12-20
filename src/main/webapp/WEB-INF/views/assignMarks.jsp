<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Language Institute- Add Marks</title>

<!-- Bootstrap core CSS-->
</head>



<style>
.error {
	color: #ff0000;
	font-style: italic;
}
</style>

<body id="page-top">

	<jsp:include page="header.jsp" />

	<div class="row">

		<div class="col-lg-12">
			<div class="panel panel-default">

				<div class="panel-heading">Language Institute-Add Class Form</div>
				<hr />

				<div class="panel-body">
					<div class="row">

						<div class="col-lg-offset-3 col-lg-6">
							<form:form action="add-addMarks" method="POST"
								modelAttribute="examMarks">
								<div class="form-group">

									<form:hidden path="student" value="${student_id}" />
									<form:hidden path="class1" value="${class_id}" />
									<div class="form-group">
										<label>Select Exam</label>
										<form:select path="exam" items="${examList}"
											itemLabel="examTitle" itemValue="examId" class="form-control" />
									</div>


									<div class="form-group">
										<label>Add Obtained Marks in Math</label>
										<form:input path="math" class="form-control"
											placeholder="Enter Marks in number" />
									</div>
									<div class="form-group">
										<label>Add Obtained Marks in Science</label>
										<form:input path="science" class="form-control"
											placeholder="Enter Marks in number" />
									</div>
									<div class="form-group">
										<label>Add Obtained Marks in English</label>
										<form:input path="english" class="form-control"
											placeholder="Enter Marks in number" />
									</div>
									<div class="form-group">
										<label>Add Obtained Marks in Nepali</label>
										<form:input path="nepali" class="form-control"
											placeholder="Enter Marks in number" />
									</div>
									<div class="form-group">
										<label>Add Obtained Marks in Computer</label>
										<form:input path="computer" class="form-control"
											placeholder="Enter Marks in number" />
									</div>
									
									<div class="form-group">
										<label>Add Status</label>
										<form:input path="status" class="form-control"
											placeholder="Enter status" />
									</div>

									<button class="btn btn-success" type="submit">Add
										Marks</button>
									<button class="btn btn-primary" type="reset">Reset</button>
							</form:form>



						</div>

					</div>

				</div>

			</div>
		</div>

	</div>






</body>

</html>