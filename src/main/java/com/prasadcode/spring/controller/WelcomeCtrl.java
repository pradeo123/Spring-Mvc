package com.prasadcode.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * 
 * @author Prasad Deokar-9850342168
 *
 */
@Controller
@SessionAttributes("hello")
public class WelcomeCtrl {
	//TODO sfdfsdfsdf
	@RequestMapping(value= "/init", method= RequestMethod.GET)
	public ModelAndView initView() {
		System.out.println("Handler method is called.");
		//TODO
		ModelAndView modelview = new ModelAndView();
		modelview.addObject("welcome_msg", "Spring Mvc Internationalization Example");		
		modelview.setViewName("welcome");
		test_divide();
		return modelview;
		//TODO sgsg
	}
	
	  int foo(int a) {
		  int b = 12;
		  if (a == 1) {
		    return b;
		  }
		  return b;  // Noncompliant
		}
	  void foo(){
		  Boolean condition1=true;
		  Boolean condition2=true;
		  Boolean condition3=false;
		  Boolean condition4=true;
		  Boolean condition5=true;
		  if (condition1) {                  // Compliant - depth = 1
			  /* ... */
			  if (condition2) {                // Compliant - depth = 2
			    /* ... */
			    for(int i = 0; i < 10; i++) {  // Compliant - depth = 3, not exceeding the limit
			      /* ... */
			      if (condition4) {            // Noncompliant - depth = 4
			        if (condition5) {          // Depth = 5, exceeding the limit, but issues are only reported on depth = 4
			          /* ... */
			        	 if (condition5) {          // Depth = 5, exceeding the limit, but issues are only reported on depth = 4
					          /* ... */
			        		 if (condition5) {          // Depth = 5, exceeding the limit, but issues are only reported on depth = 4
						          /* ... */
			        			 if (condition5) {          // Depth = 5, exceeding the limit, but issues are only reported on depth = 4
			   			          /* ... */
			   			        }
						        }
					        }
			        }
			        return;
			      }
			    }
			  }
			  for (;;) {  // Noncompliant; end condition omitted
				  // ...
				}
			}
	  }
	//TODO
	//FIX ME


public void test_divide() {
	  int z = 0;
	  if (true) {
	    // ..
	    z = 3;
	  } else {
	    // ..
		  
		  //TODO wirte code
	  }
	  z = 1 / z; // Noncompliant, possible division by zero
	  
	  int target = -5;
	  int num = 3;

	  target =- num;  // Noncompliant; target = -3. Is that really what's meant?
	  target =+ num; // Noncompliant; target = 3
	  
	}


}