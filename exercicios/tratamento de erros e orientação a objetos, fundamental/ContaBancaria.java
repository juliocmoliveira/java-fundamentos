public class ContaBancaria {
    double saldo = 0;

    public void Deposito(double valor){
        this.saldo += valor;
        System.out.println(saldo);
    }
    public void Saque(double valor){
        this.saldo -= valor;
        System.out.println(saldo);
    }
}
