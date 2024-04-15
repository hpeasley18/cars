// we want Truck class to own everything Cars has PLUS whatever else we want to specify
public class Truck extends Cars{

  protected int m_bedLength;
  /*always call the super constrctor at the very beginning of the childs constructor*/

  public Truck(){
    super(); //MUST ALWAYS: calling the default constructor for the SUPER CLASS (Cars)
    m_bedLength = 7; // bedLength in feet
  }

  public Truck(double pr, int b){
    super("Ford", "F150", pr); // info fed to the SUPER CLASS' constructor
    m_bedLength = b;
  }

  public Truck(String mke, String mod, double pr, int b){
    super(mke, mod, pr);
    m_bedLength = b;
  }

  // toString method
  public String toString(){
    //use the toString from super class
    String s = super.toString();
    s += "\nThe bed length in feet is: " + m_bedLength;
    return s;
  }

  public int getBedLength(){
    return m_bedLength;
  }

  // drive method for Truck
  public void drive(){ //overridden method
    System.out.println("Yeee-Haww! ");
  }
}
