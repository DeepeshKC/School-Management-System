<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Routine</title>
</head>
<body>
	<jsp:include page="teacherHeader.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">View Routine</h1>
			</div>

			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">Routine</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<table width="100%"
								class="table table-striped table-bordered table-hover"
								id="dataTables-example">
								<thead>
								<thead>
									<tr>
										<th>Routine ID</th>
										<th>Day </th>
										<th>Class Name</th>
										<th>First Period</th>
										<th>Second Period</th>
										<th>Third Period</th>
										<th>Fourth Period</th>
										<th>Fifth Period</th>
										
									</tr>

									<c:forEach var="routine" items="${routineList}">
										<tr class="odd gradeX">
											<td>${routine.getRoutineId()}</td>
											<td>${routine.getDay().getDay()}</td>
											<td>${routine.getClasses().getClassName()}</td>
											<td>${routine.getFirstPeriod()}</td>
											<td>${routine.getSecondPeriod()}</td>
											<td>${routine.getThirdPeriod()}</td>
											<td>${routine.getFourthPeriod()}</td>
											<td>${routine.getFifthPeriod()}</td>

											
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