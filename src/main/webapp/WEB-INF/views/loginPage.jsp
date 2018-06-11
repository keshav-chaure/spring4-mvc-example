<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8"/>

    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>Login</title>
    <meta name="description" content=""/>
    <meta name="viewport" content="width=device-width"/>
<link rel='stylesheet' href='<c:url value="/resources/css/bootstrap.css" />' type='text/css' media='all' />
<link rel='stylesheet' href='<c:url value="/resources/css/login.css" />' type='text/css' media='all' />
<script type="text/javascript" src='<c:url value="/resources/javascript/bootstrap.js" />'></script>


</head>


<body onload='document.loginForm.username.focus();'>


    <form name='login' action="<c:url value='/loginPage' />" method='POST' >
      <div class="imgcontainer">
        <img src="https://www.w3schools.com/howto/img_avatar2.png" alt="Avatar" class="avatar">
        <c:if test="${not empty error}"><div>${error}</div></c:if>
        	<c:if test="${not empty message}"><div>${message}</div></c:if>
      </div>

      <div class="container">
        <label for="username"><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="username" required>

        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" required>

        <button  name="submit" type="submit" value="submit" >Login</button>

        <label>
          <input type="checkbox" checked="checked" name="remember"> Remember me
        </label>
      </div>

      <div class="container" style="background-color:#f1f1f1">
        <button type="button" class="cancelbtn">Cancel</button>
        <span class="psw">Forgot <a href="#">password?</a></span>
      </div>
       <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>



<script>
// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>
