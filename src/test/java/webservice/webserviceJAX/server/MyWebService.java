package webservice.webserviceJAX.server;

import javax.jws.WebService;

/**
 * Created by DuLida on 2016/11/14.
 */
@WebService
public interface MyWebService {
    int add(int a, int b);
    int minus(int a, int b);
}
