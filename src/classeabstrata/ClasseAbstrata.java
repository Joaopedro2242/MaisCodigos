
package classeabstrata;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClasseAbstrata {

    public static void main(String[] args) {
    ArrayList<Funcionario> listFuncionarios = new ArrayList<>();
    int Cracha, opc = 0, Tipo, Horas;
    String Nome, Setor, Funcao;
    double Valor, Desconto;
    
    while(opc != 3){
        opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Funcionario\n2 - Mostrar\n3 - Sair"));
        switch(opc){
            case 1: 
                Cracha = Integer.parseInt(JOptionPane.showInputDialog("Crachá"));
                Nome = JOptionPane.showInputDialog("Nome");
                Setor = JOptionPane.showInputDialog("Setor");
                Funcao = JOptionPane.showInputDialog("Função");
                Tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo:\n1 - Horista\n2 - Mensalista"));
                if(Tipo == 1){
                    Horas = Integer.parseInt(JOptionPane.showInputDialog("Desconto"));
                    Valor = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
                    listFuncionarios.add(new FuncionarioHorista(Horas, Valor, Cracha, Nome, Setor, Funcao));
                }
                else{
                    Desconto = Double.parseDouble(JOptionPane.showInputDialog("Desconto"));
                    Valor = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
                    listFuncionarios.add(new FuncionarioMensalista(Valor, Desconto, Cracha, Nome, Setor, Funcao));
                
                }
                break;
                
            case 2:
                String msg = "";
                for(Funcionario F: listFuncionarios){
                    msg += F.Imprimir() + "\n\n";
                    
                }
                JOptionPane.showMessageDialog(null, msg);
                break;
        }
    }
    }
    
}
