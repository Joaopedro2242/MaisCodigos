
package classeabstrata;

public class FuncionarioHorista extends Funcionario {
    private int QtdHoras;
    private double ValorHora;
    
    public FuncionarioHorista(){     
    }
    
    public FuncionarioHorista(int QntHoras, double ValorHora, int NumeroCracha, String Nome, String Setor, String Funcao){
        super(NumeroCracha, Nome, Setor, Funcao);
        this.QtdHoras = QtdHoras;
        this.ValorHora = ValorHora;
    }
    

    @Override
    public String Imprimir(){
        return super.Imprimir()+ "\nHoras: " + getQtdHoras() + "\nValorHora: " + getValorHora() + "\nTotal: " + CalcularSalario();
    }
    
    @Override
    public double CalcularSalario(){
        return getQtdHoras() * getValorHora();
    }

    /**
     * @return the QtdHoras
     */
    public int getQtdHoras() {
        return QtdHoras;
    }

    /**
     * @param QtdHoras the QtdHoras to set
     */
    public void setQtdHoras(int QtdHoras) {
        this.QtdHoras = QtdHoras;
    }

    /**
     * @return the ValorHora
     */
    public double getValorHora() {
        return ValorHora;
    }

    /**
     * @param ValorHora the ValorHora to set
     */
    public void setValorHora(double ValorHora) {
        this.ValorHora = ValorHora;
    }
         
    
    
}
