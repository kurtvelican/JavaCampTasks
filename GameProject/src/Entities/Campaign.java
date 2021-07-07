package Entities;

public class Campaign {
    public int id;
    public String name;
    public float discountAmount;

    public Campaign(int id,String name,float discountAmount) {
        this.id = id;
        this.name = name;
        this.discountAmount = discountAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(float discountAmount) {
        this.discountAmount = discountAmount;
    }
}
