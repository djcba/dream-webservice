package com.lida.dream_webservice.client;

import com.lida.dream_webservice.server.MyWebService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by DuLida on 2016/11/15.
 *
 * 该类为java发布的webservice（服务端客户端在一起，该客户端并非由wsdl2java生成）通过main方法访问
 *
 */
public class ClientForCXF {
    public static MyWebService getInterFace(){
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(MyWebService.class);
        factoryBean.setAddress("http://localhost:8080/server/web-publish");
        return (MyWebService) factoryBean.create();
    }

    public static void main(String[] args) {
        MyWebService myWebService = getInterFace();
        System.out.println("client: "+myWebService.add(1,3));
    }
}
