import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by wenpeng on 2017/2/23.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext  context=new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();
        System.in.read();
    }
}
