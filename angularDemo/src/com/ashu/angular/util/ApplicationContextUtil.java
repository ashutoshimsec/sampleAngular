package com.ashu.angular.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public  class ApplicationContextUtil implements ApplicationContextAware{

	  private static  ApplicationContext applicationContext = null ;      

	    public void setApplicationContext(ApplicationContext context) throws BeansException {
	    	
    	ApplicationContextUtil.applicationContext = context;
	    }

	    public static ApplicationContext getApplicationContext() {
	      return applicationContext;
	    }
	    
	    
	    public static Object getBean(String beanName) {
			System.out.println("comming for bean");
		    return applicationContext.getBean(beanName);
		  }
}
