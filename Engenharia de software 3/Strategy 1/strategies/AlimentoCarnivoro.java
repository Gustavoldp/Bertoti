package strategies;

public class AlimentoCarnivoro implements AlimentoStrategy{

	@Override
	public String comer() {
		return "come carne";
	}

}
