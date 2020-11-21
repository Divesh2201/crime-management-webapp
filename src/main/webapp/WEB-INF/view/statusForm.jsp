<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>View Status Of Your Complaint</title>
	
	<!-- reference our style sheet -->

	 <link rel='stylesheet' href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link href="css/welcome.css" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.1/css/all.css" integrity="sha384-vp86vTRFVJgpjF9jiIGPEEqYqlDwgyBgEF109VFjmqGmIY/Y4HV4d3Gp2irVfcrp" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>

<style>
.input-complaint{
font-size:18px;
font-weight:bold;

}
.input-btn
{
color:#292b2c;
background-color:white;
font-weight:bold;
font-size:18px;

}
.input-btn:hover{

color:white;
background-color:#292b2c;
font-weight:bold;
font-size:18px;
}
</style>

<body style="background-color:#292b2c;color:white">
	<div class="container" style="text-align:center">
	  <h2 style="text-decoration:underline">View Status Of Your Complaint</h2>
	  <p style="text-align:left;font-size:25px;margin-top:30px">Enter your acknowledgment id and use the dropdown-menu below to choose the type of crime reported .</p>
	 
	 	<c:url var="getStatus" value="/admin/getStatus">
			<c:param name="statusId" value="${statusId}" />
			<c:param name="complaintType" value="${complaintType }"/>
		</c:url>
		
     	<form:form action="/admin/getStatus" style="text-align:center">	
          <label  style="font-size:25px">Acknowledgment Id :</label>
		<br>
	  	<input style="margin:auto;width:200px" type="number" name="statusId" min="1"/>
	  	<br>
	   
	   
		   <label style="font-size:22px;font-weight:bold"for="complaints">Choose the type of complaint:</label>
		   <br>
	  <select class="input-complaint id="complaints" name="complaintType" size="3">
		    <option style="padding:10px" value="1">CyberCrime</option>
		    <option style="padding:10px" value="2">Extortion</option>
		    <option style="padding:10px" value="3">Felony</option>
		    <option style="padding:10px" value="4">Missing</option>
		    <option style="padding:10px" value="5">Robbery</option>   
		</select>
	  <br><br>
		
			<input class="input-btn" style="margin:auto;width:200px" type="submit" value="Check Status"/>
		
	  </form:form>
	  
	</div>

	
</body>



</html>






