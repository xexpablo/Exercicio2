import Empresa.Empresa;
import Pessoa.Pessoa;
import javax.swing.*;

public class main
{
    static Pessoa pessoa = new Pessoa();
    static Empresa empresa = new Empresa();
    public static void main(String[] args)
    {
        int opt = 0;
        int choose;
        String escolhePessoa;
        while(opt != 2){
            choose = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções:\n1 - Contratar uma Pessoa\n2 - Exibir Funcionários"));
            if(choose == 1){
                escolhePessoa = JOptionPane.showInputDialog("Escolha uma das Pessoas Cadastradas: " + retornaLista());
                empresa.contratar(escolhePessoa);
            }
            else if(choose == 2){
                empresa.exibir();
            }
            else{
                System.out.println("Opção Inválida!");
            }
            opt = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção abaixo:\n 1 - Continuar\n 2 - Sair"));
        }
    }

    public static String retornaLista(){
        String listPessoas = "";
        for(int i = 0; i < pessoa.pessoas.length; i++) {
            listPessoas = listPessoas + "\n" + String.valueOf(pessoa.pessoas[i][0]);
        }
        return listPessoas;
    }
}
