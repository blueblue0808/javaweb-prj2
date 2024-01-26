package cn.edu.zjut.bean;
import java.util.*;
public class ShoppingCart implements IShoppingCart {
    private List itemsOrdered;
    public List getItemsOrdered() {
        return (itemsOrdered);
    }
    public void setItemsOrdered(List itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

//     private Set itemsOrdered;
//    @Override
//    public void setItemsOrdered(Set itemsOrdered) {
//        this.itemsOrdered = itemsOrdered;
//    }
//    @Override
//    public Set getItemsOrdered() {
//        return itemsOrdered;
//    }

//    private Map itemsOrdered;
//    @Override
//    public void setItemsOrdered(Map itemsOrdered) {
//        this.itemsOrdered = itemsOrdered;
//    }
//    @Override
//    public Map getItemsOrdered() {
//        return itemsOrdered;
//    }

//    private Properties itemsOrdered;
//    @Override
//    public void setItemsOrdered(Properties itemsOrdered) {
//        this.itemsOrdered = itemsOrdered;
//    }
//    @Override
//    public Properties getItemsOrdered() {
//        return itemsOrdered;
//    }
}