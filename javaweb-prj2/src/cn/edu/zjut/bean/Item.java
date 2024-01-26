package cn.edu.zjut.bean;
import cn.edu.zjut.bean.IItem;
public class Item implements IItem{
    private String itemID;
    private String title;
    private String description;
    private double cost;
    public Item(String itemID, String title,
                String description, double cost) {
        this.itemID = itemID;
        this.title = title;
        this.description = description;
        this.cost = cost;
        System.out.println("create Item.");
    }

    public String getItemID() {
        return itemID;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
