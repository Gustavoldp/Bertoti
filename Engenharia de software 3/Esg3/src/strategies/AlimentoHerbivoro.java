package strategies;

public class AlimentoHerbivoro implements AlimentoStrategy{

	@Override
	public String comer() {
		return "come grama";
	}

}
