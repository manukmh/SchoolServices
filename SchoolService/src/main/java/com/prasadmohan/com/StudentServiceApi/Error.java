/**
 * 
 */
package com.prasadmohan.com.StudentServiceApi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mohankumara.kb
 * 
 *
 */
@RestController
public class Error implements ErrorController{

    private static final String PATH = "/error";

    @RequestMapping(value = PATH, produces="text/html")
    public String error() throws IOException {
    	InputStream inputStream = Error.class.getResourceAsStream("/mohan.html");
    	InputStreamReader inputStreamReader = new InputStreamReader(inputStream); 
    	   StringBuffer fileData = new StringBuffer();
           BufferedReader reader = new BufferedReader(inputStreamReader);
           char[] buf = new char[5000];
           int numRead=0;
           while((numRead=reader.read(buf)) != -1){
               String readData = String.valueOf(buf, 0, numRead);
               fileData.append(readData);
           }
           reader.close();
           return fileData.toString();
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}