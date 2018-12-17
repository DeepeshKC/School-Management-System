
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Question Paper</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">Question Paper</div>

				<div class="panel-body">
					<div class="row">
						<div class="col-lg-offset-3 col-lg-6">
							<form:form name="qryform" method="POST" action="add-addQuestion"
								modelAttribute="questionPaper">
								<div class="form-group">
									<label>Please Add Question Paper Name</label>
									<form:input path="questionPaperName" class="form-control"
										placeholder="Enter question paper name" />
								</div>

								<div class="form-group">
									<label>Please Add Question 1</label>
									<form:input path="question1" class="form-control"
										placeholder="Enter question 1" />
								</div>
								<div class="form-group">
									<label>Please Add Answer A</label>
									<form:input path="option1" class="form-control"
										placeholder="Enter option" />
								</div>
								<div class="form-group">
									<label>Please Add Answer B</label>
									<form:input path="option2" class="form-control"
										placeholder="Enter option" />
								</div>

								<div class="form-group">
									<label>Please Add Answer C</label>
									<form:input path="option3" class="form-control"
										placeholder="Enter option" />
								</div>

								<div class="form-group">
									<label>Please Add Answer D</label>
									<form:input path="option4" class="form-control"
										placeholder="Enter option" />
								</div>
								<div class="form-group">
									<label>Please Add Right Answer</label>
									<form:select path="rightAnswer" class="form-control"> 
										<form:option value="a">A</form:option>
										<form:option value="b">B</form:option>
										<form:option value="c">C</form:option>
										<form:option value="d">D</form:option>
									</form:select>
								</div>

								<button type="submit" class="btn btn-success">Submit</button>
								<button type="reset" class="btn btn-default">Reset</button>
							</form:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
