public class Fraction{
    int numerator;
    int denominator;

    public Fraction(int n, int d){
        if(d == 0){
            throw new ArithmeticException();
        }
        numerator = n;
        denominator = d;
        this.reduce();
    }

    public int getNum(){
        return numerator;
    }

    public int getDenom(){
        return denominator;
    }

    public void setNum(int n){
        numerator = n;
        this.reduce();
    }

    public void setDenom(int d){
        if(d == 0){
            throw new ArithmeticException();
        }
        denominator = d;
        this.reduce();
    }

    public void reduce(){
        int GCD = gcd(numerator, denominator);
        numerator /= GCD;
        denominator /= GCD;
    }

    public int gcd(int n, int d){

        //Euclidean algorithm for GCD using Lame's Theorem
        if(n == 0){
            return d;
        }
        else if(d == 0){
            return n;
        }

        if(n > d){
            return gcd(n % d, d);
        }
        else{
            return gcd(n, d % n);
        }
    }

    public Fraction add(Fraction a){

        Fraction output = new Fraction(1, 1);

        output.setNum(numerator * a.getDenom() + denominator * a.getNum());
        output.setDenom(denominator * a.getDenom());
        output.reduce();
        

        return output;
    }

    public boolean equals(Fraction a){
        if(numerator == a.getNum() && denominator == a.getDenom()){
            return true;
        }
        return false;
    }
    

    public String toString(){
        return String.valueOf(numerator) + "/" + String.valueOf(denominator);
    }
}