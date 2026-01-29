package pkg;
import java.util.Scanner;
import java.util.Random;

public class Dog {
	public String name;
	public int age;
	public String breed;
	//constructors
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "Big red dog";
	}

	public Dog(String name) {
		this.name = name;
		this.age = 1;
		this.breed = "dog dog";
	}

	public Dog(String name, String breed) {
		this.name = name;
		this.age = 1;
		this.breed = breed;
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.breed = "dog dog";
	}
	//Mutator
	public void setName(String name){
		return;
	}
	public void setAge(int age){
		return;
	}
	public void setBreed(String breed){
		return;
	}
	public String getName() {
    return name;
   }

    public int getAge() {
    return age;
   }

    public String getBreed() {
    return breed;
   }
   
   public boolean isSleeping(){
   	return Math.random() < 0.5;
   }
   public void bark() {
    System.out.println(name + " barks!");
}


}
