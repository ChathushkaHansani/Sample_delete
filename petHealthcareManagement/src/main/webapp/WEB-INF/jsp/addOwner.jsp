<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Petowner</title>
<link href="assets/css/form.css" rel="stylesheet">
<link href="assets/css/bootstrap.css" rel="stylesheet">

</head>
<body>
	<div id="contact">
		<div class="section-content">
			<h1 class="section-header">
				Register<span class="content-header wow fadeIn"
					data-wow-delay="0.2s" data-wow-duration="2s"> Pet owner</span>
			</h1>
			<!-- <h3>Add Owner Information!</h3> -->
		</div>
		<div class="contact-section">
			<div class="container">
				<form:form commandName="owner">

					<div class="col-md-6"></div>
					<div class="col-md-6 container">
						<div class="form-group">
							<label for="exampleInputUsername">Your name</label>
							<form:input path="ownerName" />
						</div>
						<div class="form-group">
							<label for="exampleInputEmail">Address</label>
							<form:input path="ownerAddress" />

							<div class="form-group">
								<label for="telephone">Mobile No.</label>
								<form:input path="ownerMobile" />
							</div>
						</div>
						<div class="form-group">
							<label for="description"> NIC</label>
							<form:input path="ownerNIC" />
						</div>
						<div>

							<input type="submit" value="Save" class="btn btn-primary ">
							<!-- <button type="button" class="btn btn-default submit">
							<i class="fa fa-paper-plane" aria-hidden="true"></i> Send Message
						</button> -->
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>