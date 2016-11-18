package webservice.webserviceJAX.server;

import javax.jws.WebService;

/**
 * Created by DuLida on 2016/11/14.
 */
@WebService(endpointInterface = "webservice.webserviceJAX.server.MyWebService")
public class MyWebserviceImpl implements MyWebService {
    @Override
    public int add(int a, int b) {
        System.out.println(a+"+"+b+"="+(a+b));
        return a+b;
    }
    @Override
    public int minus(int a, int b) {
        System.out.println(a+"-"+b+"="+(a-b));
        return a-b;
    }
}
