import java.util.Scanner;

public class Ex3 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe o seu nome: ");
    String nome = ler.nextLine();
    System.out.println("Informe a sua idade: ");
    int idade = ler.nextInt();
    System.out.println("Olá " + nome + ", sua idade é " + idade);
  }
}
