package sub.optimal.jsonrpc.impl;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import org.springframework.stereotype.Service;
import sub.optimal.jsonrpc.api.MyService;

@Service
@AutoJsonRpcServiceImpl
public class MyServiceImpl implements MyService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
