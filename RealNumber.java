public class RealNumber{
  private double value;

  public RealNumber(){
    value = 10.0;
  }
  public RealNumber(double a){
    value = a;
  }
  public double add(RealNumber other){
    return this.getValue() + other.getValue();
  }
  public double multiply(RealNumber other){
    return this.getValue() *other.getValue();
  }
  public double divide(RealNumber other){
    return this.getValue() / other.getValue();
  }
  public double subtract(RealNumber other){
    return this.getValue() - other.getValue();
  }
  public double getValue(){
    return value;
  }
  public String toString(){
    return "" + value;
  }
}
