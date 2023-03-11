import java.util.*;

import java.util.*;

public class s23 {
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.print("What is your name");
        String nm=b.nextLine();
        System.out.print("How much quantity have you purchased?");
        int qty=b.nextInt();
        System.out.print("let me know the price of the product");
        double p=b.nextDouble();

        double dis=0;
        if(qty>=2){
            dis=20;

        }
        else{
            dis=10;
        }
        double dsc=(p*qty*dis)/100;
        double ap=p*qty-dsc;
        System.out.println("Hello"+ nm  + "total amount payable is  "+ ap+"\n discount applied to you is "+dis+"%");
        
        
        


        
    }
}
