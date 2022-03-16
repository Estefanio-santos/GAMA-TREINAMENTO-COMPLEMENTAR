import java.util.Scanner;

public class ProgramaMedia {

public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
System.out.println("Bem-vindos ao programa para cálculo de média!");
double nota1, nota2;
System.out.println("Insira uma nota:");
nota1 = teclado.nextDouble();
System.out.println("Insira outra nota:");
nota2 = teclado.nextDouble();
double media = ( nota1 + nota2 ) / 2;
System.out.println("A média aritmética das notas informadas é de: " + media);

teclado.close();
System.out.println("Fim do Programa");
} // fim do método main

} // fim da classe
