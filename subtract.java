import java.util.Scanner;
public class subtract {

    public static void main(String[] args) {
        int m, n;   
        Scanner sc=new Scanner(System.in);   
        System.out.print("Enter your number : ");   
        n = sc.nextInt();   
        System.out.print("Enter your number: ");   
        m = sc.nextInt();   
        
        if(n<=m)
            System.out.println(m-n);
        else
            System.out.println(n-m);
    }
}
