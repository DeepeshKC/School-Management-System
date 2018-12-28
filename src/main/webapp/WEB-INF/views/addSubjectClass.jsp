<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subject Details</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Add Subject to Class</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Subject Details</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							<thead>
								<tr>
									<th>Subject ID</th>
									<th>Class ID</th>
									<th>Subject Name</th>
									<th>Add Subject to Class</th>

								</tr>
								<c:forEach var="subject" items="${subjectList}">
									<tr class="odd gradeX">
									<tr class="odd gradeX">
										<td>${subject.getSubjectId()}</td>
										<td>${subject.getClasses().getClassId()}</td>
										<td>${subject.getSubjectName()}</td>
										
										<td><a
											href="addSubjectClass?id=${subject.getSubjectId()}&class_id=${classes.getClassId()}"
											class="btn btn-primary">Add Subject</a></td>
		
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