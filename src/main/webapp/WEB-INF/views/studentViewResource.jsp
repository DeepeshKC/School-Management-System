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
									<th>Resource ID</th>
									<th>Resource Title</th>
								
									<th>Resource File</th>
									
								</tr>

								<c:forEach var="resource" items="${resourceList}">
									<tr class="odd gradeX">
										<td>${resource.getId()}</td>
										<td>${resource.getTitle()}</td>
										
										<td><form action="/downloadResource" method="get">
											<input type="hidden" name="link" value="${resource.getResource()}"/>
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