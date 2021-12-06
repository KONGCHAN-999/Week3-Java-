import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);   
      System.out.print("Enter your number : ");   
      int a = sc.nextInt(); 
      
      int b, sum=1;
      for(b = 1; b<=a; b++){
        sum*=b;
      }
      System.out.println(sum);
    }
}