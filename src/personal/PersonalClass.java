package personal;

public class PersonalClass {
	
public static void yourName(String name,String collegename) {
		
		System.out.println(name+""+collegename);
	}
public static int ageCalculator(int currentyear, int birthyear) {
	
	  int age;
	  age = currentyear - birthyear;
	  
	  return age;
}

 public static int calculateMultiplication(int num1 , int num2) {
	 int mul;
	 mul = num1 *num2;
	 return mul;
	 

	 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int age;
    age = ageCalculator(2022,2000);
    System.out.println(age);
    
    int mul;
    mul = calculateMultiplication(22,33);
    System.out.println(mul);
    
		yourName("Tushar"," NACS ");
		
	}

 
	
}