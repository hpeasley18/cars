public class Cars{
  protected String m_make;
  protected String m_model;
  protected double m_price;

  // default constructor
  public Cars(){
    m_make = null;
    m_model = null;
    m_price = 0.0;
  }

  // fully specified constructor
  public Cars(String mke, String mod, double pr){
    m_make = mke;
    m_model = mod;
    m_price = pr;
  }

  // copy constrctor
  public Cars(Cars i){
    this.m_make = i.m_make;
    this.m_model = i.m_model;
    this.m_price = i.m_price;
  }
  // accessors
  public String getMake(){
    return m_make;
  }

  public String getModel(){
    return m_model;
  }

  public double getPrice(){
    return m_price;
  }

  // toString method
  public String toString(){
    String s = "";
    s += "\nThe make is: " + m_make;
    s+= "\nThe model is: " + m_model;
    s+= "\nThe price is: " + m_price;
    return s;
  }

  // equals method
  public boolean equals(Object o){
    if(this==o){
      return true;
    }
    if (!(o instanceof Cars)){
      return false;
    }else{
      Cars i = (Cars) o;
      return this.m_make.equals(i.m_make);
    }
  }

  // a random method
  public void drive(){
    System.out.println("VROOM VROOM!");
  }
}

//   //main
//   public static void main(String[] args) {
//
//     Cars c = new Cars("Tesla", "Model S", 126120.50);
//     Sedan s = new Sedan("Honda", "Accord", 28050.99, 4);
//     Truck t = new Truck("Ford", "F150", 36495.73, 7);
//
//     System.out.println(c + "\n");
//     System.out.println(s + "\n");
//     System.out.println(t + "\n");
//
//     c.drive();
//     s.drive();
//     t.drive();
// }
