<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.deepesh.schoolmanagement.app.model.Student" %>
<%
	if(session.getAttribute("student")==null)
		response.sendRedirect("login");
%>

 <!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>School Management System</title>

<!-- Bootstrap Core CSS -->
<link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="/dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="/vendor/morrisjs/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">School Management
					System</a>
			</div>

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li class="sidebar-search">
							<div class="input-group custom-search-form">
								<input type="text" class="form-control" placeholder="Search...">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search"></i>
									</button>
								</span>
							</div> <!-- /input-group -->
						</li>
						<li><a href="#"><i class="fa fa-dashboard fa-fw"></i>
								Dashboard</a></li>

						<li><a href="studentCalendars"><i class="fas fa-calendar-alt"></i>
								Calendar</a></li>

						
						<li><a href="studentViewTeachers"><i class="fa fa-edit fa-fw"></i>
								VLE</a></li>
						
		
						<li><a href="onlineExams1"><i class="fa fa-edit fa-fw"></i>
								Attend Examination</a></li>

												
						<li><a href="${pageContext.request.contextPath}/student/viewAssignments"><i class="fa fa-edit fa-fw"></i>
								View Assignments</a></li>

						
						<li><a href="${pageContext.request.contextPath}/student/viewStudentAttendances"><i class="fa fa-edit fa-fw"></i>
								View Attendance</a></li>
								
								<li><a href="${pageContext.request.contextPath}/student/viewStudentExam"><i class="fa fa-edit fa-fw"></i>
								View Result</a></li>

					 <li><a href="/login"><i class="fa fa-sign-out fa-fw"></i> Logout</a>

					</ul>
				</div>
			</div>
		</nav>
	</div>
</body>
</html>
