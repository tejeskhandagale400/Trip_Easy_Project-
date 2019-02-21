<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${message}</h1>
<h1>SIGN UP PAGE</h1>
<form action="create" method="post">
      Enter Full Name <input type="text" name="fullName"/><br/>
      Enter  EmailId <input type="text" name="emailId"/><br/>
      Date Of Birth <input type="date" name="dateOfBirth" /><br/>      
      Enter Contact Number <input type="text" name="contactNumber"/><br/>
      Gender :<input type="radio" name="gender" value="male"> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
      Martial Status: <input name="maritialStatus"/><br/>
     streetName <input name="address.streetName"/><br/>
     streetNo <input name="address.streetNo"/><br/>
       state: <input name="address.state"/><br/>
        pin code: <input name="address.pincode"/><br/>
      <br>
     <input type="submit"/>
</form>
</body>
</html>

