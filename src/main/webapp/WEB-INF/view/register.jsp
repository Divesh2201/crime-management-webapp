<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>
<body>

  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
	<form:form action="saveUser" modelAttribute="user" method="post">
    <form:hidden path="id" />
    
     <label for="username"><b>User name</b></label>
    <form:input type="text" placeholder="Enter Username" name="username"  path="username"/>
    
    <label for="address"><b>Address</b></label>
    <form:input type="text" placeholder="Enter Address" name="address" path="address"/>
    
    <label for="email"><b>Email</b></label>
    <form:input type="text" placeholder="Enter Email" name="email"  path="email"/>
    
     <label for="contact_number"><b>Contact Number</b></label>
    <form:input type="text" placeholder="Enter Contact Number" name="contact_number"  path="contact_number"/>

    <label for="psw"><b>Password</b></label>
    <form:input type="password" placeholder="Enter Password" name="psw"  path="password"/>
    
      <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>         
    
    </form:form>
    
    <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms and Privacy</a>.</p>


  </div>


</body>
</html>
