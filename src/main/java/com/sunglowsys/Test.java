package com.sunglowsys;

import com.sunglowsys.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext ();
        context.scan ("com.sunglowsys.bean");
        context.scan ("com.sunglowsys.service");

        context.refresh ();
        Service service =context.getBean (Service.class);
        service.service ();
        context.close ();

    }
}
