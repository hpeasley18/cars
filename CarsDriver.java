public class CarsDriver{

//main
public static void main(String[] args) {

  Cars c = new Cars("Tesla", "Model S", 126120.50);
  Sedan s = new Sedan("Honda", "Accord", 28050.99, 4);
  Truck t = new Truck("Ford", "F150", 36495.73, 7);

  System.out.println(c + "\n");
  System.out.println(s + "\n");
  System.out.println(t + "\n");

  c.drive();
  s.drive();
  t.drive();
  }
}
