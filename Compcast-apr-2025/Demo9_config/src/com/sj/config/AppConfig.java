package com.sj.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sj.model.Calc1;
import com.sj.model.Calc2;
import com.sj.model.CalcService;
@Configuration
public class AppConfig {
 
    @Bean(name="demoService")
    public CalcService calcservice()
    {
    	
    	return new Calc1();
        
    }
    

    @Bean(name="calc2")
    public CalcService calcservice2()
    {
    	
    	return new Calc2();
        
    }
    
    
}