import com.eicoma.javabean.Student;
import com.eicoma.javabean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");

        System.out.println(student.toString());
        /*
        Student{name='源博雅',
        address=Address{address='重庆市'},
        books=[红楼梦, 西游记, 水浒传, 三国演义],
        hobbies=[Programming, Game, Video],
        card={身份证=1515165415616516, 银行卡=55544522123458},
        games=[GTA5, RDR],
        wife='null',
        info={性别=男, 姓名=源赖光, 学号 =181008289}}
         */

    }

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = applicationContext.getBean("user2", User.class);
        User user2 = applicationContext.getBean("user2", User.class);

        //System.out.println(user.toString());

        System.out.println(user);
        System.out.println(user2);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user == user2);

    }
}
