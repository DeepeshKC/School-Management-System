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
	/*ul li {
		height: 50px;
	}*/
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
                    
                    <c:forEach items="${onlineExamList}" var="item">
                    	<div id="quiz" style="margin-button: 20px;">
                  
                        <div>
                            <h3><span class="label label-warning" id="qid">1</span>
                            <span id="question">${item.question1}</span>
                            </h3>
                        </div>
                        <ul class="question">
                          <li>
                            <input type="radio" class="inputoption" id="f-option" name="option1[]" value="1">
                            <label for="f-option" class="element-animation">${item.option1}</label>
                            <div class="check"></div>
                          </li>
                          
                          <li>
                            <input type="radio" class="inputoption" id="s-option" name="option2[]" value="2">
                            <label for="s-option" class="element-animation">${item.option2}</label>
                            <div class="check"><div class="inside"></div></div>
                          </li>
                          
                          <li>
                            <input type="radio" class="inputoption" id="t-option" name="option3[]" value="3">
                            <label for="t-option" class="element-animation">${item.option3}</label>
                            <div class="check"><div class="inside"></div></div>
                          </li>
                          
                          <li>
                            <input type="radio" class="inputoption" id="t-option" name="option4[]" value="3">
                            <label for="t-option" class="element-animation">${item.option4}</label>
                            <div class="check"><div class="inside"></div></div>
                          </li>
                        </ul>
                    </div>
                    </c:forEach>

                    
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