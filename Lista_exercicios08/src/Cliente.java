public class Cliente {

    private String nomeCliente;
    private int CPF;

    public Cliente(){

    }

    public Cliente (String nomeCliente, int CPF){
        this.nomeCliente = nomeCliente;
        this.CPF = CPF;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return ;
    }
}
