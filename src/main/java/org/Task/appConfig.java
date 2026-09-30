package org.Task;

import org.Task.Interfaces_Implement.InventoryService;
import org.Task.Interfaces_Implement.InventoryServiceImpl;
import org.Task.Interfaces_Implement.LoggingBeforeAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {

    @Bean
    public InventoryService inventoryService() {
        return new InventoryServiceImpl();
    }

    @Bean
    public LoggingBeforeAdvice loggingBeforeAdvice() {
        return new LoggingBeforeAdvice();
    }

    @Bean
    public ProxyFactoryBean Proxy() {
        ProxyFactoryBean factory = new ProxyFactoryBean();
        factory.setTarget(new InventoryServiceImpl());
        factory.setInterceptorNames("loggingBeforeAdvice");
        return factory;
    }

}
