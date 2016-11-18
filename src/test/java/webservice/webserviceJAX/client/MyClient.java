package webservice.webserviceJAX.client;


import webservice.webserviceJAX.server.MyWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by DuLida on 2016/11/14.
 */
public class MyClient {
    public static void main(String args[]) {
        try {
            URL url = new URL("http://localhost:8888/ms?wsdl");
            //命名空间 及 名称
            QName qName = new QName("http://server.webserviceJAX.webservice/","MyWebserviceImplService");
            Service service = Service.create(url, qName);
            MyWebService myWebservice = service.getPort(MyWebService.class);
            System.out.println(myWebservice.add(2, 3));
            System.out.println(myWebservice.minus(2, 3));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
