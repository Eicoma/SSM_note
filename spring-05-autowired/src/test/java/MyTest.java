import com.eicoma.javabean.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beansAutowired.xml");
        People people = applicationContext.getBean("people", People.class);

        System.out.println(people.getName());
        people.getDog().shout();
        people.getCat().shout();
    }
}
