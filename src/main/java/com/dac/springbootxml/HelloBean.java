package com.dac.springbootxml;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
//@ManagedBean(name = "helloBean")
//@Named
//@SessionScoped
public class HelloBean {
    private String name;

    //  @Autowired
    @Inject
//  @ManagedProperty(value = "#{helloService}")
    private HelloService helloService;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String sayHello() {
        this.name = helloService.process(this.name);
        return "WEB-INF/views/result.xhtml";
    }
    public HelloService getHelloService() {
        return helloService;
    }
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

}