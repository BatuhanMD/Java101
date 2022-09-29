import java.util.Scanner;
public class Main {
    public static int fibonacci(int x){
        if (x==1 || x==2){
            return 1;
        }
        return fibonacci(x-1)+fibonacci(x-2);
    }
    public static void main(String[] args) {
     System.out.println(fibonacci(10));
    }
}
