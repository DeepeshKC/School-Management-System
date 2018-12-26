<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Subjects</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Subjects</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Subjects</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
								<tr>
									<th>Subject ID</th>
									<th>Subject Name</th>
									<th>Class ID</th>
									<th>Action</th>

								</tr>
							</thead>
							<tbody>
								<c:forEach var="subject" items="${subjectList}">

									<tr class="odd gradeX">
										<td>${subject.getSubjectId()}</td>
										<td>${subject.getSubjectName()}</td>
										<td>${subject.getClasses().getClasses()}</td>

										<td><a href="deleteType?id=${subject.getSubjectId()}"
											class="btn btn-danger"><span class="fa fa-trash"></span></a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>