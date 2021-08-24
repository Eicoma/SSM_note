import com.eicoma.javabean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTesst {
    public static void main(String[] args) {
        //在beans.xml配置文件加载时，ApplicationContext容器中的对象就已经被创建了
        //无论是否要使用该对象，该对象都已经被创建
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");

        user.show();
    }
}
