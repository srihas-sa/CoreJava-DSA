package Enum;

public class Enum {
  public static void main(String args[]) {
    enum Laptop {
      Ideapad(2000), macbook(100), Lenovo(3000);

      int price;

      Laptop(int price) {
        this.price = price;
      }

    }
    for (Laptop lap : Laptop.values()) {
      System.out.println(lap.ordinal());
      System.out.println(lap.name());
    }
    Laptop e1 = Laptop.Ideapad;

    System.out.print(e1.price);
  }
}
