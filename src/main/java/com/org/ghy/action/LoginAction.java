package com.org.ghy.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;



@Results({  
	  @Result(name="index_2", location="index_2.jsp")  
	})  
@ResultPath("/WEB-INF/view/")  
public class LoginAction   {
    @Action(value="/hello/index")
    public String hello() {
    	System.out.println(555); 
        return "index";
    }
    
    @Action(value="/hello1/index")
    public String hello1() {
    	System.out.println(11); 
        return "index_2";
    }
}
