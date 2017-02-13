<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Registration</title>
</head>
<body style="background-color: 	#F0FFF0;">

<div class="container">
	<div class="row"> 
        
        <form:form method="post" action="save"  class="form-horizontal">
		<fieldset>

		<legend>Register Here</legend>



		<div class="form-group">
  			<label class="col-md-4 control-label" for="firstName">First Name</label>  
  			<div class="col-md-4">
  				<input id="firstName" name="firstName" placeholder="Insert your First Name" class="form-control input-md" required="" type="text">
  				<span class="help-block"> </span>  
  			</div>
		</div>


		<div class="form-group">
		  	<label class="col-md-4 control-label" for="lastName">Last Name</label>  
		  	<div class="col-md-4">
		  		<input id="lastName" name="lastName" placeholder="Insert your Last Name" class="form-control input-md" required="" type="text">
		  		<span class="help-block"> </span>  
		  	</div>
		</div>


		<div class="form-group">
		  	<label class="col-md-4 control-label" for="email">Email</label>  
		  	<div class="col-md-4">
		  		<input id="email" name="email" placeholder="Insert your Email" class="form-control input-md" required=""t type="email">
		  		<span class="help-block"> </span>  
		  	</div>
		</div>
		

		<div class="form-group">
		  	<label class="col-md-4 control-label" for="password">Password</label>  
		  	<div class="col-md-4">
		  		<input id="password" name="password" placeholder="Insert your Password" class="form-control input-md" required="" type="password">
		  		<span class="help-block"> </span>  
		  	</div>
		</div>


		<div class="form-group">
		  	<label class="col-md-4 control-label" for="cpassword">Confirm Password</label>  
		  	<div class="col-md-4">
		  		<input id="cpassword" name="cpassword" placeholder="Confirm your Password" class="form-control input-md" required="" type="text">
		  		<span class="help-block"> </span>  
		  	</div>
		</div>

		<div class="form-group">
		  <label class="col-md-4 control-label" for="textinput">Resume</label>
		  <div class="col-md-4">
		  	<label class="custom-file">
  				<input type="file" id="file" class="custom-file-input">
  				<span class="custom-file-control"></span>
			</label>
		    
		  </div>

		</div>


		<div class="form-group">
		  <label class="col-md-4 control-label" for="submitBtn"> </label>
		  <div class="col-md-4">
		    <button id="submitBtn" name="submitBtn" class="btn btn-primary">Submit</button>
		  </div>
		</div>




		</fieldset>
		</form:form>
  
	</div>
</div>

</body>
</html>