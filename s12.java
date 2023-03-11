import java.util.*;

public class s12 {
   public static void main(String[]args){

Scanner g=new Scanner(System.in);
System.out.println("please enter your gender");
char gender=g.next().charAt(0);
if(gender=='m'){
    System.out.println("Hello,Sir how are you");


}
else{
    System.out.println("Hello,Maam how are you");
}


g.close();

   } 
}