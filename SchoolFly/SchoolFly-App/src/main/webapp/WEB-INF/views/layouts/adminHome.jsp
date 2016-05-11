<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
     <!-- Favicon-->
    <link rel="shortcut icon" href="img/icons/favicon.ico" type="image/x-icon">

     <title><tiles:insertAttribute name="title" ignore="true"></tiles:insertAttribute></title>
    <!-- Vendor CSS-->
    <link rel="stylesheet" href="libs/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="libs/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="libs/animate/animate.css">
    <link rel="stylesheet" href="libs/owl-carousel/owl.carousel.css">
    <link rel="stylesheet" href="libs/owl-carousel/owl.theme.css">
    <link rel="stylesheet" href="libs/nivo-lightbox/nivo-lightbox.css">
    <link rel="stylesheet" href="libs/nivo-lightbox/themes/default/default.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    
    <link rel="stylesheet" href="css/simple-sidebar.css">
	
</head>
<body>

    <nav class="navbar navbar-default no-margin navbar-2">
          <div class="navigation container" >
            <!-- Nav Bar Toggle/collapse and Logo-->
            <div class="navbar-header">
              <div class="navbar-brand"><a href="kidzone"><img src="img/logo.png" alt=""/></a></div>
            </div>
          </div>
           <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
              <ul class="nav navbar-nav">
                  <li class="active" ><button class="navbar-toggle collapse in" data-toggle="collapse" id="menu-toggle-2"> <span class="glyphicon glyphicon-th-large" aria-hidden="true"></span></button></li>
              </ul>
         </div>
      </nav>
    <div id="wrapper" class='toggled-2'>
        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav nav-pills nav-stacked" id="menu">
 
                <li class="active">
                    <a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-dashboard fa-stack-1x "></i></span> Dashboard</a>
                    <!-- <ul class="nav-pills nav-stacked" style="list-style-type:none;">
                        <li><a href="#">link1</a></li>
                        <li><a href="#">link2</a></li>
                    </ul> -->
                </li>
                <li>
                    <a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-flag fa-stack-1x "></i></span> Teacher</a>
                    <ul class="nav-pills nav-stacked" style="list-style-type:none;">
                        <li><a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-flag fa-stack-1x "></i></span>Add Teacher</a></li>
                        <li><a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-flag fa-stack-1x "></i></span>View Teacher</a></li>
 
                    </ul>
                </li>
                <li>
                    <a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-cloud-download fa-stack-1x "></i></span>Parent</a>
					<ul class="nav-pills nav-stacked" style="list-style-type:none;">
                        <li><a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-flag fa-stack-1x "></i></span>Add Parent</a></li>
                        <li><a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-flag fa-stack-1x "></i></span>View Parent</a></li>
 
                    </ul>
                </li>
                <li>
                    <a href="#"> <span class="fa-stack fa-lg pull-left"><i class="fa fa-cart-plus fa-stack-1x "></i></span>Student</a>
					<ul class="nav-pills nav-stacked" style="list-style-type:none;">
                        <li><a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-flag fa-stack-1x "></i></span>Add Student</a></li>
                        <li><a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-flag fa-stack-1x "></i></span>View Student</a></li>
 
                    </ul>
                </li>
                <!-- <li>
                    <a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-youtube-play fa-stack-1x "></i></span>About</a>
					<ul class="nav-pills nav-stacked" style="list-style-type:none;">
                        <li><a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-flag fa-stack-1x "></i></span>link1</a></li>
                        <li><a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-flag fa-stack-1x "></i></span>link2</a></li>
 
                    </ul>
                </li>
                <li>
                    <a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-wrench fa-stack-1x "></i></span>Services</a>
                </li> -->
                <li>
                    <a href="#"><span class="fa-stack fa-lg pull-left"><i class="fa fa-server fa-stack-1x "></i></span>Contact</a>
                </li>
            </ul>
        </div><!-- /#sidebar-wrapper -->
        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="row">
              <div class="col-md-9 button-container">
				<table class="table table-striped table-fixed display cell-border"  id="appsNReleasesDataTable" cellspacing="0" width="100%" >
					<thead class="table-head">
					  <tr>
						<th>Teachers</th>
						<th>Parents</th>
						<th>Students</th>
				        <th>Events</th>
					  </tr>
					</thead>
					<tbody>											
					</tbody>
				 </table>
           </div>
          </div>
       </div>
        <!-- /#page-content-wrapper -->
    </div>
    <!-- /#wrapper -->
    <!-- jQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    
    
    	<!-- Vendor jQuery-->
    <script type="text/javascript" src="libs/jquery/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="libs/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="libs/smoothscroll/SmoothScroll.js"></script>
    <script type="text/javascript" src="libs/owl-carousel/owl.carousel.min.js"></script>
    <script type="text/javascript" src="libs/nivo-lightbox/nivo-lightbox.min.js"></script>
    <script type="text/javascript" src="libs/isotope/isotope.pkgd.min.js"></script>
    <script type="text/javascript" src="libs/masonry/masonry.min.js"></script>
    <script type="text/javascript" src="libs/waypoints/jquery.waypoints.min.js"></script>
    <script type="text/javascript" src="libs/count-up/countUp.js"></script>
    <script type="text/javascript" src="libs/owl-carousel/carousel.min.js"></script>
    <script src="http://code.jquery.com/jquery-2.1.4.min.js" data-semver="2.1.4" data-require="jquery@2.1.4"></script>
    <script data-require="jquery-cookie@1.3.1" data-semver="1.3.1" src="//cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.3.1/jquery.cookie.js"></script>
    <!-- Theme Script-->
    <script type="text/javascript" src="js/sidebar_menu.js"></script>
</body>
</html>