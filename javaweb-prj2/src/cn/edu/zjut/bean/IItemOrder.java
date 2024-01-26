package cn.edu.zjut.bean;

public interface IItemOrder {
    public void incrementNumItems();
    public void cancelOrder();
    public double getTotalCost();
    public IItem getItem();
    public void setItem(IItem item);
    public int getNumItems();
    public void setNumItems(int numItems);
}
