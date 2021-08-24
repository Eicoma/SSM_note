import com.eicoma.config.EicomaConfig;
import com.eicoma.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //如果完全使用配置类的方式去配置bean,就要使用AnnotationConfig上下文来获取容器，通过配置类的class对象加载
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EicomaConfig.class);
        User user = (User)context.getBean("getUser");

        System.out.println(user.getName());
    }
}
