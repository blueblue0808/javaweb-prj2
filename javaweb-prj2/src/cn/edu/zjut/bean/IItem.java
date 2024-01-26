package cn.edu.zjut.bean;

public interface IItem {
    public String getItemID();

    public double getCost();

    public String getDescription();

    public void setItemID(String itemID) ;

    public String getTitle();

    public void setCost(double cost);

    public void setDescription(String description);

    public void setTitle(String title);
}
