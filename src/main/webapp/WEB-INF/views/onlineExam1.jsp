<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Bootstrap Core CSS -->
<title>Online Exam</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Online Exam Question</h1>

				<c:if test="${result != null}">
					<h1 style="color: green">Your score: ${score}</h1>
					<h3 style="color: green">Total Corrected Answers: ${score / 10}</h3>
				</c:if>
				
				<div id="time">
					
				</div>

			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Online Exam Question</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<div class="row">
							<br> <br>
							<div class="col-sm-8 col-sm-offset-2">
								<div class="loader">
									<div class="col-xs-3 col-xs-offset-5">
										<div id="loadbar" style="display: none;">
											<img
												src="http://schoolsearch.co.ke/systems/img/loader.gif_large.gif"
												alt="Loading" class="center-block loanParamsLoader" style="">
										</div>
									</div>

									<form method="post" action="/viewResult">
										<c:forEach items="${onlineExamList}" var="item"
											varStatus="loop">

											<div>
												<b>${item.question1}</b><br>

												<div class="radio">
													<label><input type="radio" value="a"
														name="answers[${loop.index}]">${item.option1}</label>
												</div>
												<div class="radio">
													<label><input type="radio" value="b"
														name="answers[${loop.index}]">${item.option2}</label>
												</div>
												<div class="radio">
													<label><input type="radio" value="c"
														name="answers[${loop.index}]">${item.option3}</label>
												</div>
												<div class="radio">
													<label><input type="radio" value="d"
														name="answers[${loop.index}]">${item.option4}</label>
												</div>
												<input type="hidden" name="rightAnswer"
													value="${item.rightAnswer}">

												<c:if test="${result != null}">
													<br>
													<b>Result:
														${result.get("res".concat(loop.index)).get(0)}</b>
													<br>
													<b>Your answer:
														${result.get("res".concat(loop.index)).get(1)}</b>
													<br>
													<b>Correct answer:
														${result.get("res".concat(loop.index)).get(2)}</b>
												</c:if>
											</div>

											<hr />
										</c:forEach>

										<c:if test="${result == null}">
											<button type="submit" id="check">Check</button>
										</c:if>


									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script>
		$(document).ready(function() {
			var min = 9;
			var sec = 60;
			var timer = setInterval(function() {
				sec--;
				$("#time").text("Time: "+min + ":" + sec);
				if (sec == 0) {
					sec = 60;
					min--;
					
					if (min < 0) {
						alert("Time out");
						clearInterval(timer);
					}
				}
			}, 1000);
		})
	</script>


</body>
</html>