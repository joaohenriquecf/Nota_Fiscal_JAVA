public class NotaFiscal {

    private Cliente cliente;
    private Produto produto1, produto2, produto3;

    public void adicionarCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void adicionarProduto1(Produto produto){
        this.produto1 = produto;
    }

    public void adicionarProduto2(Produto produto){
        this.produto2 = produto;
    }

    public void adicionarProduto3(Produto produto){
        this.produto3 = produto;
    }

    public void emitirNota() {
        System.out.println("--------- Nota Fiscal ---------");
        System.out.println("Cliente: " + cliente.getNomeCliente());
        System.out.println("CPF: " + cliente.getCPF());


        System.out.println("\nProduto1: ");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Quantidade: " + );
    }
}
