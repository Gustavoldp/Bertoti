package strategies;

public class Animais {
	String nome;
	HabitatStrategy habitat;
	AlimentoStrategy alimento;
	
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
}
