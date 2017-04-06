package com.org.ghy.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
@Namespace(value = "/login")

@Results({
        @Result(name = "index_2", location = "index.jsp")
})
public class LoginAction {
    @Action(value = "index")
    public String hello() {
        System.out.println(555);
        return "index_2";
    }
}
