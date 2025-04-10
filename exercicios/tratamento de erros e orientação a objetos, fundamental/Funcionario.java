public class Funcionario {
    int horas;
    double valorHora;
    public Funcionario(int horas, double valorHora){
        this.horas = horas;
        this.valorHora = valorHora;
    }
    public void CalcularSalario(){
        System.out.println("O salario mensal: " + (horas * valorHora));
    }
}
