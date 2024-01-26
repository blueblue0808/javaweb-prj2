package cn.edu.zjut.service;
import cn.edu.zjut.bean.IItemOrder;
import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.dao.IUserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserService implements IUserService{
    private IUserDAO userDAO = null;
    public UserService(){
        System.out.println("create UserService.");
    }
    public void setUserDAO(IUserDAO userDAO) {
        System.out.println("--setUserDAO--");
        this.userDAO = userDAO;
    }
    public void login(UserBean user) {
        System.out.println("execute --login()-- method.");
        userDAO.search(user);
    }
    public void checkshoppingcart(UserBean user){
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        UserBean userBean=(UserBean)
//                ctx.getBean("userbean");
        if(user.getShoppingcart()!=null){
            List<IItemOrder> items=user.getShoppingcart().getItemsOrdered();
            for(int i=0;i<items.size();i++)
            {
                System.out.println("书名：" + items.get(i).getItem().getTitle());
                System.out.println("数量：" + items.get(i).getNumItems());
                System.out.println("ID：" + items.get(i).getItem().getItemID());
                System.out.println("简介：" + items.get(i).getItem().getDescription());
                System.out.println("价格：" + items.get(i).getItem().getCost());
            }
        }

    }
}
