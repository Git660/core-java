import java.util.*;
public class s9{

public static void main(String[] args) {
    Scanner i=new Scanner(System.in);
    System.out.println("Enter the principle amount");
    double pa=i.nextDouble();
    System.out.println("Enter timeperiod");
    int t=i.nextInt();
    System.out.println("Enter the rate of intrest");
    double r=i.nextDouble();
    double si=(pa*r*t)/100;
    double ci=pa*Math.pow(1.0+( r/100),t)-pa;

    System.out.println("calculated simple intrest is"+si);
    System.out.println("calculated compound intrest is"+ci);

    i.close();
}

}