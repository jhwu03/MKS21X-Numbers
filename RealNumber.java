public class RealNumber{
  private double value;
  public RealNumbers(){
    n = 100.0;
  }
  public RealNumbers(double a){
    value = a;
  }
  public double add(RealNumber other){
    return value + other.getValue();
  }
  public double getValue(){
    return value;
  }
  public void setReal(double h){
  }
  public String toString(){
    return "" + getReal();
  }
}
