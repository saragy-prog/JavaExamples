
public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction fr1 = Fraction.createFraction();
		Fraction fr2 = Fraction.createFraction();
		
		Fraction res = fr1.add(fr2);
		Fraction sub = fr1.substraction(fr2);
		Fraction mul = fr1.multiplection(fr2);
		Fraction div = fr1.division(fr2);
		System.out.println("Sum equals " + res);
		System.out.println("Difference equals " + sub);
		System.out.println("Multiple equals " + mul);
		System.out.println("division equals " + div);
		
		
		
	}

}
