
package classeabstrata;

public abstract class Funcionario {
    private int NumeroCracha;
    private String Nome;
    private String Setor;
    private String Funcao;
    
    public Funcionario(){
        
    }
    
    public Funcionario(int NumeroCracha, String Nome, String Setor, String Funcao){
        this.NumeroCracha = NumeroCracha;
        this.Nome = Nome;
        this.Setor = Setor;
        this.Funcao = Funcao;
    }
    public String Imprimir(){
        return "Cracha: " + getNumeroCracha() + "\nNome: " + getNome() + "\nSetor: " + getSetor() + "\nFunção: " + getFuncao();
    }
    
    public abstract double CalcularSalario();

    /**
     * @return the NumeroCracha
     */
    public int getNumeroCracha() {
        return NumeroCracha;
    }

    /**
     * @param NumeroCracha the NumeroCracha to set
     */
    public void setNumeroCracha(int NumeroCracha) {
        this.NumeroCracha = NumeroCracha;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Setor
     */
    public String getSetor() {
        return Setor;
    }

    /**
     * @param Setor the Setor to set
     */
    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    /**
     * @return the Funcao
     */
    public String getFuncao() {
        return Funcao;
    }

    /**
     * @param Funcao the Funcao to set
     */
    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }
    
    
    
}
