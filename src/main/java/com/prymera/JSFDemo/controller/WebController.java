package com.prymera.JSFDemo.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "webController")
public class WebController {

	  public String loadTodoPage() {
	        checkPermission();
	        return "/todo.xhtml";
	    }
	 
	    private void checkPermission() {
	        // Details omitted
	    }
}
