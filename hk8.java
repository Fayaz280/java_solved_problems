import java.io.*;
import java.util.*;

class hk8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner kl=new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter the number of balls for 3 different colors: ");
        double c1 = input.nextDouble();
        double c2 = input.nextDouble();
        double c3 = input.nextDouble();
        
        int fullC1 = (int) Math.ceil(c1);
        int fullC2 = (int) Math.ceil(c2);
        int fullC3 = (int) Math.ceil(c3);
        
        System.out.println( fullC1 + " " + fullC2 + " " + fullC3);
    
        
    }
}