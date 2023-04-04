package Composite;

import java.util.LinkedList;

public class Composite implements Component{

	LinkedList<Component> children = new LinkedList<>();
	
	
	public void addChild(Component child) {
		children.add(child);
	}
	
	public void removeChild(Component child) {
		children.remove(child);
	}
	
	public void getChild() {
		System.out.println(children);
	}
	
	@Override
	public void Execute() {
		this.children.forEach(child-> child.Execute());
	}

}
