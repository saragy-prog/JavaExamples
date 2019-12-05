import java.util.Scanner;

public class Fraction {
		private int numerator;
		private int denominator;
				
		
//		Fraction res2 = fr.add(fr1, fr2);
		
		
//		System.out.print(res.get.numerator);
//		System.out.print(res.get.denominator);
		
		
		
		
		public Fraction(int numerator, int denominator) {
			super();
			this.numerator = numerator;
			this.denominator = denominator;
		}
		
//		private Fraction(int numerator, int denominator) {
//			this.numerator = numerator;
//			this.denominator = denominator;
//		}
		
		public static Fraction createFraction(){
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int den1 = sc.nextInt();
			return new Fraction(num1, den1);
		}
		
		public Fraction add(Fraction fr) {
			int newNumerator = numerator*fr.denominator + fr.numerator*denominator;
			int newDenominator = denominator*fr.denominator;
			return new Fraction(newNumerator, newDenominator);
		}
		
		public Fraction substraction(Fraction fr) {
			int newNumerator = numerator*fr.denominator - fr.numerator*denominator;
			int newDenominator = denominator*fr.denominator;
			return new Fraction(newNumerator, newDenominator);
		}
		
		public Fraction multiplection(Fraction fr) {
			int newNumerator = numerator*fr.numerator;
			int newDenominator = denominator*fr.denominator;
			return new Fraction(newNumerator, newDenominator);
		}
		public Fraction division(Fraction fr) {
			int newNumerator = numerator*fr.denominator;
			int newDenominator = denominator*fr.numerator;
			return new Fraction(newNumerator, newDenominator);
		}
		
		public static Fraction add(Fraction fr1, Fraction fr2) {
			int newNumerator = fr1.numerator*fr2.denominator + fr2.numerator*fr1.denominator;
			int newDenominator = fr2.denominator*fr1.denominator;
			return new Fraction(newNumerator, newDenominator);
		}
		
		@Override
		public String toString() {
			StringBuffer buf = new StringBuffer();
			buf.append("\n ").append(this.numerator).append("\n___").append("\n ").append(this.denominator);
			return buf.toString();
		}
}
