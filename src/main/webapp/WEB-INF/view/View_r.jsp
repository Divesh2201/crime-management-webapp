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
					<th colspan="2">Status</th>
					
				</tr>
				
				<!-- loop over and print our customers -->
				
				<c:forEach var="tempReport" items="${listRobberyComplaints}">
				
				<c:url var="deleteLink" value="/admin/deleteRobberyComplaints">
						<c:param name="recordId" value="${tempReport.id}" />
					</c:url>
					
				<c:url var="green" value="/admin/changeStatustoGreen">
						<c:param name="changeStatusId" value="${tempReport.id}" />
						<c:param name="changeStatusComplaintType" value="5" />
					</c:url>	
					
					<c:url var="red" value="/admin/changeStatustoRed">
						<c:param name="changeStatusId" value="${tempReport.id}" />
						<c:param name="changeStatusComplaintType" value="5" />
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
						<c:if test="${tempReport.status == 0}">
						<td>
							<a href="${green}"
							   onclick="if (!(confirm('Are you sure you want to Accept this record?'))) return false"><i style="color:green" class="far fa-check-circle"></i></a>
						</td>
						<td>
							<a href="${red}"
							   onclick="if (!(confirm('Are you sure you want to Reject this record?'))) return false"><i style="color:red" class="far fa-times-circle"></i></a>
						</td>
						</c:if>
						<c:if test="${tempReport.status == 1}">
							<td colspan="2" style="color:green"> Under Scrutiny</td>
						</c:if>
						<c:if test="${tempReport.status == 2}">
							<td colspan="2" style="color:red"> Rejected</td>
						</c:if>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
<p>
			<a href="/welcome">Back to Home</a>
		</p>
</body>

</html>






