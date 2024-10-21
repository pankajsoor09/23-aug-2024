package assignment2;

public class AnimalTest {

	public static void main(String[] args) {
		  Animal dog = new Dog();
	        Animal cat = new Cat();
	        Animal cow = new Cow();
	        
	        Animal[] animals = new Animal[3];
	        animals[0] = dog;
	        animals[1] = cat;
	        animals[2] = cow;
	        
	        for (int i = 0; i < animals.length; i++) {
	            animals[i].makeSound();
	        }
	    }
	}


