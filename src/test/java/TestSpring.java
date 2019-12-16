import com.yh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext.xml");
        User user = (User)ac.getBean("user");
        System.out.println(user);
    }
}
