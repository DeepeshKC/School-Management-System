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
	<jsp:include page="header.jsp" />
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
									<th>Action</th>
									<th>Add Student to Class</th>
									<th>Add Teacher to Class</th>
									<th>Add Subject to Class</th>
									<th>View Routine</th>
								</tr>
								<c:forEach var="classes" items="${classList}">
									<tr class="odd gradeX">
									<tr class="odd gradeX">
										<td>${classes.getClassId()}</td>
										<td>${classes.getClassName()}</td>
										<td><a href="#"
											class="btn btn-success"><span class="fa fa-edit"></span></a>|<a
											href="deleteClasses?id=${classes.getClassId()}" class="btn btn-danger"><span
												class="fa fa-trash"></span></a></td>
												
												<td><a href="/addStudent?id=${classes.getClassId()}"
											class="btn btn-primary">Add</a></td>
					
										<td><a href="/addTeacher?id=${classes.getClassId()}"
											class="btn btn-primary">Add</a></td>
													
										<td><a href="/addSubject?id=${classes.getClassId()}"
											class="btn btn-primary">Add</a></td>
											
									<td><a href="/viewRoutineClass?id=${classes.getClassId()}"
											class="btn btn-primary">View</a></td>		
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