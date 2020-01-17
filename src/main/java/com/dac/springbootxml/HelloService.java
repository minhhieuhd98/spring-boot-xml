package com.dac.springbootxml;

import javax.inject.Named;
@Named
//@Service
//@ManagedBean(name = "helloService")
//@SessionScoped
public class HelloService {
    public String process(String input) {
        return "Hello: " + input;
    }
}