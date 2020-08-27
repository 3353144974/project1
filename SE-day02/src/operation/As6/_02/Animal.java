package operation.As6._02;

public class Animal {
  String name;
  String color;
  double jg;

    public Animal() {
    }

    public Animal(String name, String color, double jg) {
        this.name = name;
        this.color = color;
        this.jg = jg;
    }

    public void est(){
      System.out.println(name+"在吃饭");
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getJg() {
        return jg;
    }

    public void setJg(double jg) {
        this.jg = jg;
    }
}

