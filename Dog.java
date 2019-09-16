package comp;

public class Dog extends Animal{
	public String toString(){
		return name + " " + numLegs;
	}
	Dog(String name,int numLegs){
		this.name =name;
		this.numLegs = numLegs;
	}
}