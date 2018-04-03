<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<form:form modelAttribute="condition" method="post">
		<table class="table table-striped table-hover">
			<thead>
				<th></th>
			</thead>
			<tbody>
				<c:forEach items="${flatConditionMap}" var="record">
					<tr>
						<td>
							<div class="row">
								<div class="col col-sm-offset-3">
									<div class="form-group">
										<form:checkbox path="${record.key}" />
										<label>${record.value}</label>
									</div>
								</div>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<button type="submit" class="btn btn-primary">Potwierdź</button>
	</form:form>



	<div class="container">
		<div class="col-xs-12 col-sm-12 col-sm-offset-3">
			<div class="panel">
				<div class="panel-body">
					<form:form modelAttribute="condition" method="post">
						<fieldset>
							<!-- Form Name -->
							<legend>Co należy wyremontować?</legend>

							<!-- Multiple Checkboxes -->
							<div class="form-group">
								<label class="col-md-6 control-label" for="checkboxes"></label>
								<div class="col-md-6">
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="floor" id="checkboxSuccess" />
											Położyć panele
										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-0"> <form:checkbox
												class="bg-info" path="walls" id="checkboxSuccess" />
											Położyć gładzie
										</label>
									</div>

									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="painting" id="checkboxSuccess" />
											Pomalować ściany

										</label>
									</div>


									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="frontDoor" id="checkboxSuccess" />
											Wymienić drzwi wejściowe

										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="indorDoor" id="checkboxSuccess" />
											Wymienić drzwi wewnętrzne


										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="window" id="checkboxSuccess" />
											Wymienić okna
										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="changeHeatingSystem"
												id="checkboxSuccess" /> Wymienić system ogrzewania
										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="electricity" id="checkboxSuccess" />
											Wymienić instalację elektryczną
										</label>
									</div>
									<div class="checkbox">
										<label for="checkboxes-1"> <form:checkbox
												class="bg-info" path="balcony" id="checkboxSuccess" />
											Wyremontować balkon

										</label>
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