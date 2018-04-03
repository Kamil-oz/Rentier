<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<title>Dodane mieszkania</title>
</head>
<body>
	<%@include file="../includes/header.jsp"%>
	<div class="row">
		<div class="col-1"></div>
		<div class="col-1">
			<div class="btn-group">
				<a href="add"><button class="btn btn-outline-success"
						type="button">Dodaj Mieszkanie</button></a> <a
					href="<c:url value="/hp/add/"/>"><button
						class="btn btn-outline-success" type="button">Dodaj
						Wyposażenie</button></a> <a href="<c:url value="/renovation/add/"/>"><button
						class="btn btn-outline-success" type="button">Dodaj
						ofertę wykończenia</button></a>
			</div>
			<div class="col-1"></div>
		</div>
	</div>

	<table class="table table-striped table-hover">
		<thead>
			<th>ID</th>
			<th>Cena</th>
			<th>m<sup>2</sup></th>
			<th>Adres</th>
			<th>Sypialnie</th>
			<th></th>
		</thead>
		<tbody>
			<c:forEach items="${flats}" var="flat">
				<tr>
					<td>${flat.label}</td>
					<td>${flat.price}PLN</td>
					<td>${flat.area }m<sup>2</sup></td>
					<td>${flat.address}</td>
					<td>${flat.bedrooms}</td>
					<td><nav class="navbar navbar-light">
						<form class="form-inline">

							<a href="../condition/add/${flat.id}"><button
									class="btn ${flat.flatCondition==null?'btn-outline-danger':'btn-outline-success' } btn-sm"
									type="button">${flat.flatCondition==null?'Oceń stan':'Ponownie onceń stan' }</button></a>
							<a href="../homeware/add/${flat.id}"><button
									class="btn ${flat.homeware==null?'btn-outline-danger':'btn-outline-success' } btn-sm"
									type="button">${flat.homeware==null?"Dodaj Wyposażenie":"Edytuj Wyposażenie" }</button></a>
							<a href="edit/${flat.id}"><button
									class="btn btn-outline-primary  btn-sm" type="button">Edytuj</button></a>
							<a href="delete/${flat.id}"><button
									class="btn btn-outline-danger btn-sm" type="button">Usuń</button></a>
						</form>
						</nav></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
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