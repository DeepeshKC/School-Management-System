<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Class</title>
</head>
<body>
	<jsp:include page="teacherHeader.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Class</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Class Details</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							<thead>
								<tr>
									<th>Class ID</th>
									<th>Class Name</th>
									<th>View Students</th>
									<th>View Routine</th>
									<th>Add Assignment</th>
								</tr>
								<c:forEach var="classes" items="${classList}">
									<tr class="odd gradeX">
									<tr class="odd gradeX">
										<td>${classes.getClassId()}</td>
										<td>${classes.getClassName()}</td>
										<td><a
											href="/teacherViewStudents?id=${classes.getClassId()}"
											class="btn btn-success">View Students </a></td>
										<td><a href="/viewRoutineClass?id=${classes.getClassId()}"
											class="btn btn-primary">Routine</a></td>
											<td><a href="teacher/addAssignments?id=${classes.getClassId()}"
											class="btn btn-success">Add</a></td>
											
											
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