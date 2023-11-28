public class FractionMain{
    public static void main(String[] args){


        try{
            Fraction f = new Fraction(3, 0);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException works");
        }

        Fraction f = new Fraction(2, 3);
        System.out.println("Constructor works: " + f);

        f.setNum(4);
        f.setDenom(3);

        System.out.println("Setters work: " + f);
        System.out.println("Getters work: " + f.getNum() + "/" + f.getDenom());

        Fraction g = new Fraction(12, 9);
        System.out.println("Fractions are always reduced: " + g);

        Fraction h = new Fraction(121, 297);
        System.out.println("add works: " + f.add(h));

        Fraction i = new Fraction (4, 3);
        System.out.println("equals works: " + i.equals(g));
    }
}