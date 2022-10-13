package study1;

public class catname {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.name = "a";
		cat1.age = 2;
		cat1.color = "white";
		cat2.name = "b";
		cat2.age = 21;
		cat2.color = "black";
		System.out.println("cat1 is " + cat1.name +" " +cat1.age+" " + cat1.color);
		System.out.println("cat2 is " + cat2.name +" "+ cat2.age+" "  + cat2.color);
	}

}
