/**
 * 
 */
package com.prasadmohan.com.StudentServiceApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prasadmohan.com.StudentServiceImpl.ControllerImpl;

/**
 * @author mohankumara.kb
 * 
 *
 */
@RestController
@RequestMapping(value="/stusdentservice")
public class ControllerApi {
	
	@Autowired
	private ControllerImpl controllerImpl;
		
		@RequestMapping(value="/test", method= RequestMethod.GET, produces="application/json")
		public String tset() {
			return controllerImpl.test();
		}

		public ControllerImpl getMohan() {
			return controllerImpl;
		}

		public void setMohan(ControllerImpl mohan) {
			this.controllerImpl = mohan;
		}
		

}
