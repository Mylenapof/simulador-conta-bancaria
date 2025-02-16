/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetocontabanco;

import java.util.Scanner;

public class ProjetoContaBanco {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao = 1;

        do {

            ContaBanco conta = new ContaBanco();

            System.out.print("Digite o número da conta: ");
            conta.setNumConta(scan.nextInt());
            scan.nextLine();

            System.out.print("Digite o nome do dono: ");
            conta.setDono(scan.nextLine());

            System.out.print("Escolha o tipo da conta (1 - Conta Corrente 2 - Conta Poupança): ");
            conta.abrirConta(scan.nextLine());

            System.out.print("Digite o valor para depósito inicial: ");
            conta.Depositar(scan.nextFloat());

            conta.estadoAtual();

            System.out.print("Deseja sacar algum valor? (1 - Sim  2 - Não): ");
            scan.nextLine();
            if (scan.nextLine().equals("1")) {
                System.out.print("Digite o valor do saque: ");
                conta.Sacar(scan.nextFloat());
            }

            conta.estadoAtual();
            System.out.print("Deseja criar uma nova conta? (1 - Sim  2 - Não): ");
            scan.nextLine();
            opcao = scan.nextInt();
        } while (opcao == 1);
        scan.close();
    }
}
