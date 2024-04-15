// we want Sedan class to own everything Cars has PLUS whatever else we want to specify
public class Sedan extends Cars{
  protected int m_cupHolders;

  /*always call the super constrctor at the very beginning of the childs constructor*/

  public Sedan(){
    super(); //MUST ALWAYS: calling the default constructor for the SUPER CLASS (Cars)
    m_cupHolders = 4;
  }

  public Sedan(double pr, int c){
    super("Honda", "Accord", pr); // info fed to the SUPER CLASS' constructor
    m_cupHolders = c;
  }

  public Sedan(String mke, String mod, double pr, int c){
    super(mke, mod, pr);
    m_cupHolders = c;
  }

  // toString method
  public String toString(){
    //use the toString from super class
    String s = super.toString();
    s += "\nThe number of cup holders is: " + m_cupHolders;
    return s;
  }

  public int getCupHolders(){
    return m_cupHolders;
  }

  // drive method for Sedan
  public void drive(){ //overridden method
    System.out.println("PURRR!");
  }
}
