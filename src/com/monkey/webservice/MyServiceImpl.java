package com.monkey.webservice;

import javax.jws.WebService;

/**
 * Created by quannengshen on 2015/9/4.
 */
@WebService(endpointInterface = "com.monkey.webservice.MyService")
public class MyServiceImpl implements MyService {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int cut(int a, int b) {
        return a-b;
        }}

