package strategies;

public class Main {
	public static void main(String[] args) {
		Animais vaca = new Animais();
		vaca.setNome("Mimosa");
		vaca.setAlimento(new AlimentoHerbivoro());
		vaca.setHabitat(new HabitatTerrestre());
		vaca.display();
	}
	
}
