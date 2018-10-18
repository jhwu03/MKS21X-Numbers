public class RationalNumber extends RealNumber{
  private int denominator;
  private int numerator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    if(deno == 0 ){
      numerator = 0;
      denominator = 1;
    }
    else{
      numerator = nume;
      denominator = deno;
    }
    if(deno < 0){
      denominator = Math.abs(denominator);
      numerator = numerator * -1;
    }
  }

  public double getValue(){
      return ((double)numerator / (double)denominator);
    }
  public int getNumerator(){
    return numerator;
    }
  public int getDenominator(){
    return denominator;
    }
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator,numerator);
   }

   public boolean equals(RationalNumber other){
     if ((this.getNumerator() == other.getNumerator()) && (this.getDenominator() == other.getDenominator())){
       return true;
     }
     else{return false;}
   }


  public String toString(){
    if(numerator == 0){
      return "" + 0;
    }
    if(denominator == 1){
      return "" + numerator;
    }
    return numerator + "/" + denominator;
  }
  private static int gcd(int a, int b){
    if(b !=0){
      gcd(b, a % b);
    }
    return a;
 }
 private void reduce(){
   int n = numerator;
   numerator = numerator / gcd(numerator,denominator);
   denominator = denominator / gcd(n,denominator);
  }
 public RationalNumber multiply(RationalNumber other){
   return new RationalNumber(this.getNumerator() * other.getNumerator(), this.getDenominator() * other.getDenominator());
    }
 public RationalNumber divide(RationalNumber other){
   return new RationalNumber(this.getNumerator() * other.getDenominator(), this.getDenominator() * other.getNumerator());
      }
 public RationalNumber subtract(RationalNumber other){
   int newDenominator = this.getDenominator() * other.getDenominator();
   int newNumerator = this.getNumerator() * other.getDenominator() - other.getNumerator() * this.getDenominator();
   return new RationalNumber(newNumerator, newDenominator);
    }


}
