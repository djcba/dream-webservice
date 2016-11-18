package com.lida.dream_webservice.client;

import com.lida.dream_webservice.server.MyWebService;
import com.lida.dream_webservice.server.MyWebserviceImplService;

/**
 * Created by DuLida on 2016/11/18.
 * 该类为测试wsdl2java所生成server 的客户端
 */
public class Client {
    public static void main(String args[]) {
        MyWebserviceImplService service = new MyWebserviceImplService();
        MyWebService myWebService = service.getMyWebserviceImplPort();
        System.out.println(myWebService.add(1,2));
    }
}