<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<!-- Required meta tags -->
<meta charset="utf-8">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Bootstrap CSS -->
		<link rel="stylesheet"
			href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
			integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
			crossorigin="anonymous">
			<title>${title}</title>
</head>
<body>
	<%@include file="../includes/header.jsp"%>
	<div class="container">
		<div class="col-xs-12 col-sm-12  col-sm-offset-3">


			<div class="panel">
				<div class="panel-body">
					<form:form modelAttribute="homeware" method="post">
						<fieldset>
							<!-- Form Name -->
							<legend>Co musisz dokupić?</legend>

							<!-- Multiple Checkboxes -->
							<div class="form-group">
								<label class="col-md-6 control-label" for="checkboxes"></label>
								<div class="col-md-6">
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="owen" id="checkboxSuccess" />
											Kuchenka
										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-0"> <form:checkbox
												class="bg-info" path="kettle" id="checkboxSuccess" />
											Czajnik
										</label>
									</div>

									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="kitchenSupplies" id="checkboxSuccess" />
											Wyposażenie kuchni

										</label>
									</div>


									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="microwave" id="checkboxSuccess" />
											Mikrofalówka

										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="fidge" id="checkboxSuccess" />
											Lodówka


										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="kitchenTable" id="checkboxSuccess" />
											Stół
										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="vacumcleaner" id="checkboxSuccess" />
											Odkurzacz
										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="cleaningSupplies" id="checkboxSuccess" />
											Środki czystości
										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="washingMachine" id="checkboxSuccess" />
											Pralka

										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="dryier" id="checkboxSuccess" />
											Suszarka
										</label>
									</div>

									<div class="input-group">
										<div class="input-group-prepend col-sm-3">
											<div class="input-group-text col-sm-12">Łóżka:</div>
										</div><form:input type="number" path="numberOfBedsToBuy"
											placeholder="Ile jest sypialni?" min="0"
											class="form-control col-sm-2" />
									</div>
									<div class="input-group">
										<div class="input-group-prepend col-sm-3">
											<div class="input-group-text col-sm-12">Szafy:</div>
										</div><form:input type="number" path="numberOfWardrobesToBuy"
											placeholder="Ile jest sypialni?" min="0"
											class="form-control col-sm-2" />
									</div>
									<div class="input-group">
										<div class="input-group-prepend col-sm-3">
											<div class="input-group-text col-sm-12">Krzesła:</div>
										</div><form:input type="number" path="numberOfChairsToBuy"
											placeholder="Ile jest sypialni?" min="0"
											class="form-control col-sm-2" />
									</div>
									<div class="input-group">
										<div class="input-group-prepend col-sm-3">
											<div class="input-group-text col-sm-12">Biurka:</div>
										</div>
										<form:input type="number" path="numberOfDesksToBuy"
										 min="0"
											class="form-control col-sm-2" />
									</div>


								</div>
							</div>

						</fieldset>






						<p>
							<button type="submit" class="btn btn-primary">Potwierdź</button>
						</p>
					</form:form>
				</div>
			</div>
		</div>
	</div>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>