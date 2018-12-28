<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment</title>
</head>
<body>
	<jsp:include page="studentHeader.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Assignment</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Assignment</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							<thead>
								<tr>
									<th>Assignment ID</th>
									<th>Assignment Title</th>
									<th>Assignment Description</th>
									<th>Assignment Deadline</th>
									<th>Assignment File</th>
									
								</tr>

								<c:forEach var="assignment" items="${assignmentList}">
									<tr class="odd gradeX">
										<td>${assignment.getAssignmentId()}</td>
										<td>${assignment.getAssignmentTitle()}</td>
										<td>${assignment.getAssignmentDescription()}</td>
										<td>${assignment.getAssignmentDeadline()}</td>
										<td><form action="/downloadAssignment" method="get">
											<input type="hidden" name="link" value="${assignment.getAssignmentFile()}"/>
											<button type="submit" class="btn btn-primary">Download File</button>
										</form></td>
										
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