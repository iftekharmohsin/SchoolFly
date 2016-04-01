<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>KidZone | Blog Details</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Favicon-->
    <link rel="shortcut icon" href="img/icons/favicon.ico" type="image/x-icon">

    <!-- Web Fonts-->
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lobster" rel="stylesheet" type="text/css">

    <!-- Vendor CSS-->
    <link rel="stylesheet" href="libs/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="libs/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="libs/animate/animate.css">

    <!-- Theme CSS-->
    <link rel="stylesheet" href="css/style.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries-->
    <!-- WARNING: Respond.js doesn't work if you view the page via file://-->
    <!--if lt IE 9
    script(src='https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js')
    script(src='https://oss.maxcdn.com/respond/1.4.2/respond.min.js')
    
    -->
  </head>
  <body>
    <div id="preloaderKDZ"></div>

    <div id="site" class="site">
      <div class="header">
        <!-- Navigation-->
        <nav class="navbar navbar-1">
          <!-- Search Form-->
          <form method="get" action="#" class="search-form container">
            <div>
              <input type="search" name="search-field" placeholder="Type and hit enter..." class="text-search-field"/><i id="close-btn" class="fa fa-close"></i>
            </div>
          </form>
          <div class="navigation container">
            <!-- Nav Bar Toggle/collapse and Logo-->
            <div class="navbar-header">
              <div class="navbar-brand"><a href="index.html"><img src="img/logo.png" alt=""/></a></div>
              <!-- Navigation Toggle-->
              <button type="button" data-toggle="collapse" data-target=".myNavbar" class="navbar-toggle"><span class="src-only"></span><i class="fa fa-bars"></i></button>
              <div class="search-nav min"><i class="fa fa-search"></i></div>
            </div>
            <!-- Collpsing Items and Navigation-->
            <div class="myNavbar collapse navbar-collapse">
              <ul class="nav navbar-nav navbar-right">
                <!-- Item 1-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="selected dropdown-toggle">Home<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="index.html">Home Color</a></li>
                    <li><a href="index-2.html">Home Classic</a></li>
                  </ul>
                </li>
                <!-- Item 2-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Course<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="course-grid.html">Course Grid</a></li>
                    <li><a href="course-list.html">Course List</a></li>
                    <li><a href="course-details.html">Course Details</a></li>
                  </ul>
                </li>
                <!-- Item 3-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Teachers<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="teacher-grid.html">Teachers Grid</a></li>
                    <li><a href="teacher-list.html">Teacher List</a></li>
                    <li><a href="teacher-details.html">Teacher Details</a></li>
                  </ul>
                </li>
                <!-- Item 4-->
                <li class="menu-item"><a data-toggle="dropdown" href="" class="dropdown-toggle">Events<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="event-grid.html">Events Grid</a></li>
                    <li><a href="event-details.html">Events Details</a></li>
                  </ul>
                </li>
                <!-- Item 5-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Blog<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="blog-masonry.html">Blog Masonry</a></li>
                    <li><a href="blog-list.html">Blog Listing</a></li>
                    <li><a href="blog-details.html">Blog Details</a></li>
                  </ul>
                </li>
                <!-- Item 6-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Pages<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="timetable.html">Time Table</a></li>
                    <li><a href="princing-plans.html">Pricing Plans</a></li>
                  </ul>
                </li>
                <!-- Item 7-->
                <li class="menu-item"><a href="contact-us.html">Contact</a></li>
                <!-- Search Icon-->
                <li class="menu-item">
                  <div class="search-nav big"><i class="fa fa-search"></i></div>
                </li>
              </ul>
            </div>
          </div>
        </nav>
        <nav class="navbar duplicate hidden navbar-1">
          <!-- Search Form-->
          <form method="get" action="#" class="search-form container">
            <div>
              <input type="search" name="search-field" placeholder="Type and hit enter..." class="text-search-field"/><i class="close-btn fa fa-close"></i>
            </div>
          </form>
          <div class="navigation container">
            <!-- Nav Bar Toggle/collapse and Logo-->
            <div class="navbar-header">
              <div class="navbar-brand"><a href="index.html"><img src="assets/img/logo.png" alt=""/></a></div>
              <!-- Navigation Toggle-->
              <button type="button" data-toggle="collapse" data-target="#myNavbar" class="navbar-toggle"><span class="src-only"></span><i class="fa fa-bars"></i></button>
              <div class="search-nav min"><i class="fa fa-search"></i></div>
            </div>
            <!-- Collpsing Items and Navigation-->
            <div id="myNavbar" class="collapse navbar-collapse">
              <ul class="nav navbar-nav navbar-right">
                <!-- Item 1-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="selected dropdown-toggle">Home<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="index.html">Home Page 1</a></li>
                    <li><a href="index-2.html">Home Page 2</a></li>
                  </ul>
                </li>
                <!-- Item 2-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Course<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="course-grid.html">Course Grid</a></li>
                    <li><a href="course-list.html">Course List</a></li>
                    <li><a href="course-details.html">Course Details</a></li>
                  </ul>
                </li>
                <!-- Item 3-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Teachers<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="teacher-grid.html">Teachers Grid</a></li>
                    <li><a href="teacher-list.html">Teacher List</a></li>
                    <li><a href="teacher-details.html">Teacher Details</a></li>
                  </ul>
                </li>
                <!-- Item 4-->
                <li class="menu-item"><a data-toggle="dropdown" href="" class="dropdown-toggle">Events<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="event-grid.html">Events Grid</a></li>
                    <li><a href="event-details.html">Events Details</a></li>
                  </ul>
                </li>
                <!-- Item 5-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Blog<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="blog-masonry.html">Blog Masonry</a></li>
                    <li><a href="blog-list.html">Blog Listing</a></li>
                    <li><a href="blog-details.html">Blog Details</a></li>
                  </ul>
                </li>
                <!-- Item 6-->
                <li class="menu-item"><a data-toggle="dropdown" href="#" class="dropdown-toggle">Pages<i class="fa fa-angle-down"></i></a>
                  <ul class="sub-menu">
                    <li><a href="timetable.html">Time Table</a></li>
                    <li><a href="princing-plans.html">Pricing Plans</a></li>
                  </ul>
                </li>
                <!-- Item 7-->
                <li class="menu-item"><a href="contact-us.html">Contact</a></li>
                <!-- Search Icon-->
                <li class="menu-item">
                  <div class="search-nav big"><i class="fa fa-search"></i></div>
                </li>
              </ul>
            </div>
          </div>
        </nav>

        <!-- Jumbotron-->
        <div class="jumbotron page-jumbotron bg-11">
          <div class="bottom-bar">
            <div class="container-fluid">
              <h1><i class="fa fa-pencil"></i>Blog Details</h1>
            </div>
          </div>
        </div>
        <!-- Breadcrumb-->
        <div class="breadcrumb-wrapper">
          <div class="container">
            <div class="breadcrumb">
              <ul>
                <li><a href="#" class="return">Home</a><i class="fa fa-angle-right"></i></li>
                <li><a href="#">Blog</a><i class="fa fa-angle-right"></i></li>
                <li><a href="#">Blog Details</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>

      <!-- Blog Listing Page-->
      <div class="blog-wrapper">
        <!-- Blog Listing-->
        <div class="blog-content details">
          <div class="container">
            <div class="row">
              <!-- Article Wrapper-->
              <div class="col-md-9 post-wrapper">
                <!-- Post-->
                <div class="article">
                  <!-- Article Head-->
                  <div class="article-head">
                    <!-- Date-->
                    <div class="date">
                      <h3 class="day">18</h3>
                      <h3 class="month">apl</h3>
                    </div>
                    <!-- Title-->
                    <h2 class="title">Don't break promises with children</h2>
                    <!-- Meta-->
                    <ul class="meta">
                      <li>
                        <h5><i class="fa fa-pencil"></i>                      Tony perteson</h5>
                      </li>
                      <li>
                        <h5><i class="fa fa-comments-o"></i>                      03 Comments</h5>
                      </li>
                    </ul>
                    <!-- Main Image--><img src="img/details-images/img-6.jpg" alt="" class="main-image img-responsive"/>
                  </div>
                  <!-- Text Block-->
                  <div class="body">
                    <p>Sed scelerisque eget erat ut varius. Morbi bibendum, ante quis ultricies consectetur, diam libero elementum diam, sit amet iaculis nibh lectus vitae ante. Curabitur arcu sapien, volutpat vitae nunc ut, finibus interdum nunc. Nullam ac placerat neque. Sed purus odio, malesuada a rhoncus quis, bibendum a metus.</p><span class="empty-space"></span>
                    <!-- Separate Content-->
                    <h3>Mauris tempor urna libero</h3><span class="empty-space"></span>
                    <!-- Separate Content-->
                    <p>Phasellus et enim nec ante sagittis lobortis eu vel urna. Quisque quam nibh, volutpat vel lectus id, rhoncus lobortis eros. Cras in aliquam dui. Nullam bibendum sed eros eu molestie. Maecenas convallis odio eget urna molestie, a interdum elit maximus. Mauris et purus imperdiet, pulvinar orci eu, placerat dui. Cras porta ipsum vitae quam interdum, posuere malesuada sapien finibus. Aenean a pulvinar turpis, et pellentesque libero. Nam nunc orci, suscipit in porta ege tt, consectetur eget risus. Vivamus rutrum est et sagittis</p>
                    <blockquote><i class="fa fa-quote-left"></i>
                      <p>“Praesent at dapibus ante. Pellentesque quis scelerisque neque. Integer a vulputate mi. Nulla convallis justo eros, at tempor lorem efficitur sit amet. Nullam ullamcorper ipsum quis velit feugiat viverra.”</p>
                    </blockquote>
                    <h3>Aenean a pulvinar turpis: et pellentesque libero</h3><span class="empty-space"></span>
                    <!-- Separate Content-->
                    <p>Cras ac tortor tempus, vestibulum libero sit amet, ornare urna. Vestibulum quis accumsan turpis. Donec hendrerit odio magna, non tempus augue bibendum at. Nunc varius, mi sed suscipit iaculis, metus velit hendrerit lectus, ut ornare nunc mi nec dui. Vivamus laoreet tristique massa, id congue nisi fermentum id.</p><span class="empty-space"></span>
                    <!-- Separate Content-->
                    <p>Suspendisse a lectus leo. Quisque metus purus, laoreet in eros ut, vehicula blandit turpis. Phasellus gravida magna id porttitor iaculis. Curabitur vitae lacinia lorem. Quisque consectetur et orci eget dictum. In sodales ultricies dolor, id venenatis sapien finibus non. Quisque viverra cursus nisl, vitae luctus leo vulputate nec.</p>
                  </div>
                  <!-- Tags-->
                  <ul class="tags blog">
                    <li><a href="#">book</a></li>
                    <li><a href="#">course</a></li>
                    <li><a href="#">educational</a></li>
                    <li><a href="#">excursions</a></li>
                  </ul>
                </div>
                <!-- Author-->
                <div class="author">
                  <!-- athor image--><img src="img/others/blog-user-7.jpg" alt="" class="user-image img-responsive"/>
                  <!-- info-->
                  <div class="info-block">
                    <h3>Robert william</h3><a href="#">
                      <h5>GS. Art Director</h5></a>
                  </div>
                  <!-- Social-->
                  <ul class="social">
                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                    <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                    <li><a href="#"><i class="fa fa-rss"></i></a></li>
                  </ul>
                </div>
                <!-- Short Pagination-->
                <div class="short-pagination-wrapper">
                  <div class="line"></div>
                  <ul class="short-pagination">
                    <li><a href="#">Previous post</a></li>
                    <li><a href="#">Next post</a></li>
                  </ul>
                </div>
                <!-- Comments-->
                <div class="comments-wrapper">
                  <!-- Title-->
                  <h2 class="title">There are <span>03 comments</span> on this post</h2>
                  <!-- Comment 1-->
                  <div class="comment">
                    <!-- Image--><img src="img/others/comment-1.jpg" alt="" class="user-image img-responsive"/>
                    <div class="info-block">
                      <!-- Top-->
                      <h5 class="heading"><span class="name">Allison Grayce</span><span class="sep fa fa-circle"></span><span class="time">2 days ago</span></h5>
                      <!-- comment-->
                      <p class="body">Proin est purus, elementum eu tempus ut, molestie vel magna. Sed id lorem a felis lobortis tristique. Mauris ac auctor nibh. Cras venenatis neque eget pellentesque posuere.</p>
                      <!-- Reply btn--><a href="#" class="button button-simple replay">Reply</a>
                    </div>
                  </div>
                  <!-- Comment 2 (Reply)-->
                  <div class="comment reply">
                    <!-- Image--><img src="img/others/comment-2.jpg" alt="" class="user-image img-responsive"/>
                    <div class="info-block">
                      <!-- Top-->
                      <h5 class="heading"><span class="name">Jhonatan Doe</span><span class="sep fa fa-circle"></span><span class="time">2 days ago</span></h5>
                      <!-- comment-->
                      <p class="body">Vivamus at nisi viverra, egestas velit pulvinar, facilisis augue. In sed hendrerit leo, dignissim posuere nunc. Vestibulum et sagittis metus.</p>
                      <!-- Reply btn--><a href="#" class="button button-simple replay">Reply</a>
                    </div>
                  </div>
                  <!-- Comment 3-->
                  <div class="comment last">
                    <!-- Image--><img src="img/others/comment-3.jpg" alt="" class="user-image img-responsive"/>
                    <div class="info-block">
                      <!-- Top-->
                      <h5 class="heading"><span class="name">Adelle Charles</span><span class="sep fa fa-circle"></span><span class="time">2 days ago</span></h5>
                      <!-- comment-->
                      <p class="body">Proin est purus, elementum eu tempus ut, molestie vel magna. Sed id lorem a felis lobortis tristique. Mauris ac auctor nibh. Cras venenatis neque eget pellentesque posuere.</p>
                      <!-- Reply btn--><a href="#" class="button button-simple replay">Reply</a>
                    </div>
                  </div>
                  <div class="comment-form">
                    <!-- Form Title-->
                    <h2 class="title">Leave your thought</h2>
                    <!-- Contact Form-->
                    <form action="#" class="contact-form">
                      <div class="field">
                        <input type="text" name="name" placeholder="Name"/>
                      </div>
                      <div class="field">
                        <input type="email" name="email" placeholder="E-mail"/>
                      </div>
                      <div class="field">
                        <input type="tel" name="phone" placeholder="Phone"/>
                      </div>
                      <div class="field">
                        <textarea name="Message" cols="10" rows="10" placeholder="Message"></textarea>
                      </div>
                      <input type="submit" value="Send Message" class="submit"/>
                    </form>
                  </div>
                </div>
              </div>
              <!-- Sidebar Wrapper-->
              <div class="col-md-3 sidebar-wrapper">
                <!-- Category-->
                <div class="widget first">
                  <!-- Widget Name-->
                  <ul class="widget-name">
                    <li>
                      <h2>Category</h2>
                    </li>
                    <li class="sep"></li>
                  </ul>
                  <!-- Widget-->
                  <ul class="category">
                    <li><a href="#">Popular news<span>03</span></a></li>
                    <li><a href="#">School activities<span>34</span></a></li>
                    <li><a href="#">New book release<span>57</span></a></li>
                    <li><a href="#">Our teachers<span>49</span></a></li>
                    <li><a href="#">Our teachers<span>49</span></a></li>
                    <li><a href="#">Class room<span>84</span></a></li>
                    <li><a href="#">Graduations <span>29</span></a></li>
                    <li><a href="#">Great performance students <span>63</span></a></li>
                    <li><a href="#">Lovely teachers<span>74</span></a></li>
                  </ul>
                </div>
                <!-- Tags-->
                <div class="widget">
                  <!-- Widget Name-->
                  <ul class="widget-name">
                    <li>
                      <h2>Tags Cloud</h2>
                    </li>
                    <li class="sep"></li>
                  </ul>
                  <!-- Widget-->
                  <ul class="tags">
                    <li><a href="#">book</a></li>
                    <li><a href="#">course</a></li>
                    <li><a href="#">courses</a></li>
                    <li><a href="#">education</a></li>
                    <li><a href="#">excursions</a></li>
                    <li><a href="#">math</a></li>
                    <li><a href="#">primary</a></li>
                    <li><a href="#">school</a></li>
                    <li><a href="#">sport</a></li>
                    <li><a href="#">teacher</a></li>
                  </ul>
                </div>
                <!-- Recent Posts-->
                <div class="widget">
                  <!-- Widget Name-->
                  <ul class="widget-name">
                    <li>
                      <h2>Recent Posts</h2>
                    </li>
                    <li class="sep"></li>
                  </ul>
                  <!-- Widget-->
                  <div class="recent-posts">
                    <!-- Post 1-->
                    <div class="recent-post">
                      <!-- Image-->
                      <div class="image"><img src="img/others/recent-post-1.jpg" alt="" class="img-resposive"/>
                        <div class="overlay"><a href="#"><i class="fa fa-mail-forward"></i></a></div>
                      </div>
                      <!-- Title--><a href="#">
                        <h5 class="title">Outdoor Drawings at Meadowlark</h5></a>
                      <!-- meta-->
                      <ul class="meta">
                        <li>
                          <h5><i class="fa fa-calendar"></i>                        06 Apr, 2015</h5>
                        </li>
                        <li>
                          <h5><i class="fa fa-comments-o"></i>                        156</h5>
                        </li>
                      </ul>
                    </div>
                    <!-- Post 2-->
                    <div class="recent-post">
                      <!-- Image-->
                      <div class="image"><img src="img/others/recent-post-2.jpg" alt="" class="img-resposive"/>
                        <div class="overlay"><a href="#"><i class="fa fa-mail-forward"></i></a></div>
                      </div>
                      <!-- Title--><a href="#">
                        <h5 class="title">Kid invited to design a brand new umbrella </h5></a>
                      <!-- meta-->
                      <ul class="meta">
                        <li>
                          <h5><i class="fa fa-calendar"></i>                        06 Apr, 2015</h5>
                        </li>
                        <li>
                          <h5><i class="fa fa-comments-o"></i>                        156</h5>
                        </li>
                      </ul>
                    </div>
                    <!-- Post 3-->
                    <div class="recent-post last">
                      <!-- Image-->
                      <div class="image"><img src="img/others/recent-post-3.jpg" alt="" class="img-resposive"/>
                        <div class="overlay"><a href="#"><i class="fa fa-mail-forward"></i></a></div>
                      </div>
                      <!-- Title--><a href="#">
                        <h5 class="title">Kid stars of the week</h5></a>
                      <!-- meta-->
                      <ul class="meta">
                        <li>
                          <h5><i class="fa fa-calendar"></i>                        06 Apr, 2015</h5>
                        </li>
                        <li>
                          <h5><i class="fa fa-comments-o"></i>                        156</h5>
                        </li>
                      </ul>
                    </div>
                  </div>
                </div>
                <!-- Most View-->
                <div class="widget">
                  <!-- Widget Name-->
                  <ul class="widget-name">
                    <li>
                      <h2>Most View</h2>
                    </li>
                    <li class="sep"></li>
                  </ul>
                  <!-- Widget-->
                  <div class="most-views">
                    <!-- Most View 1-->
                    <div class="most-view">
                      <!-- Date-->
                      <div class="date">
                        <h3 class="day">18</h3>
                        <h3 class="month">nov</h3>
                      </div>
                      <!-- Title--><a href="#">
                        <h5 class="title">Sequitur mutationem consuetudium lectorum</h5></a>
                      <!-- meta-->
                      <ul class="meta">
                        <li>
                          <h5><i class="fa fa-calendar"></i>                        15 Apr, 2015</h5>
                        </li>
                        <li>
                          <h5><i class="fa fa-heart-o"></i>                        156</h5>
                        </li>
                      </ul>
                    </div>
                    <!-- Most View 2-->
                    <div class="most-view">
                      <!-- Date-->
                      <div class="date">
                        <h3 class="day">15</h3>
                        <h3 class="month">nov</h3>
                      </div>
                      <!-- Title--><a href="#">
                        <h5 class="title">Claritas est etiam processus dynamicus</h5></a>
                      <!-- meta-->
                      <ul class="meta">
                        <li>
                          <h5><i class="fa fa-calendar"></i>                        15 Apr, 2015</h5>
                        </li>
                        <li>
                          <h5><i class="fa fa-heart-o"></i>                        156</h5>
                        </li>
                      </ul>
                    </div>
                    <!-- Most View 3-->
                    <div class="most-view last">
                      <!-- Date-->
                      <div class="date">
                        <h3 class="day">31</h3>
                        <h3 class="month">nov</h3>
                      </div>
                      <!-- Title--><a href="#">
                        <h5 class="title">Lobortis nisl ut aliquip exa commodo consequat</h5></a>
                      <!-- meta-->
                      <ul class="meta">
                        <li>
                          <h5><i class="fa fa-calendar"></i>                        31 Dec, 2014</h5>
                        </li>
                        <li>
                          <h5><i class="fa fa-heart-o"></i>                        156</h5>
                        </li>
                      </ul>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!-- Footer-->
      <footer class="footer-2">
        <!-- Pre-footer-->
        <div class="pre-footer">
          <div class="container">
            <!-- To Top Btn-->
            <div id="to-top"><i class="fa fa-angle-double-up"></i></div>
            <!-- Pre-footer Content-->
            <div class="row">
              <!-- About-->
              <div class="ft col-md-3 col-sm-6">
                <div class="about">
                  <h2 class="title">About</h2><img src="img/logo-big.png" alt=""/>
                  <p>Fast and accurate in problem-solving and make the best decision in every situation.</p>
                  <p>Our mission is to help every child be well-prepared for their futures with different self-skills.</p>
                </div>
              </div>
              <!-- Tags-->
              <div class="ft col-md-3 col-sm-6">
                <div class="tags">
                  <h2 class="title">Tags</h2>
                  <ul>
                    <li><a href="#">book</a></li>
                    <li><a href="#">course</a></li>
                    <li><a href="#">courses</a></li>
                    <li><a href="#">education</a></li>
                    <li><a href="#">excursions</a></li>
                    <li><a href="#">math</a></li>
                    <li><a href="#">primary</a></li>
                    <li><a href="#">school</a></li>
                    <li><a href="#">sport</a></li>
                    <li><a href="#">teacher</a></li>
                    <li><a href="#">kid</a></li>
                    <li><a href="#">learn</a></li>
                    <li><a href="#">paint</a></li>
                    <li><a href="#">room</a></li>
                  </ul>
                </div>
              </div>
              <!-- Quick Menu-->
              <div class="ft col-md-3 col-sm-6">
                <div class="quick-menu">
                  <h2 class="title">Quick Menu</h2>
                  <ul>
                    <li><a href="time_table.html">Time Table<i class="icon fa fa-angle-right"></i></a></li>
                    <li><a href="">FAQ's<i class="icon fa fa-angle-right"></i></a></li>
                    <li><a href="">Blog Large<i class="icon fa fa-angle-right"></i></a></li>
                    <li><a href="">Members<i class="icon fa fa-angle-right"></i></a></li>
                    <li><a href="">Services<i class="icon fa fa-angle-right"></i></a></li>
                  </ul>
                </div>
              </div>
              <!-- Recent Post-->
              <div class="ft col-md-3 col-sm-6">
                <div class="recent-posts-outer">
                  <h2 class="title">Recent Posts</h2>
                  <div class="recent-posts-inner">
                    <!-- recent post 1-->
                    <div class="recent-post">
                      <div class="img"><a href="#"><img src="img/others/recent-post-footer-1.jpg" alt=""/></a></div>
                      <div class="info-block"><a href="#">
                          <h5>Kids and mordern technology </h5></a>
                        <h6>Oct 06, 2015<span class="line"></span></h6>
                      </div>
                    </div>
                    <!-- recent post 2-->
                    <div class="recent-post">
                      <div class="img"><a href="#"><img src="img/others/recent-post-footer-2.jpg" alt=""/></a></div>
                      <div class="info-block"><a href="#">
                          <h5>What should parents teach childrens?</h5></a>
                        <h6>Oct 06, 2015<span class="line"></span></h6>
                      </div>
                    </div>
                    <!-- recent post 2-->
                    <div class="recent-post last">
                      <div class="img"><a href="#"><img src="img/others/recent-post-footer-3.jpg" alt=""/></a></div>
                      <div class="info-block"><a href="#">
                          <h5>Don't break promises with children</h5></a>
                        <h6>Oct 06, 2015<span class="line"></span></h6>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- Footer-->
        <div class="footer">
          <div class="container">
            <!-- Social Media-->
            <ul class="social-media">
              <li><a href="#"><i class="fa fa-facebook"></i></a></li>
              <li><a href="#"><i class="fa fa-twitter"></i></a></li>
              <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
              <li><a href="#"><i class="fa fa-tumblr"></i></a></li>
              <li><a href="#"><i class="fa fa-rss"></i></a></li>
            </ul>
            <!-- Copyright-->
            <h5 class="copyright">© Kidzone - Children Kindergarten WordPress Theme by <a href="#">YoloTheme</a></h5>
          </div>
        </div>
      </footer>
    </div>
    <!-- .site-->

    <!-- Vendor jQuery-->
    <script type="text/javascript" src="libs/jquery/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="libs/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="libs/smoothscroll/SmoothScroll.js"></script>

    <!-- Theme Script-->
    <script type="text/javascript" src="js/js.js"></script>
  </body>
</html>