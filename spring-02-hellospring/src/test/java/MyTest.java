import com.eicoma.javabean.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中管理了，我们要使用，直接去里面取出来即可
        HelloSpring hellospring = (HelloSpring) context.getBean("hellospring");
        System.out.println(hellospring.toString());
    }
}
