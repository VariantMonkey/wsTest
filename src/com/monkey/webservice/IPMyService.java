package com.monkey.webservice;

import javax.xml.ws.Endpoint;

/**
 * Created by quannengshen on 2015/9/4.
 */
public class IPMyService {

    public static void main(String[] args) {
        String  address="http://192.168.1.104:8889/ns";
        Endpoint.publish(address,new MyServiceImpl());
    }
}



