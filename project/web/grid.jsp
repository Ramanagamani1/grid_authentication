<%-- 
    Document   : grid
    Created on : 30 Aug, 2018, 5:12:22 AM
    Author     : Nagamani
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Grid</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->

</head>
<%
    String x=(String)session.getAttribute("name");
    
    if(x!=null)
    {   
        HttpSession s=request.getSession(false);
        String s1=(String)s.getAttribute("name");
        out.println("welcome "+x);
        
            %>
<body>
	<form name="f" method="get" action="grid">
	<div class="limiter" id="id01">
		<div class="container-login100" style="background-image: url('images/pink-footer-bg.jpg');">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
				<form class="login100-form validate-form">
					<span class="login100-form-title p-b-49">
						Grid Authentication
					</span>
                                                   	                  <div class="p-t-31 p-b-9">
						<span class="txt1">
						        <b>Labels</b>
						</span>
					</div>
					<div  >
                                            <input  type="text" class="wraps-input100" name="label1"  size=8 id="field10" readonly="readonly">
                                               <input  type="text" class="wraps-input100" name="label2"  size=8 id="field11"  readonly="readonly">
                                              <input  type="text" class="wraps-input100" name="label3"  size=8 id="field12"  readonly="readonly">

						
					</div>
                                                           <div class="p-t-13 p-b-9">
						<span class="txt1">
							<b>Password</b>
						</span>
                                                           </div>
					<div class=" validate-input" data-validate = "Password is required">
						<input type="text" name="pass1" class="wraps-input100" size=8 required/>
                                            <input  type="text" name="pass2" class="wraps-input100"  size=8 required/>
                                         <input  type="text" name="pass3" class="wraps-input100" size=8 required/>

						<span class="focus-input100"></span>
					</div><br><br><br>


                            		<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn" >
							<a href="index.html" style="font-size:15px; color:white">SUBMIT</a>
							</button>
						</div>
					</div><br><br/>

                                                                         <div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn" type="reset" onclick="document.getElementById('id01').style.display='limiter'">
								Cancel
							</button>
						</div>
					</div>
					
					
				</form>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>
<script type="text/javascript">
function randomNumber() {
    var min = 1;
    var max = 3;
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

document.getElementById('field10').value='A'+ randomNumber();
document.getElementById('field11').value='B'+ randomNumber();
document.getElementById('field12').value='C'+ randomNumber();
document.getElementById('field10').style.color="black";
document.getElementById('field11').style.color="black";
document.getElementById('field12').style.color="black";
</script>
<%
    session.invalidate();
    }
else{
PrintWriter out1=response.getWriter();
out1.println("<h3 align='center'>Login please!!</h3>");
RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
rd.include(request, response);

}
%>
</form>
</body>
</html>