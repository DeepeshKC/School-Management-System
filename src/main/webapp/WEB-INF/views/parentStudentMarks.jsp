<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Exam Marks</title>
</head>
<body>
	<jsp:include page="parentHeader.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">User Type</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">User Type Details</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
							
								<tr class="odd gradeX">
									<th>Particulars</th>
									
									<th>Details</th>
									
									
								</tr>
								</thead>
								<tbody>
								<tr class="odd gradeX">
								<td>Student Id</td>
								<td>${examMarks.getStudent().getId()}</td>
								</tr>
								<tr class="odd gradeX">
								<td>Student Name</td>
								<td>${examMarks.getStudent().getFirstName()}</td>
								</tr>
								<tr class="odd gradeX">
								<td>Class</td>
								<td>${examMarks.getClass1().getClassName()}</td>
								</tr>
								<tr class="odd gradeX">
								<td>Math</td>
								<td>${examMarks.getMath()}</td>
								</tr>
								<tr class="odd gradeX">
								<td>Science</td>
								<td>${examMarks.getScience()}</td>
								</tr>
								<tr class="odd gradeX">
								<td>English</td>
								<td>${examMarks.getEnglish()}</td>
								</tr>
								<tr class="odd gradeX">
								<td>Computer</td>
								<td>${examMarks.getComputer()}</td>
								</tr>
								
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>