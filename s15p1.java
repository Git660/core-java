import java.util.Scanner;
public class s15p1 {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        System.out.println(" enter your name");

        String nm=v.nextLine();
        System.out.println("enter your age");

        int age=v.nextInt();
        if(age>=18){
            System.out.println("Hello"+nm+" you are  eligible for voting");

        }
        else{
            System.out.println("Sorry "+nm+" you are not eligible for voting");
            
        }
        v.close();
    }
}
