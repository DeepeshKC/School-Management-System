<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Tables</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">DataTables Advanced Tables</div>
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
									<th>Date From</th>
									<th>Date To</th>
									<th>Time</th>
								</tr>
								<c:forEach var="classes" items="{Classes List}">
									<tr class="odd gradeX">
									<tr class="odd gradeX">
										<td>${classes.getId()}</td>
										<td>${classes.getClasstName()}</td>
										<td>${classes.getDateFrom()}</td>
										<td>${classes.getDateTo()}</td>
										<td>${classes.getTime()}</td>
										<td><a href="updateRoles?id=${role.getId()}"
											class="btn btn-success"><span class="fa fa-edit"></span></a>|<a
											href="deleteRole?id=${role.getId()}" class="btn btn-danger"><span
												class="fa fa-trash"></span></a></td>
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