package strategies;

public class Main {
	public static void main(String[] args) {
		Animais vaca = new Animais();
		vaca.setNome("Mimosa");
		vaca.setAlimento(new AlimentoCarnivoro());
		vaca.setHabitat(new HabitatTerrestre());
		vaca.display();
	}
	
}
