import java.util.*;

public class s22 {
    public static void percentage(){
        Scanner m=new Scanner(System.in);
    int mr=m.nextInt();
    
               if(mr>40 && mr<51){
            System.out.println("your grade is DD");
        }
        

 
       
    
     else   if(mr>50 && mr<61){
            System.out.println("your grade is CD");

        }
        
       
            else   if(mr>60 && mr<71){
            System.out.println("your grade is BC");
       }
        

    
    
     else   if(mr>70 && mr<81){
            System.out.println("your grade is BB");

        }
        
       
    
     else   if(mr>80 && mr<91){
            System.out.println("your grade is AB");

        }
        else {
            System.out.println("sorry you are fail");

        }
        
       
    
       else if(mr>90 && mr<=100){
            System.out.println("your grade is AA");

        }
        
       

    
    
    }

    public static void main(String[] args) {

        percentage();
    }
}
