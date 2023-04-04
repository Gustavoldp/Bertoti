package Composite;

public class Animal implements Component{

	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void Execute() {
		System.out.println(name);
		
	}

}
