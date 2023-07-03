/**
 * notebook
 */
public class notebook {
    String model;
    String color;
    String OS;
    int RAM;
    int HDD;
    int price;

    public notebook(String model, String color, String OS, int RAM, int HDD, int price){
        this.model = model;
        this.color = color;
        this.OS = OS;
        this.RAM = RAM;
        this.HDD = HDD;
        this.price = price;
    }

    public notebook(String model, int price)
    {
        this.model = model;
        this.price = price;
    }

    public String getModel(){
        return model;
    }

     public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

     public String getOS(){
        return OS;
    }

    public void setOS(String OS){
        this.OS = OS;
    }

    public int getRAM(){
        return RAM;
    }

    public void setRAM(int RAM){
        this.RAM = RAM;
    }

    public int getHDD(){
        return HDD;
    }

    public void setHDD(int HDD){
        this.HDD = HDD;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        String specifications = "\n Модель - " + model + "; Цвет - " + color + "; ОС - " + OS + "; ОЗУ - " + RAM + "; HDD - " + HDD + "; Цена - " + price +"\n\n";
       return specifications;
    }
}