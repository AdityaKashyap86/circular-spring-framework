package com.sunglowsys.service;

import com.sunglowsys.bean.A;
import com.sunglowsys.bean.B;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    @Autowired
    A a;

    @Autowired
    B b;

    public void service(){
        b.getB ();
        a.getA ();

    }
}
