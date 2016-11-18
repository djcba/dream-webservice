package com.lida.dream_webservice.server;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by DuLida on 2016/11/14.
 */
@WebService
public interface MyWebService {
    int add(@WebParam(name = "firstA")int a, @WebParam(name = "firstB")int b);
    int minus(@WebParam(name = "secondA")int a, @WebParam(name = "secondB")int b);
}