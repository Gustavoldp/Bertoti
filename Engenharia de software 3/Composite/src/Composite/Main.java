package Composite;

public class Main {

	public static void main(String[] args) {
		
		Animal vaca = new Animal();
		vaca.setName("Mimosa");
		
		Animal galinha = new Animal();
		galinha.setName("augusto");
		
		Composite composite = new Composite();
		
		composite.addChild(vaca);
		
		composite.Execute();
		
		composite.addChild(galinha);
		
		composite.Execute();
		
		composite.getChild();
		
		composite.removeChild(vaca);
		
		composite.Execute();
	}
	
}
