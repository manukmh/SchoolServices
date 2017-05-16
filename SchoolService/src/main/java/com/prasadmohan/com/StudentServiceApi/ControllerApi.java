/**
 * 
 */
package com.prasadmohan.com.StudentServiceApi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mohankumara.kb
 * 
 *
 */
@RestController
public class ControllerApi {

		
		@RequestMapping(value="/{id}", method= RequestMethod.GET, produces="application/json")
		public String getStudentDetailsById(@PathVariable String id) {
			return id+"";
		}
		

}
