package Empresa;

import java.util.ArrayList;

public class Empresa
{
    ArrayList<String> funcionarios = new ArrayList<>();
    public void contratar(String nome)
    {
        funcionarios.add(nome);
        System.out.println("O " + nome + " foi contratado com sucesso.");
    }

    public void exibir(){
        String nomes = "";
        for (int i = 0; i < funcionarios.toArray().length; i++){
            nomes = nomes + "\n" + funcionarios.get(i);
        }
        System.out.println("Funcionarios Contratados: " + nomes);
    }
}

