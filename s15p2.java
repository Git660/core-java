import java.util.*;
public class s15p2 {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        System.out.println(" enter your name");

        String nm=v.nextLine();
        System.out.println("enter your age");

        int age=v.nextInt();
        int va=18;
        int eligible=va-age;
        if(age>=18){
            System.out.println("Hello"+nm+" you are  eligible for voting");

        }
        else{
            System.out.println("Sorry "+nm+" you are not eligible for voting");
            System.out.println("You can vote after "+eligible+" years ");
        }
        v.close();
    }
}
