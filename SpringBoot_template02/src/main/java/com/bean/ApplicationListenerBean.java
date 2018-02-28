package com.bean;


import org.apache.logging.log4j.Level;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

import com.util.Util;

public class ApplicationListenerBean implements ApplicationListener {
	
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof ContextRefreshedEvent) {
        	Util.getConsoleLogger().info("ContextRefreshedEvent start ###################");
        	Util.getFileLogger().info("ContextRefreshedEvent start ###################");
     		
        	/** log4j2 Demo **/
        	Util.getConsoleLogger().info("Console log");
        	Util.getFileLogger().info("File log");
        	Util.getDailyFileLogger().info("DailyFile log");
        	
        	// 我今年26歲，喜歡打排球
        	Util.getConsoleLogger().printf(Level.INFO, "我今年%d歲，喜歡打%s", 26, "排球"); 
        	
        	
        	
        	Util.getConsoleLogger().info("ContextRefreshedEvent end ###################");
        	Util.getFileLogger().info("ContextRefreshedEvent end ###################");
        }
        
        if (event instanceof ContextClosedEvent) {
        	Util.getConsoleLogger().info("ContextClosedEvent start ###################");
        	Util.getFileLogger().info("ContextClosedEvent start ###################");
        	
        	Util.getConsoleLogger().info("ContextClosedEvent end ###################");
        	Util.getFileLogger().info("ContextClosedEvent end ###################");
        }
        
    }
    
}