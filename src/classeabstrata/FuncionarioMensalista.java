
package classeabstrata;

public class FuncionarioMensalista extends Funcionario {
    private double Salario;
    private double Desconto;

    public FuncionarioMensalista() {
    }

    public FuncionarioMensalista(double Salario, double Desconto, int NumeroCracha, String Nome, String Setor, String Funcao) {
        super(NumeroCracha, Nome, Setor, Funcao);
        this.Salario = Salario;
        this.Desconto = Desconto;
    }

    @Override
    public String Imprimir() {
        return super.Imprimir()+"\nSalário: " + getSalario() + "\nDesconto: " + getDesconto() +
                "\nTotal: " + CalcularSalario();
    }   
    
    @Override
    public double CalcularSalario() {
        return getSalario() - getDesconto();
    }

    /**
     * @return the Salario
     */
    public double getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    /**
     * @return the Desconto
     */
    public double getDesconto() {
        return Desconto;
    }

    /**
     * @param Desconto the Desconto to set
     */
    public void setDesconto(double Desconto) {
        this.Desconto = Desconto;
    }

}