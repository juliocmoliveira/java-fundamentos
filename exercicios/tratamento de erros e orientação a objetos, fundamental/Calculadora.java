public class Calculadora {
    int n1;
    int n2;
    public Calculadora(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public void soma(){
        System.out.println("Soma: " + (n1 + n2));
    }
    public void subtrair(){
        System.out.println("Subtração: " + (n1 - n2));
    }
    public void multiplica(){
        System.out.println("Multiplicação: " + (n1 * n2));
    }
}
