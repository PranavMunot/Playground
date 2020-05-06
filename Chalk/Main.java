import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noOfChalks = sc.nextInt();
        int noOfDays = 0;
        
        noOfDays = noOfChalks + (int)(noOfChalks*(1/Math.sqrt(noOfChalks))) + 1;
        
        System.out.println(noOfDays);
        
    }
}
