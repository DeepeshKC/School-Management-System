<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Bootstrap Core CSS -->
<link href="../css/onlineexam.css" rel="stylesheet">
<title>Online Exam</title>
<style>
	ul li {
		height: 50px;
	}
</style>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Online Exam Question</h1>
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
						<div class="row"><br><br>
            <div class="col-sm-8 col-sm-offset-2">
                <div class="loader">
                    <div class="col-xs-3 col-xs-offset-5">
                        <div id="loadbar" style="display: none;">
                            <img src="http://schoolsearch.co.ke/systems/img/loader.gif_large.gif" alt="Loading" class="center-block loanParamsLoader" style="">
                        </div>
                    </div>

                    <div id="quiz">
                  
                        <div class="question">
                            <h3><span class="label label-warning" id="qid">1</span>
                            <span id="question">What's my name? </span>
                            </h3>
                        </div>
                        <ul>
                          <li>
                            <input type="radio" class="inputoption" id="f-option" name="selector" value="1">
                            <label for="f-option" class="element-animation">Option 1</label>
                            <div class="check"></div>
                          </li>
                          
                          <li>
                            <input type="radio" class="inputoption" id="s-option" name="selector" value="2">
                            <label for="s-option" class="element-animation">Option 2</label>
                            <div class="check"><div class="inside"></div></div>
                          </li>
                          
                          <li>
                            <input type="radio" class="inputoption" id="t-option" name="selector" value="3">
                            <label for="t-option" class="element-animation">Option 3</label>
                            <div class="check"><div class="inside"></div></div>
                          </li>
                          
                          <li>
                            <input type="radio" class="inputoption" id="t-option" name="selector" value="3">
                            <label for="t-option" class="element-animation">Option 4</label>
                            <div class="check"><div class="inside"></div></div>
                          </li>
                        </ul>
                    </div>
                </div>
                <div class="hint">
                    <button id="show-hint-button" disabled>Next</button><br><br>
                    <span class="hidden show-hint">
                        <p>Comment for single line //<br>
                        comment for multi line !--ok--<p>
                    </span>
                </div>
                <div class="text-muted">
                    <span id="answer"></span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-8 col-sm-offset-2">
                <div id="result-of-question" style="display: none;">
                    <span id="totalCorrect" class="pull-right"></span>
                    <table class="table table-hover table-responsive" >
                        <thead>
                            <tr>
                                <th>Question No.</th>
                                <th>Our answer</th>
                                <th>Your answer</th>
                                <th>Result</th>
                            </tr>
                        </thead>
                        <tbody id="quizResult"></tbody>
                    </table>
                </div>
            </div>
        </div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>