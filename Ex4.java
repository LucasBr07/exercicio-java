import java.util.Scanner;
public class Ex4 {
    public static void main(String args[]){
    Scanner leitor = new Scanner(System.in);
    String letra;
    System.out.println("digite uma letra:");
    letra = leitor.nextLine();
    if ( letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
        System.out.println("é uma vogal");
    } else {
        System.out.println("é uma consoante");
        
    }
    }
}
