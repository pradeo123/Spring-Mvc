package com.prasadcode.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Prasad Deokar-9850342168
 *
 */
@Controller
public class WelcomeCtrl2 {
	//TODO
	@RequestMapping(value= "/init2", method= RequestMethod.GET)
	public ModelAndView initView() {
		System.out.println("Handler method is called.");
		//TODO
		ModelAndView modelview = new ModelAndView();
		modelview.addObject("welcome_msg", "Spring Mvc Internationalization Example");		
		modelview.setViewName("welcome");
		return modelview;
		//TODO
	}
	@Deprecated
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
			        }
			        return;
			      }
			    }//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO//TODO
			  }
			}
		  int j=1;
		  while (true) { // Noncompliant; end condition omitted
		    j++;
		  }
	  }
	//TODO
	//FIX ME
}