import java.util.*;
public class s21 {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        System.out.println("Please enter the year");
        int year=y.nextInt();
        if (year % 4 == 0 && year % 100!= 0 || year%400 == 0)
        {
           System.out.println(" year is a leap year");
        }
        else{
            System.out.println("NOT An leap year");
        }
        y.close();
    }
}
