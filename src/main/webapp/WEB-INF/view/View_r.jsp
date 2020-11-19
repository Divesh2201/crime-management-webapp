<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
	<title>View Robbery Complaints</title>
	
	<!-- reference our style sheet -->

	<link rel='stylesheet' href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link href="css/welcome.css" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.1/css/all.css" integrity="sha384-vp86vTRFVJgpjF9jiIGPEEqYqlDwgyBgEF109VFjmqGmIY/Y4HV4d3Gp2irVfcrp" crossorigin="anonymous">

    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2 style="text-align:center;margin:20px">View Robbery Complaints</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		

			
			<!--  add our html table here -->
		
			<table class="table table-bordered table-striped table-dark" style="text-align:center">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
					<th>Amount Robbed</th>
					<th>Date Of Incident</th>
					<th>Time Of Incident</th>
					<th>Description</th>
					<th>Action</th>
					
				</tr>
				
				<!-- loop over and print our customers -->
				
				<c:forEach var="tempReport" items="${listRobberyComplaints}">
				
				<c:url var="deleteLink" value="/admin/deleteRobberyComplaints">
						<c:param name="recordId" value="${tempReport.id}" />
					</c:url>
					
				
					<tr>
						<td> ${tempReport.first_name} </td>
						<td> ${tempReport.last_name} </td>
						<td> ${tempReport.age} </td>
						<td> ${tempReport.amt} </td>						
						<td> ${tempReport.date} </td>
						<td> ${tempReport.time} </td>
						<td> ${tempReport.desc} </td>	
						<td>
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this record?'))) return false"><i style="color:white" class="fas fa-trash"></i></a>
						</td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>






