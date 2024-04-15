import java.util.*;
public class currencyconv {
    //variable declaration
    public static double yen, dollar, euro, Y,D,E;
    //constructor
    currencyconv(){
        Y = 0.57;
        D = 83;
        E = 91;
    }
    //method to convert yen,dollar,euro to indian rupee
    public static void toInr(double yen, double dollar, double euro){
        double ry, rd, re;
        ry = yen*Y;
        rd = dollar*D;
        re = euro*E;
        System.out.println("Rupees equivalent of "+yen+" yen is Rs: "+ry);
        System.out.println("Rupees equivalent of "+dollar+" yen is Rs: "+rd);
        System.out.println("Rupees equivalent of "+euro+" yen is Rs: "+re);
    }
    //method to convert indian rupee to yen,dollar,euro
    public static void inrTo(double inr){
        double y,d,e;
        y = inr/Y;
        d = inr/D;
        e = inr/E;
        System.out.println("Yen equivalent of "+inr+" inr is Yen: "+String.format("%.2f",y));
        System.out.println("Dollar equivalent of "+inr+" inr is Dollar: "+String.format("%.2f",d));
        System.out.println("Euro equivalent of "+inr+" inr is Euro: "+String.format("%.2f",e));
    }
    //main class
    public static void main(String[] args){
        //object and variable declaration
        Scanner sc = new Scanner(System.in);
        currencyconv c = new currencyconv();
        double yen=0, dollar=0, euro=0, inr=0;
        
        // currency conversion method 1
        System.out.println("Currency conversion: Yen,Dollar,Euro to INR");
        System.out.print("enter yen: ");
        yen = sc.nextDouble();
        System.out.print("enter dollar: ");
        dollar = sc.nextDouble();
        System.out.print("enter euro: ");
        euro = sc.nextDouble();
        toInr(yen,dollar,euro);

        System.out.println("-----------------------------");
        
        //currency conversion method 2
        System.out.println("Currency conversion: INR to Yen,Dollar,Euro");
        System.out.print("enter inr: ");
        inr = sc.nextDouble();
        inrTo(inr);
    }
}
