package Myjava;
//像这样的类只有私有的属性，和get set方法的 叫实体类
//一般一个类对应一个数据库表
public class LoL {
    private double price;
    private  String coloe;
    private  String typeName;



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColoe() {
        return coloe;
    }

    public void setColoe(String coloe) {
        this.coloe = coloe;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "LoL{" +
                "price=" + price +
                ", coloe='" + coloe + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }

}

