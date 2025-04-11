public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public void exibirDetalhes(){
        System.out.println(getMarca());
        System.out.println(getModelo());
        System.out.println(cilindradas);
    }
}
