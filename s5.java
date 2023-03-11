import java.util.Scanner;
public class s5 {
    public static void main(String[] args) {
        Scanner area=new Scanner(System.in);
        System.out.println("Please enter the height of rectangle ");

        int h=area.nextInt();
        System.out.println("Please enter the width of rectangle ");

        int w=area.nextInt();

        int res=h*w;
        double per=2*(h+w);


    
        System.out.println("Area of rectangle is "+ res);
        System.out.println("Perimeter of rectangle is  "+ per); 



        area.close();
    }
}
