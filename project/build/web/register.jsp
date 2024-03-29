<%-- 
    Document   : register
    Created on : 30 Aug, 2018, 5:18:42 AM
    Author     : Nagamani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Register</title>
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
<meta charset="utf-8">
        
<meta http-equiv="X-UA-Compatible" content="IE=edge">
       
 <meta name="viewport" content="width=device-width, initial-scale=1">
        
        
<link rel="icon" href="img/fav-icon.png" type="image/x-icon" />
        
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        
<title>Bank - App Landing Page Template</title>

       
 <!-- Icon css link -->
        
<link href="css/font-awesome.min.css" rel="stylesheet">
       
 <link href="css/icofont.css" rel="stylesheet">
        
        
<!-- Bootstrap -->
        
<link href="css/bootstrap.min.css" rel="stylesheet">
        
        
<!-- Rev slider css -->
        
<link href="vendors/revolution/css/settings.css" rel="stylesheet">
       
 <link href="vendors/revolution/css/layers.css" rel="stylesheet">
        
<link href="vendors/revolution/css/navigation.css" rel="stylesheet">
        
<link href="vendors/animate-css/animate.css" rel="stylesheet">
        
        
<!-- Extra plugin css -->
<link href="vendors/magnific-popup/magnific-popup.css" rel="stylesheet">
        
<link href="vendors/owl-carousel/assets/owl.carousel.min.css" rel="stylesheet">
        
<link href="css/style.css" rel="stylesheet">
        
<link href="css/responsive.css" rel="stylesheet">

        
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        
<![endif]-->


</head>

<body>
<form name="f" method="get" action="register1">
<header class="dash_tp_menu_area">
            
<nav class="navbar navbar-default">
                
<!-- Brand and toggle get grouped for better mobile display -->
                
<div class="navbar-header">
                    
<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        
<span class="sr-only">Toggle navigation</span>
                        
<span class="icon-bar"></span>
                        
<span class="icon-bar"></span>
                        
<span class="icon-bar"></span>
                    
</button>
                    
              
</div>
<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    
<ul class="nav navbar-nav">
                        
<li class="active"><a href="index-4.jsp">Home</a></li>
 
                      
<li><a href="register.jsp">Register</a></li>
                        
<li><a href="index.jsp">Login</a></li>
                        
            
</ul>
                    
                
</div>
</nav>
        
</header>
        
<div class="limiter" id="id01">
		<div class="container-login100" style="background-image: url('images/pink-footer-bg.jpg');">
			<div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
				<form class="login100-form validate-form">
					<span class="login100-form-title p-b-49">
						Register
					</span>

					<div class="wrap-input100 validate-input m-b-23" data-validate = "Username is required">
						<span class="label-input100"><b>Username</b></span>
						<input class="input100" type="text" name="Username"   placeholder="Type your username" required/>
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>
                                               <div class="wrap-input100 validate-input m-b-23" data-validate = "Email is required">
						<span class="label-input100"><b>Email</b></span>
						<input class="input100" type="text" name="Email"  placeholder="Email" required />
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>
                       <div  data-validate = "security question">
                           <span class="label-input100"> <b>Choose a Security question</b></span><br/><br/>
            
                                           <select name="security">
                                               <option value="What is your favorite color?"><b>What is your favorite color?</b></option>
                                           <option value="What is the name of your school?"><b>What is the name of your school?</b></option>
                                           <option value="What is the name of your favorite pet?"><b>What is the name of your favorite pet?</b></option>
<option value<option value="What was the name of your first teacher?"><b>What was the name of your first teacher?</b></option>
                                             <option value="What were the last four digits of your telephone number?"><b>What were the last four digits of your telephone number?</b></option>
                                           </select>
                       </div><br>
                       <div class="wrap-input100 validate-input m-b-23" data-validate = "your answer">
						<span class="label-input100"><b>Your answer</b></span>
						<input class="input100" type="text" name="answer"  placeholder="your answer" required />
						<span class="focus-input100" data-symbol="&#xf206;"></span>
					</div>
					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn" >
							SUBMIT
							</button>
						</div>
					</div><br><br/>

                                                                         <div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn"  onclick="document.getElementById('id01').style.display='limiter'">
							<a href="index-4.html" style="color:white">	Cancel</a>
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
</form>
</body>
</html>