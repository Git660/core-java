import java.util.Scanner;
public class s7 {
    public static void main(String[] args) {
        Scanner ma=new Scanner(System.in);
        System.out.println("Enert your obtained marks in Maths");
        double maths=ma.nextDouble();
        System.out.println("Enert your obtained marks in Computer");
        double comp=ma.nextDouble();
        System.out.println("Enert your obtained marks in English");
        double eng=ma.nextDouble();
        double tm=maths+comp+eng;
        double percnt=tm*100/300;
        System.out.println("your total obtained marks is "+tm+" out of 300");
        System.out.println(" your percentage for this year is"+percnt+"%");


        ma.close();

    }
}
