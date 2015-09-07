package com.monkey.webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ServiceConfigurationError;

/**
 * Created by quannengshen /on 2015/9/4.
 */
public class TestClient {
    public static void main(String[] args) {
        try {
            URL url=new URL("http://192.168.1.104:8889/ns?wsdl");
            QName sname=new QName("http://webservice.monkey.com/","MyServiceImplService");
            Service service= Service.create(url,sname);
            MyService myService=service.getPort(MyService.class);
            System.out.print(myService.add(1,2));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
