package cn.edu.zjut.app;
import cn.edu.zjut.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.dao.IUserDAO;
public class SpringEnvTest {
    public static void main(String[] args) {
//创建 Spring 容器
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        UserBean loginUser = new UserBean();
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        UserBean loginUser=(UserBean)
                ctx.getBean("userbean");
        loginUser.setUsername("SPRING");
        loginUser.setPassword("SPRING");
////获取 UserDAO 实例
//        IUserDAO userDao = (IUserDAO) ctx.getBean("userDAO");
//        userDao.search(loginUser);
        //获取 UserService 实例
        IUserService userService =
                (IUserService) ctx.getBean("userService");
        //userService.login(loginUser);
        userService.checkshoppingcart(loginUser);
    }
}
