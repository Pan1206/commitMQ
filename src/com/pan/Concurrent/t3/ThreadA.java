package com.pan.Concurrent.t3;

import java.util.Objects;

public class ThreadA extends Thread{
    private ObjectService service;
    public ThreadA(ObjectService service)
    {
        super();
        this.service=service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMetodA();
    }
}
