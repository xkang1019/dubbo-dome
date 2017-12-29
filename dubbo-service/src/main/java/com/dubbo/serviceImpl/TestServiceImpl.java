package com.dubbo.serviceImpl;

import com.dubbo.api.TestService;
import org.springframework.stereotype.Service;


@Service
public class TestServiceImpl implements TestService {

    @Override
    public String sayHello(String name) {
        System.out.println(name);
        return name;
    }

}
