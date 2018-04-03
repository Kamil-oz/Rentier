<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<nav class="navbar navbar-expand-md navbar-light bg-warning"> <a
	class="navbar-brand" href="#"> <img
	src="<c:url value="/static/img/logo.png"/>" width="32" height="32"
	class="d-inline-block align-top" alt="Rentier"> Rentier.pl </a>
<div class="collapse navbar-collapse" id="mainNavigation">
	<ul class="navbar-nav mr-auto">
		<li class="nav-item active"><a class="nav-link"
			href="<c:url value="/home"/>"><button type="button" class="btn btn-outline-dark"> Start</button></span></a></li>
		<li class="nav-item"><a class="nav-link"
			href="<c:url value="/flat/all"/>"><button type="button" class="btn btn-outline-dark">Mieszkania</button></a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="<c:url value="/ofer/add"/>"><button type="button" class="btn btn-outline-dark">Oferty</button></a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="<c:url value="/hp/add/"/>"><button type="button" class="btn btn-outline-dark">Wyposażenie</button></a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="<c:url value="/renovation/add/"/>"><button type="button" class="btn btn-outline-dark">Remonty</button></a>
		</li>
	
	</ul>
</div>
  <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#mainNavigation" aria-controls="mainNavigation" aria-expanded="false" aria-label="Pokaż lub ukryj nawigację">
	<span class="navbar-toggler-icon"></span>
  </button>

</nav>