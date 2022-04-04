# Bertoti
Material da matéria engenharia de software 1

## Gustavo Lobato de Paulo RA: 1460482121025

## Diagrama de caso de uso

### Requisitos Funcionais

<img src = "https://github.com/Gustavoldp/Bertoti/blob/master/requisito%20funcional.png">

## Requisitos Não Funcionais


<img src="https://github.com/Gustavoldp/Bertoti/blob/master/euristicas.png">

#2 Semelhança ao mundo real: Usar ícones que lembrem objetos do dia a dia para facilitar a locomoção do usuário.

#7 Facilidade de uso: atalhos para facilitar a entrada em telas frequentemente visitadas ou para acelerar o processo para usuários mais experientes.

#8 Design minimalista: evitar colocar informações desnecessárias para não assustar o usuário.



## Diagrama de classe UML

<img src = "https://github.com/Gustavoldp/Bertoti/blob/master/UML.drawio.png">

~~~java

import java.util.LinkedList;
import java.util.List;

public class Plataforma de Ensino{

     private List<Pessoa> pessoas = new LinkedList<Pessoa>();

     public void cadastrarPessoa(Pessoa pessoas){
          pessoas.add(pessoas);
     }

     public List<Pessoa> buscarPessoaNome(String nome){
           List<Pessoa> encontradas = new LinkedList<Pessoa>();
           for(Pessoa pessoa:pessoas){
                if(pessoa.getNome().equals(nome)) encontradas.add(pessoa);
           }
           return encontradas;
     }

     public Pessoa buscarRa(int Ra){
          for(Pessoa pessoa:pessoas){
               if(pessoa.getRa().equals(Ra)) return pessoa; 
          }
          return null;
     }

     public List<Pessoa> getPessoas(){
           return pessoas;
     }
}



public class Pessoa{
	
	private int ra;
	private String nome;
	private String tipo;
	
	public Pessoa(int ra, String nome, String tipo) {
		this.ra = ra;
		this.nome = nome;
		this.tipo = tipo;
	}


	public int getRa(){
		return ra;
	}
	
	public void setRa(String novoRa){
		ra = novoRa;
	}

	public String getNome(){
		return nome;
	}
	
	public void setNome(String novoNome){
		nome = novoNome;
	}

	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String novoTipo){
		tipo = novoTipo;
	}

}


public class Disciplina{
	
	private String matéria;
		
	public Matéria(String matéria) {
		this.matéria = matéria;
	}

	public String getMatéria(){
		return matéria;
	}
	
	public void setMatéria(String novaMatéria){
		matéria = novaMatéria;
	}
~~~


