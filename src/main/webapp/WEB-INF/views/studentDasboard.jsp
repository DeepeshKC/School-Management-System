<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Student Dashboard</title>

<!-- Bootstrap core CSS-->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">

<!-- Page level plugin CSS-->
<link href="vendor/datatables/dataTables.bootstrap4.css"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin.css" rel="stylesheet">
</head>
<body id="page-top">
	<jsp:include page="studentHeader.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Student Dashboard</h1>

				<div class="row">
					<div class="col-lg-12">
						<div class="panel panel-default">
							<div class="panel-heading">VLE Login</div>
							<div class="container">
								<div class="row">
									<div class="col-md-4 col-md-offset-4">
										<div class="login-panel panel panel-default">
											<div class="panel-heading">
												<h3 class="panel-title">Please Sign In</h3>
											</div>
											<div class="panel-body">
												<form role="form" action="/studentLogin" method="POST">
													<fieldset>
														<div class="form-group">
															<input class="form-control" placeholder="Username"
																name="username" type="text" autofocus>
														</div>
														<div class="form-group">
															<input class="form-control" placeholder="Password"
																name="password" type="password" value="">
														</div>
</body>



</html>
</body>
</html>