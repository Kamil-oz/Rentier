<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>${title}</title>
</head>
<body>
<%@include file="../includes/header.jsp" %>
<div class="container">
    <div class="col-xs-12 col-sm-6 col-sm-offset-3">
        <div class="page-header">
            <h1>${title}</h1>
        </div>

        <div class="panel">
            <div class="panel-body">
              <form:form modelAttribute="flat" method="post">
                    <div class="form-group">
                        <label>Nazwa:</label>
                       	<form:input path="label" placeholder="label" class="form-control"/>
                        <label>Adres:</label>
                        <form:input path="address" placeholder="Adres" class="form-control"/>
                        <label>Cena:</label>
                        <form:input type="number" path="price" placeholder="Cena w PLN" min="0" class="form-control"/>
                        <label>Wielkość:</label>
                        <form:input type="number" path="area" placeholder="W metrach^2" min="0" class="form-control"/>
                        <label>Ilość pokoi:</label>
                        <form:input type="number" path="bedrooms" placeholder="Ile jest sypialni?" min="1" class="form-control"/>
                       <label>Opis:</label>
                        <form:textarea path="description" placeholder="Opis" class="form-control" rows="3"/>
                        <label>Kontakt:</label>
                        <form:input path="contact" placeholder="Osoba kontaktowa - telefon" class="form-control"/>
                        </div>
                    <p>
                        <button type="submit" class="btn btn-primary">Potwierdź</button> 
                    </p>
                </form:form>
            </div>
        </div>
    </div>
</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>