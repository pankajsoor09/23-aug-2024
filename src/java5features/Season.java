package java5features;

public enum Season {
	// by default set of constant in enum are public static final
	SUMMER(10), WINTER(20), RAINY, SPRING;

	// by default constructor in enum are having private access
	int number;

	private Season() {
		System.out.println("Season Default constructor ");
	}

	Season(int number) {
		this.number = number;
		System.out.println("Season parameterized constructor ");
	}
	
	void show() {
		System.out.println("This is show() in Season enum ");
		System.out.println("Number : "+number);
	}

}
