import java.util.Scanner;

public class ProgramaEmprestimoEstatal {
public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
System.out.println("bem-vindos ao programa de empr�stimo Estatal");
double salarioBruto;
double emprestimoSolicitado;
double quantidadePrestacao;
System.out.println("Insira o valor de seu sal�rio bruto:");
salarioBruto = teclado.nextDouble();
System.out.println("Insira o valor de empr�stimo solicitado:");
emprestimoSolicitado = teclado.nextDouble();
System.out.println("Insira a quantidade de presta��es:");
quantidadePrestacao = teclado.nextDouble();
double calcularPorcentagem = salarioBruto * 30 / 100;
double calcularPrestacao = emprestimoSolicitado / quantidadePrestacao;

if(calcularPrestacao <= calcularPorcentagem) {
System.out.println("Parab�ns, seu empr�stimo foi aprovado");
System.out.println("O valor da presta��o � de: " + calcularPrestacao);
} else {
System.out.println("que pena, seu empr�stimo foi recusado.");
System.out.println("seu limite dispon�vel por parcela � de: " + calcularPorcentagem);
} // fim da condicional if else

System.out.println("Fim do Programa");

teclado.close();
} // fim do m�todo main

} // fim da classe
