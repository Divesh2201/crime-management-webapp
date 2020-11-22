<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>


<head>
    <title>File Felony Complain</title>
    <link rel='stylesheet' href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link href="css/welcome.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>


<body>
<script type="text/javascript">
            function ack(){
                alert("Your Complaint Acknowledgement Number is 5")
            }
        </script>
    <div class="section section-white" id="Contact">
        <div class="container">
            <div class="section-heading">
                <h3 align="center" style="font-size:40px"><b><u>Felony Record</u></b></h3><br>
            </div>
            <div class="para">Fill in all the details precisely.<br>We appreciate your co-operation.</div>
            <form:form action="saveFelony" onsubmit="ack()" modelAttribute="felony" method="post">
            <form:hidden path="id" />
                <form:input type="text" placeholder="First name" path="first_name"/>
                <form:input type="text" placeholder="Last name" path="last_name"/>
                <form:input type="text" placeholder="Age" path="age"/>
                <form:input type="text" placeholder="Felony_Committed" path="felony_committed"/>
                <form:input type="date" placeholder="Date of Incident" path="date"/>
                <form:input type="time" placeholder="Time of Incident" path="time"/>
                <form:input type="text" placeholder="Description" path="desc"/>
                <input type="submit" value="File Report" />
            </form:form>
            <br><br>
            <div class="para">Thankyou for your information, we will soon take some action.</div>
             <p>
			<a href="${pageContext.request.contextPath}/home">Back to Home</a>
		</p>
        </div>
    </div>
   

</body>