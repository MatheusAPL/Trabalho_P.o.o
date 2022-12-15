public class Pessoa {

    private Integer Matricula;
    private String nome;
    private Integer cpf;
    private String endereco;
    private double idade;



    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getCodigo() {
        return Matricula;
    }

    public void setCodigo(Integer Matricula) {
        this.Matricula = Matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Matricula: "+Matricula+ "" +
                "\n"+ "Nome: "+nome+"" +
                "\n"+"Idade: "+cpf+"" +
                "\n"+"Endereço: "+endereco+"" +
                "\n"+"Idade: "+idade+"\n";
    }
}
