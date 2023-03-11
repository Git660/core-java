import java.util.*;
public class s13 {
    public static void main(String[] args) {
        Scanner g=new Scanner(System.in);
        System.out.println("please enter your gender");
        char gender=g.next().charAt(0);
        if(gender=='m' || gender=='M'){
            System.out.println("Good morning sir");
        
        
        }
        else if(gender=='f' || gender=='F'){
            System.out.println("Good morning mam");
        }
        else{
            System.out.println("wrong input");
        }
        
        
        g.close();
         
    }
}
