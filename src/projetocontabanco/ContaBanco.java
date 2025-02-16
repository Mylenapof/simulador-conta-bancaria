/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocontabanco;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual() {
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        if (this.getTipo().equals("1")) {
            System.out.println("Tipo: Conta Corrente");
        } else {
            System.out.println("Tipo: Conta Poupança");
        }
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        if (this.getStatus()) {
            System.out.println("Status: Ativo");
        } else {
            System.out.println("Status: Inativo");
        }
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (t == "CC") {
            this.setSaldo(50);

        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
        } else if (this.saldo < 0) {
            System.out.println("Conta enão pode ser fechada pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void Depositar(float v) {
        if (this.gettStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em conta fechada!");
        }

    }

    public void Sacar(float v) {
        if (this.gettStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saldo");
            }
        } else {
            System.out.println("Impossivel sacar em conta fechada!");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.gettStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }

    //Getters e Setters são metodos especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n /*parametro */) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean gettStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public boolean getStatus() {
        return status;
    }

}
