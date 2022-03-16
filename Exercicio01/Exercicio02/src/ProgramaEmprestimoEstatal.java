import java.util.Scanner;

public class ProgramaEmprestimoEstatal {
public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
System.out.println("bem-vindos ao programa de empréstimo Estatal");
double salarioBruto;
double emprestimoSolicitado;
double quantidadePrestacao;
System.out.println("Insira o valor de seu salário bruto:");
salarioBruto = teclado.nextDouble();
System.out.println("Insira o valor de empréstimo solicitado:");
emprestimoSolicitado = teclado.nextDouble();
System.out.println("Insira a quantidade de prestações:");
quantidadePrestacao = teclado.nextDouble();
double calcularPorcentagem = salarioBruto * 30 / 100;
double calcularPrestacao = emprestimoSolicitado / quantidadePrestacao;

if(calcularPrestacao <= calcularPorcentagem) {
System.out.println("Parabéns, seu empréstimo foi aprovado");
System.out.println("O valor da prestação é de: " + calcularPrestacao);
} else {
System.out.println("que pena, seu empréstimo foi recusado.");
System.out.println("seu limite disponível por parcela é de: " + calcularPorcentagem);
} // fim da condicional if else

System.out.println("Fim do Programa");

teclado.close();
} // fim do método main

} // fim da classe
