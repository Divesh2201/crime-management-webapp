<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
	<title>View Extortion Complaints</title>
	
	<!-- reference our style sheet -->


	 <link rel='stylesheet' href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link href="css/welcome.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2 style="text-align:center;margin:20px">View Extortion Complaints</h2>
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
					<th>Amount</th>
					<th>Date Of Incident</th>
					<th>Time Of Incident</th>
					<th>Description</th>
					
				</tr>
				
				<!-- loop over and print our customers -->
				
				<c:forEach var="tempReport" items="${listExtortionComplaints}">
				
					<tr>
						<td> ${tempReport.first_name} </td>
						<td> ${tempReport.last_name} </td>
						<td> ${tempReport.age} </td>
						<td> ${tempReport.amt} </td>
						<td> ${tempReport.date} </td>
						<td> ${tempReport.time} </td>
						<td> ${tempReport.desc} </td>	
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>






