public class Cliente {
   String nome;
   int idade;
   boolean isAdulto;

    public Cliente(int idade, String nome) {
       this.nome = nome;
       this.idade = idade;
       atualizarIsAdulto();
    }

    private void atualizarIsAdulto() {
        this.isAdulto = this.idade >= 18;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        atualizarIsAdulto();
    }

    public boolean isAdulto() {
        return isAdulto;
    }

    public void isAdulto(boolean isAdulto) {
        this.isAdulto = isAdulto;
    }

    public String verificaAcesso() {
        if (this.isAdulto) {
            return  this.nome +"Acesso permitido para ";
        } else {
            return  this.nome + "Acesso negado para ";
        }
    }
}
