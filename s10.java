import java.util.*;
public class s10 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        int c=n.nextInt();
        if(a==b && a==c){
            System.out.println("ALL ARE EQUAL");
        }
        else if(b==a || b==c)
        {
            System.out.println("ANY OF TWO ARE EQUAL");

        }
        else if(c==a || c==b)
        {
            System.out.println("ANY OF TWO ARE EQUAL");
            
        }
        else{
            System.out.println("please enter valid numbers");
        }
        
        n.close();

    }
}
