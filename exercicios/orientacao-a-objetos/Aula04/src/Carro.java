public class Carro extends Veiculo{
    private int qtdPortas;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public void exibirDetalhes(){
        System.out.println(getMarca());
        System.out.println(getModelo());
        System.out.println(qtdPortas);
    }
}
