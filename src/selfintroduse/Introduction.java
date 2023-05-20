package selfintroduse;

public class Introduction {
	
	public static void yourName() {
		System.out.println("Tushar");
	}
    
	public static void yourAge() {
		System.out.println("22");
	}
	
	public static void yourCity() {
		System.out.println("Parner");
	}
	
	public static void yourCollege() {
		System.out.println("NACS");
	}
	
	public static void yourBranch() {
		System.out.println("BCA");
	}
	
public static void yourName3(String name,String surname) {
		
		System.out.println(name+""+surname);
	}

public static void yourName3(String name,int Age) {
	
	System.out.println(name+""+Age);
}

public static void yourName3(int age, String name) {
	
	System.out.println(age+""+name);
}

public static void City(String name ,String  tal) {
	
	System.out.println(name+""+tal);
}

public static void yourClg(String name, String university) {
	
	System.out.println(name+""+university);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		yourName();
		yourAge();
		yourCity();
		yourCollege();
		yourBranch();
       yourName3("Tushar","Pawar");
       yourName3("Akash","22");
       yourName3("22","Akash");
       City("kinhi","Parner");
       yourClg("NACS","Pune");
	}
	

	public static double HalfTheNumber(int number) {
	
		int halfnum;
		halfnum = 2 / number;
		return halfnum;
		

	}
}

