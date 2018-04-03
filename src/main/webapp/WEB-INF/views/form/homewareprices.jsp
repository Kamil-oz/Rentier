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
	<form:form modelAttribute="homewarePrices" method="post">

		<table class="table table-striped table-hover">
			<thead>
				<th colspan="2" class="bg-info"><div class="input-group">
						<div class="input-group-prepend">
							<span class="input-group-text">Nazwa :</span>
						</div>
						<form:input path="label" placeholder="Twoja nazwa szablonu"
							class="form-control" />
					</div></th>


			</thead>
			<tbody>
				<c:forEach items="${homewarePricesMap}" var="record">
					<tr>
						<td>

							<div class="row">
								<div class="col-md-4">
									<div class="input-group">
										<div class="input-group-prepend">
											<span class="input-group-text">${record.value}</span>
										</div>
										<form:input type="number" path="${record.key}Cost" min="0"
											class="form-control" />
										<div class="input-group-append">
											<span class="input-group-text">PLN</span>
										</div>
									</div>
								</div>

								<div class="col-md-8">
									<div class="input-group">
										<div class="input-group-prepend">
											<span class="input-group-text">Link :</span>
										</div>
										<form:input path="${record.key}Link"
											placeholder="${record.value}" class="form-control" />
									</div>
								</div>
							</div>
						</td>
					</tr>
				</c:forEach>
				<tr>
					<td>
						<button type="submit" class="btn btn-success">Potwierdź</button>
					</td>
				</tr>
			</tbody>
		</table>
	</form:form>


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