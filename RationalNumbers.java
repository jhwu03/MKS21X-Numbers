public class RationalNumbers extends RealNumbers{
  private int denom;
  private int num;
  public RationalNumbers(){
    super(50.0);
  }
  public RationalNumbers(int numerator, int denomerator){
  }

  public String toString(){
    return "/";
  }

  public boolean greaterThan(RationalNumbers s){
    return false;
  }
  public boolean lessThan(RationalNumbers s){
    return false;
  }
  public void Reduce(RationalNumbers x){

  }

}
