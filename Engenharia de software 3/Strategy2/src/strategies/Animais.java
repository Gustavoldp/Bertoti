package strategies;

public class Animais {
	String nome;
	HabitatStrategy habitat;
	AlimentoStrategy alimento;
	boolean comendo = false;
	
	void setNome(String nome) {
		this.nome = nome;
	}
	public void setHabitat(HabitatStrategy habitat){
		this.habitat = habitat;
	}
	void setAlimento(AlimentoStrategy alimento) {
		this.alimento = alimento;
	}
	void display() {
		System.out.println(this.nome +", "+ this.alimento.comer() +" e "+ this.habitat.viver());
	}
	
	public void setComendo(boolean value) {
		this.comendo = value;
	}
	
	public void estaComendo() {
		if(comendo == false) {
			System.out.println(this.nome + " Não está comendo");
		}
		else {
			System.out.println(this.nome + " Está comendo");
		}
	}
}
