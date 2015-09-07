package com.monkey.webservice;

import javax.jws.WebService;

/**
 * Created by quannengshen on 2015/9/4.
 */
@WebService
public interface MyService {
    public int add(int a,int b);
    public int  cut(int a,int b);

}
