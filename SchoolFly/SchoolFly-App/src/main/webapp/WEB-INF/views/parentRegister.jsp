   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   <div class="modal fade" id="parentRegisterModal" role="dialog">
	    <div class="modal-dialog">
	    
	      <!-- Modal content-->
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal">&times;</button>
	          <!-- <h4 class="modal-title">Register Here</h4> -->
	          <div class="section-name index-1">
	            <h3>Parent Register</h3>
	            <div class="sep"></div>
	          </div>
	        </div>
	        <div class="modal-body">
	          <!-- Contact Page-->
		        
		          <div class="row">
		            <!-- Contact-->
		            <div class="col-md-2 contact-form-wrapper">
		            </div>
		            <div class="col-md-8 contact-form-wrapper">
		              <!-- Contact Form-->
		              <form:form class="contact-form" id='commonSignupModal' action='saveParent' method="POST" modelAttribute="parentVo">
		                <div class="field">
		                  <form:input type="text" path="firstName" name="firstName" placeholder="First Name"/>
		                </div>
		                <div class="field">
		                  <form:input type="text" path="lastName" name="lastName" placeholder="Last Name"/>
		                </div>
		                <div class="field">
		                  <form:input type="text" path="middleName" name="middleName" placeholder="Middle Name"/>
		                </div>
		                <div class="field">
		                  <form:input type="text" path="gender" name="gender" placeholder="Gender"/>
		                </div>
		                <div class="field">
		                  <form:input type="text" path="email" name="email" placeholder="E-mail"/>
		                </div>
		                <div class="field">
		                  <form:input type="text" path="dob" name="dob" placeholder="DOB"/>
		                </div>
		                
		                <div class="field">
		                  <form:input type="text" path="phone" name="phone" placeholder="Phone"/>
		                </div>
		                <div class="field">
		                  <form:password  path="password" name="password" placeholder="Password"/>
		                </div>
		                <div class="field">
		                 <form:password  path="repassword" name="repassword" placeholder="Retype Password"/>
		                </div>
		                <input type="submit" value="Register" class="submit"/>
		              </form:form>
		            </div>
		            <div class="col-md-2 contact-form-wrapper">
		            </div>
		          </div>
	        </div>
	       <!--  <div class="modal-footer">
	          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
	        </div> -->
	      </div>
	      
	    </div>
	  </div>