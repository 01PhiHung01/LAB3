
package Dinhnghiamotphanso;

public class Fraction {
    private int numerator;
    private int denominator;
public Fraction() {
    numerator = 0;
    denominator = 1;
}
public Fraction(int numerator, int denominator) {
    if (denominator==0) {
        System.out.println("denominator are not equal to 0");   
    }
    else {
       this.numerator = numerator;
       this.denominator = denominator;
    } 
}  
public Fraction add(Fraction f) {
    int nu = numerator * f.denominator + f.numerator * denominator;
    int de = denominator * f.denominator;
    return new Fraction(nu,de);
}   
public Fraction sub(Fraction f) {
    int nu = numerator * f.denominator - f.numerator * denominator;
    int de = denominator * f.denominator;
    return new Fraction(nu,de);
}            
public Fraction mul(Fraction f) {
    int nu = numerator * f.numerator;
    int de = denominator * f.denominator;
    return new Fraction(nu,de);
}

public Fraction div(Fraction f) {
    int t = f.numerator;
    f.numerator = f.denominator;
    f.denominator = t;
    int nu = numerator * f.numerator;
    int de = denominator * f.denominator;
    return new Fraction(nu,de);
}  
public void reduce() {
    int a = numerator;
    int b = denominator;
    int r = a % b;
    while (r != 0) {
        a = b;
        b = r;
        r = a % b;
    }
    numerator /= b;
    denominator /= b;         
}            
}



    
 
