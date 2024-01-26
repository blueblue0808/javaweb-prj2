package cn.edu.zjut.app;
import cn.edu.zjut.bean.IItemOrder;
import cn.edu.zjut.bean.IShoppingCart;
import cn.edu.zjut.bean.UserBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.edu.zjut.bean.IItem;

import java.util.*;

public class SpringBeanTest {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        IItem item1 = (IItem) ctx.getBean("item1");
//        System.out.println(item1.getItemID());
//        System.out.println(item1.getTitle());
//        System.out.println(item1.getDescription());
//        System.out.println(item1.getCost());
//        IItem item2 = (IItem) ctx.getBean("item2");
//        System.out.println(item2.getItemID());
//        System.out.println(item2.getTitle());
//        System.out.println(item2.getDescription());
//        System.out.println(item2.getCost());

//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        IItemOrder itemorder1 = (IItemOrder)
//                ctx.getBean("itemorder1");
//        System.out.println("书名：" + itemorder1.getItem().getTitle());
//        System.out.println("数量：" + itemorder1.getNumItems());
//        IItemOrder itemorder2 = (IItemOrder)
//                ctx.getBean("itemorder2");
//        System.out.println("书名：" + itemorder2.getItem().getTitle());
//        System.out.println("数量：" + itemorder2.getNumItems());

        //使用list
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                    "applicationContext.xml");
//            IShoppingCart shoppingcart = (IShoppingCart)
//                    ctx.getBean("shoppingcart");
//            List<IItemOrder> items=shoppingcart.getItemsOrdered();
//            for(int i=0;i<items.size();i++)
//            {
//                System.out.println("书名：" + items.get(i).getItem().getTitle());
//                System.out.println("数量：" + items.get(i).getNumItems());
//        }

        //使用set
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        IShoppingCart shoppingcart = (IShoppingCart)
//                ctx.getBean("shoppingcart");
//        Set<IItemOrder> items=shoppingcart.getItemsOrdered();
//        Iterator<IItemOrder> iterator = items.iterator();
//        while (iterator.hasNext())
//        {
//            IItemOrder item=iterator.next();
//            System.out.println("书名：" + item.getItem().getTitle());
//            System.out.println("数量：" + item.getNumItems());
//        }

//使用map
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        IShoppingCart shoppingcart = (IShoppingCart)
//                ctx.getBean("shoppingcart");
//        Map<String,IItemOrder> items=shoppingcart.getItemsOrdered();
//        for (String key : items.keySet()) {
//            IItemOrder item = items.get(key);
//            System.out.println("书名：" + item.getItem().getTitle());
//            System.out.println("数量：" + item.getNumItems());
//        }

//        使用Properties
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//        IShoppingCart shoppingcart = (IShoppingCart)
//                ctx.getBean("shoppingcart");
//        Properties items=shoppingcart.getItemsOrdered();
//        for (String key : items.stringPropertyNames()) {
//            String item = items.getProperty(key);
//            System.out.println(item);
//        }


//调用userbean访问购物车
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        UserBean userBean=(UserBean)
                ctx.getBean("userbean");
        List<IItemOrder> items=userBean.getShoppingcart().getItemsOrdered();
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
