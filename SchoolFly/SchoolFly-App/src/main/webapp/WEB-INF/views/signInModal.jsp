  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <!--Login Modal content-->
	   <div class="modal fade " id="login" role="dialog">
	    <div class="modal-dialog">
	      <!-- Modal content-->
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal">&times;</button>
	          <!-- <h4 class="modal-title">Login Here</h4> -->
	          <div class="section-name index-1 form-header">
	            <h3>Login Here</h3>
	            <div class="sep"></div>
	          </div>
	        </div>
	        <div class="modal-body">
	          <!-- Contact Page-->
		          <div class="row">
		            <!-- Contact-->
		             <div class="col-md-2 ">
		            </div>
		            <div class="col-md-8 contact-form-wrapper">
		              <!-- Contact Form-->
		              <form:form  class="contact-form login-form" action='login' method="POST" modelAttribute="parentVo">
		                <div class="field">
		                <label for="theinput">UserName/Email:</label>
		                  <form:input type="text" path="email" name="username" placeholder="Username/Email" required="required"/>
		                </div>
		                <div class="field">
		                <label for="theinput">Password:</label>
		                   <form:input type="password" path="phoneNo" name="password" placeholder="Password" required="required"/>
		                </div>
		                <input type="submit" value="Login" class="submit"/>
		              </form:form>
		            </div>
		             <div class="col-md-2 ">
		            </div>
		          </div>
	        
	        </div>
	      </div>
	      
	    </div>
	  </div>