<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- HTML start -->
<html lang="en">

<!-- HTML page encoding -->
<meta http-equiv="Content-Type" content="text/html;utf-8">


<!-- Start page head -->
<head>
<!-- Page title -->
<title>Email Sender</title>

<!-- CSS Bootstrap -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/custom.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
</head>
<!-- End head -->

<!-- Body -->
<body id="page-top" class="index">
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-top">
					<span class="sr-only"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" id="aka-brand" href="#page-top"><spring:message
						code="main.title-brand" /></a>
			</div>
			<div class="collapse collapseTOP navbar-collapse"
				id="bs-example-navbar-collapse-top">
				<ul class="nav navbar-nav navbar-right">
					<li class="hidden"><a href="#page-top"></a></li>
					<li class="page-scroll"><a href="#try-send"><spring:message
								code="main.try_send" /></a></li>
					<li class="page-scroll"><a href="#sign-in"><spring:message
								code="main.sign-in" /></a>
				</ul>
			</div>
		</div>
	</nav>
	<nav class="navbar navbar-default navbar-fixed-bottom">

		<div class="container">
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-bottom">
					<span class="sr-only"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
				</button>
			</div>

			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-bottom">
				<ul class="nav navbar-nav navbar-right list-inline">
					<li class="page-scroll"><a href="#about"><spring:message
								code="main.about" /></a></li>
					<li class="page-scroll"><a href="#contact"><spring:message
								code="main.contact" /></a></li>
					<li><a class='i18n-link' href="?mylocale=en"><spring:message
								code="internationalization.eng" /></a></li>
					<li><a class='i18n-link' href="?mylocale=ru"><spring:message
								code="internationalization.ru" /></a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!--  Need to get out this i18n and put to footer -->

	<!-- jQuery -->
	<script src="resources/js/jquery.js"></script>
	<!-- Main js -->
	<script src="resources/js/main.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="resources/js/bootstrap.min.js"></script>
</body>
<!-- HTML end -->

</html>