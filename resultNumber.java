import java.util.Scanner;
public class resultNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);   
        System.out.print("Enter your number : ");   
        int number = sc.nextInt();  
        
        if(number == 0)
            System.out.println(" -> Zero");
        else if(number>0)
            System.out.println(" -> Plus");
        else
            System.out.println(" -> Minus");
    }
}
