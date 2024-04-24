package br.com.viniciusintech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInteger = new Scanner(System.in);
        Scanner scannerDouble = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numberAccount = scannerInteger.nextInt();

        System.out.println("Digite o número da agência: ");
        String agency = scannerString.nextLine();

        System.out.println("Digite o seu nome: ");
        String name = scannerString.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double balance = scannerDouble.nextDouble();

        System.out.println("Olá "+name+", obrigado por criar uma conta em nosso banco, sua agência é "+agency+" conta "+numberAccount+" e seu saldo "+balance+" já está disponível para saque");

    }
}