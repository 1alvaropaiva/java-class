package aulas.dio.testes;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = scanner.nextDouble();
        if (saldo<0){
            System.out.println("Negativado");
        } else if (saldo >= 0 && saldo <= 500){
            System.out.println("Baixo");
        } else {
            System.out.println("Confortável");
        }
        scanner.close();
    }
}
