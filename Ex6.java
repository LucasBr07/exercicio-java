import java.util.Scanner;
public class Ex6 {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("digite um numero");
        num1 = leitor.nextInt();
        System.out.println("digite um numero:");
        num2 = leitor.nextInt();
        System.out.println("digite mais um numero:");
        num3 = leitor.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("esse e o maior numero:" + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("esse é o mai0r numero" + num2);
        }else if (num1 == num2 && num1 == num3 ){ 
            System.out.println("os números são iguais");
        
        }else{
            System.out.println("esse numero e grande" +  num3);
        }
}}
