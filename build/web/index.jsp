<!DOCTYPE html>
<html>
    <title>Bienvenido a PrendasNET</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/jquery.fancybox.css">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/responsive.css">
    <link rel="stylesheet" href="css/animate.min.css">
    <link rel="stylesheet" href="css/w3-css.css">
    <link rel="stylesheet" href="css/indexStyle.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
    body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
    body, html {
        height: 100%;
        line-height: 1.8;
    }
    /* Full height image header */
    .bgimg-1 {
        background-position: center;
        background-size: cover;
        background-color: #673ab7;
        min-height: 100%;
    }
    .w3-bar .w3-button {
        padding: 16px;
    }
    </style>
    <body>

        <!-- Navbar (sit on top) 
        <div class="w3-top">
            <div class="w3-bar w3-black w3-card" id="myNavbar" style="opacity: 0.2;">
            <a href="#home" class="w3-bar-item w3-button w3-wide">LOGO</a>
            <!-- Right-sided navbar links 
            <div class="w3-right w3-hide-small">
              <a href="#about" class="w3-bar-item w3-button">ABOUT</a>
              <a href="#team" class="w3-bar-item w3-button"><i class="fa fa-user"></i> TEAM</a>
              <a href="#work" class="w3-bar-item w3-button"><i class="fa fa-th"></i> WORK</a>
              <a href="#pricing" class="w3-bar-item w3-button"><i class="fa fa-usd"></i> PRICING</a>
              <a href="#contact" class="w3-bar-item w3-button"><i class="fa fa-envelope"></i> CONTACT</a>
            </div>
            <!-- Hide right-floated links on small screens and replace them with a menu icon 

            <a href="javascript:void(0)" class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium" onclick="w3_open()">
              <i class="fa fa-bars"></i>
            </a>
          </div>
        </div>-->
         
        <!--top of the page-->
        <div class="w3-top">
            <div class="w3-right w3-hide-small w3-margin">
                <a href="templates/login.jsp" class="w3-button w3-border w3-round w3-button w3-white w3-padding-large w3-large w3-opacity w3-hover-opacity-off">Ingresar</a>
                <a href="templates/login.jsp" class="w3-button w3-border w3-round w3-button w3-white w3-padding-large w3-large w3-opacity w3-hover-opacity-off">Registrate</a>
            </div>
            <div>
                <a href="#"><img class="resize w3-margin" src="img/prendaspnet.png" alt="PrendasNET"></a>
            </div>
            <a href="javascript:void(0)" class="w3-bar-item w3-button w3-right w3-hide-large w3-hide-medium" onclick="w3_open()">
              <i class="fa fa-bars"></i>
            </a>
        </div>
        <!--top of the page-->

        <!-- Sidebar on small screens when clicking the menu icon -->
        <nav class="w3-sidebar w3-bar-block w3-black w3-card w3-animate-left w3-hide-medium w3-hide-large" style="display:none" id="mySidebar">
          <a href="javascript:void(0)" onclick="w3_close()" class="w3-bar-item w3-button w3-large w3-padding-16">Close ×</a>
          <a href="#about" onclick="w3_close()" class="w3-bar-item w3-button">ABOUT</a>
          <a href="#team" onclick="w3_close()" class="w3-bar-item w3-button">TEAM</a>
          <a href="#work" onclick="w3_close()" class="w3-bar-item w3-button">WORK</a>
          <a href="#pricing" onclick="w3_close()" class="w3-bar-item w3-button">PRICING</a>
          <a href="#contact" onclick="w3_close()" class="w3-bar-item w3-button">CONTACT</a>
        </nav>

        <!-- Header with full-height image -->
        <header class="bgimg-1 w3-display-container w3-grayscale-min" id="home">
          <div class="w3-display-left w3-text-white" style="padding:48px">
            <span class="w3-jumbo w3-hide-small">Bienvenido a PrendasNET</span><br>
            <!--small devices-->
            <span class="w3-xxlarge w3-hide-large w3-hide-medium">Bienvenido a prendasNET</span><br>
            <span class="w3-large">Creado por Cimera</span>
            <!--<p><a href="#about" class="w3-button w3-white w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-off">lets add a button</a></p>-->
          </div> 
        </header> 

        <!-- Footer -->
        <footer class="section footer">
          <div class="footer-bottom">
            <div class="container">
              <div class="col-md-12">
                <p>
                <ul class="footer-share">
                  <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                  <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                  <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                  <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                  <li><a href="#"><i class="fa fa-pinterest-p"></i></a></li>
                  <li><a href="#"><i class="fa fa-vimeo"></i></a></li>
                </ul>
                </p>
                <p>© 2017 All rights reserved. All Rights Reserved<br>
                  Made with <i class="fa fa-heart pulse"></i> by <a href="http://www.designstub.com/">Designstub</a></p>
              </div>
            </div>
          </div>
        </footer>
        <!--footer-->
        
        <script src="https://apis.google.com/js/platform.js" async defer></script>
        <script>
        // Toggle between showing and hiding the sidebar when clicking the menu icon
        var mySidebar = document.getElementById("mySidebar");

        function w3_open() {
            if (mySidebar.style.display === 'block') {
                mySidebar.style.display = 'none';
            } else {
                mySidebar.style.display = 'block';
            }
        }

        // Close the sidebar with the close button
        function w3_close() {
            mySidebar.style.display = "none";
        }
        </script>

    </body>
</html>
