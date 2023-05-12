import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) throws Exception {
                Scanner leitor = new Scanner(System.in);
                int num1;
            
              System.out.println("digite o primeiro número");
              num1 = leitor.nextInt();
              if (num1 > 0) {
                System.out.println("o numero " + num1 + " é positivo");
              } else {
                System.out.println("o numero " + num1 + " é negativo");
              }

    }}