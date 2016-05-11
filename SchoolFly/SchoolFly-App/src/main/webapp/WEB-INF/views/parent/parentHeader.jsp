
<%-- <% String username = (String)request.getSession().getAttribute("firstname"); %> --%>
 <nav class="navbar navbar-2">
          <!-- Search Form-->
          <form method="get" action="#" class="search-form container">
           <!--  <div>
              <input type="search" name="search-field" placeholder="Type and hit enter..." class="text-search-field"/><i id="close-btn" class="fa fa-close"></i>
            </div> -->
          </form>
          <div class="navigation container">
            <!-- Nav Bar Toggle/collapse and Logo-->
            <div class="navbar-header">
              <div class="navbar-brand"><a href="kidzone"><img src="img/logo.png" alt=""/></a></div>
              <!-- Navigation Toggle-->
              <!-- <button type="button" data-toggle="collapse" data-target=".myNavbar" class="navbar-toggle"><span class="src-only"></span><i class="fa fa-bars"></i></button>
              <div class="search-nav min"><i class="fa fa-search"></i></div> -->
            </div>
            <!-- Collpsing Items and Navigation-->
            <div class="myNavbar collapse navbar-collapse">
              <ul class="nav navbar-nav navbar-right">
                <!-- Item 1-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="selected dropdown-toggle">Home</a>
                  
                </li>
                <!-- Item 2-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Performance</a>
                  
                </li>
                <!-- Item 3-->
                 <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Time Table</a>
                  
                </li>
                <!-- Item 4-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Result</a>
                  
                </li>
                <!-- Item 5-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Assignment</a>
                  
                </li>
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Exam</a>
                  
                </li>
                <!-- Item 7-->
                <!-- <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Gallery</a>
                  
                </li> -->
                <!-- <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Transport</a>
                  
                </li>
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Event</a>
                  
                </li>
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Workshope</a>
                  
                </li> -->
                <!-- Search Icon-->
                <!-- <li class="menu-item">
                  <div class="search-nav big"><i class="fa fa-angle-double-down" aria-hidden="true"></i>
                  <ul class="sub-menu">
                    <li><a href="index.html">Home Color</a></li>
                    <li><a href="kidzone">Home Classic</a></li>
                  </ul>
                  </div>
                </li> -->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="selected dropdown-toggle">More<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="index.html">Gallery</a></li>
                    <li><a href="kidzone">Transport</a></li>
                    <li><a href="kidzone">Event</a></li>
                    <li><a href="kidzone">Workshope</a></li>
                    <li><a href="kidzone">Profile</a></li>
                    <li><a href="logout">Logout</a></li>
                  </ul>
                </li>
                
              </ul>
            </div>
	         <div class="newsletter-wrapper">
		          <!-- Content-->
		          <div class="newsletter-inside row">
		            <!-- Title-->
		            <div class="col-lg-2 col-md-3">
		            </div>
		            <!-- Subcribtion Form-->
		            <div class="col-lg-6 col-md-3 ">
		            </div>
		            <!-- Phone-->
		            <div class="col-lg-4 col-md-6 row">
		               <div class="col-lg-6 col-md-3 ">
		                </div>
		              <div class="col-lg-4 col-md-6">
		                <h4><i class="fa fa-user"></i> Hi, <%-- <%=username %> --%></h4>
		              </div>
		            </div>
		          </div>
	         </div>
          </div>
   </nav>