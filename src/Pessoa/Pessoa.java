package Pessoa;

import java.util.Random;

public class Pessoa
{
    public String[][] pessoas = {{"Pablo",idadeAleatoria()},{"Higor",idadeAleatoria()},{"Guilherme",idadeAleatoria()},
            {"Rodrigo",idadeAleatoria()},{"Lucas",idadeAleatoria()},{"Danilo",idadeAleatoria()},{"João",idadeAleatoria()},
            {"Júlio",idadeAleatoria()},{"Arnaldo",idadeAleatoria()},{"Luiz",idadeAleatoria()}};

    private String nome;
    private int idade;

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String idadeAleatoria()
    {
        Random random = new Random();
        return String.valueOf(random.nextInt(100 - 18) + 18);
    }
}
