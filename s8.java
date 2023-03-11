import java.util.Scanner;
public class s8 {
    public static void main(String[] args) {
       Scanner t=new Scanner(System.in);
       System.out.println("Enter the temprature"); 
       double fer=t.nextDouble();
       double temp=((fer-32)*5)/9;
       System.out.println(" tempreature is "+temp+" degree celcius");

       t.close();     
    }
}
