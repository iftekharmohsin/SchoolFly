   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   <div class="modal fade" id="parentRegisterModal" role="dialog">
	    <div class="modal-dialog">
	    
	      <!-- Modal content-->
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal">&times;</button>
	          <!-- <h4 class="modal-title">Register Here</h4> -->
	          <div class="section-name index-1 form-header">
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
		              <form:form class="contact-form teacherForm" id='commonSignupModal' action='saveParent' method="POST" modelAttribute="parentVo">
		                <div class="field">
		                  <label for="theinput">First Name:</label>
		                  <form:input type="text" path="firstName"  placeholder="First Name" required="required"/>
		                </div>
		                <div class="field">
		                  <label for="theinput">Last Name:</label>
		                  <form:input type="text" path="lastName" placeholder="Last Name" required="required"/>
		                </div>
		                <div class="field">
		                  <label for="theinput">Gender:</label>
		                  <form:select  path="gender" placeholder=""  required="required">
		                  <form:option value="" selected="selected">----select----</form:option>
		                  <form:option value="male">Male</form:option>
		                  <form:option value="female">Female</form:option>
		                  </form:select>
		                </div>
		                <div class="field">
		                  <label for="theinput">DOB:</label>
		                  <input  type="text" id="datepicker"  data-date-format="mm/dd/yyyy" placeholder="mm/dd/yyyy" required="required"/>
		                </div>
		                <div class="field">
		                  <label for="theinput">E-mail:</label>
		                  <form:input type="email" path="email"  placeholder="E-mail" required="required"/>
		                </div>
		                <div class="field">
		                <label for="theinput">Phone:</label>
		                  <form:input type="tel" path="phoneNo"  placeholder="Phone" required="required"/>
		                </div>
		                <div class="field">
		                <label for="theinput">Password:</label>
		                  <form:password  path="password"  placeholder="Password" required="required"/>
		                </div>
		                <div class="field">
		                <label for="theinput">Retype Password:</label>
		                 <form:password  path="rePassword"  placeholder="Retype Password" required="required"/>
		                </div>
		                <div class="field row">
		                 <div class="col-md-6 ">
		                    <input type="button" class="submit form-cancel" data-dismiss="modal"  value="Cancel" />
		                  </div>
		                   <div class="col-md-6 ">
			                <input type="submit"   value="Register" class="submit"/>
		                  </div>
		                </div>
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