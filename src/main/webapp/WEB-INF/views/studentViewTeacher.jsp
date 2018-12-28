<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VLE</title>
</head>
<body>
	<jsp:include page="studentHeader.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">VLE</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">VLE - Resources</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							<thead>
								<tr>
									<th>Teacher ID</th>
									<th>First Name</th>
									<th>Last Name</th>
									<th>Email Address</th>
									
									<th>View Resources</th>
								</tr>

								<c:forEach var="teacher" items="${teachersList}">
									<tr class="odd gradeX">
										<td>${teacher.getTeacherId()}</td>
										<td>${teacher.getFirstName()}</td>
										<td>${teacher.getLastName()}</td>
										
										<td>${teacher.getEmail()}</td>
									
										<td><a
											href="studentViewResource?id=${teacher.getTeacherId()}"
											class="btn btn-success">View</a></td>
									</tr>
								</c:forEach>
							</thead>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>