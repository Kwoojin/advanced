package hello.advanced.pureproxy.concreateproxy;

import hello.advanced.pureproxy.concreateproxy.code.ConcreteClient;
import hello.advanced.pureproxy.concreateproxy.code.ConcreteLogic;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(concreteLogic);
        client.execute();
    }
}
