public class Produto implements Calculavel{
    private String nome;
    private double preco;
    private CategoriaProduto categoriaProduto;

    public Produto(String nome, double preco, CategoriaProduto categoriaProduto){
        this.nome = nome;
        this.preco = preco;
        this.categoriaProduto = categoriaProduto;
    }

    public double calcularImposto(){
        return preco * 0.10;
    }

    @Override
    public double calcularJuros() {
        return preco * 0.30;
    }

    @Override
    public double calcularLucro() {
        return 0;
    }

    @Override
    public double calcularDesconto() {
        return 0;
    }

    @Override
    public double calcularTaxaManuseio() {
        return 5.0;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + calcularImposto() + calcularTaxaManuseio();
    }

    @Override
    public double calcularTotal() {
        return calcularPrecoFinal();
    }

    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
