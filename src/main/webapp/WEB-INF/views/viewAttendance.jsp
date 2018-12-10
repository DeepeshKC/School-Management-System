<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Attendance</div>


				<div class="panel-body">Search for Attendance</div>
				<div class="row">
					<div class="col-lg-offset-3 col-lg-6"><%@ page
							language="java" contentType="text/html; charset=ISO-8859-1"
							pageEncoding="ISO-8859-1"%>

						<div class="form-group">
							<label>Intake</label> <select class="form-control">
								<option>Jan/Feb</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
							</select>
						</div>
						<div class="form-group">
							<label>Course</label> <select class="form-control">
								<option>Ja</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
							</select>
						</div>
						<div class="form-group">
							<label>Class</label> <select class="form-control">
								<option>Ja</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
							</select>
						</div>
						<div class="form-group">
							<label>Date</label> <input value="userType" class="form-control"
								placeholder="Enter user Type">
						</div>
						<div class="form-group">
							<label>Status</label> <select class="form-control">
								<option>Ja</option>
								<option>2</option>
								<option>3</option>
								<option>4</option>
								<option>5</option>
							</select>
						</div>
						<button type="submit" class="btn btn-default">Search
							Attendance</button>
						<button type="reset" class="btn btn-default">Reset</button>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>