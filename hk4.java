import java.util.Scanner;
class hk4
{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner kl=new Scanner(System.in);
        
        
        int Number_of_classes_held=kl.nextInt();
        int Number_of_classes_attended=kl.nextInt();
        int per=(Number_of_classes_attended*Number_of_classes_held)/100;
        if(per>=75)
        {
            System.out.println(per+"\nYes");
            
        }
        else
             System.out.println(per+"\nNo");
    }
}