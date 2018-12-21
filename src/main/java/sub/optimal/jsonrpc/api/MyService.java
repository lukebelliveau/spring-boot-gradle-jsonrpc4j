package sub.optimal.jsonrpc.api;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;

@JsonRpcService("/hello")
public interface MyService {

    String sayHello(@JsonRpcParam(value = "name") String name);
}
