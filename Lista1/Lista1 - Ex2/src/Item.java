public class Item {
    int code , quantComprada;
    String desc;
    double precoItem;

    public Item (int code ,int quantComprada ,String desc ,double precoItem){

        this.precoItem = precoItem;
        this.code = code;
        this.desc = desc;
        this.quantComprada = quantComprada;
    }

    public Item(){
precoItem = 0;
code = 0;
desc = "";
quantComprada = 0;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getTotal(){
        return (getQuantComprada()*getPrecoItem());
    }

    public int getQuantComprada() {
        if(quantComprada<0)
            return quantComprada=0;
        else return quantComprada;
    }

    public void setQuantComprada(int quantComprada) {
        this.quantComprada = quantComprada;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrecoItem() {
        if(precoItem<0) return precoItem = 0;
        else return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
}
