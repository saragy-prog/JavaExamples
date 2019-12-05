import java.util.Scanner;
import java.util.Date;
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int myNumber = sc.nextInt();
//			int startNumber = sc.nextInt();
//			int endNumber = sc.nextInt();
//			
//			System.out.println(sum(startNumber, endNumber));
//			System.out.println(simpleTask2(myNumber));
		Human human = new Human(null);
		Human humanWithoutLiver = new Human("Thomas Anderson");
		Human jack  = new Human(
				"Jack",
				new Date(13, 2, 1989),
				"325-656-34",
				"Vitebsk",
				"Belarus",
				"Vitebsk");
		System.out.println(jack.toString());
		//System.out.println(jack.birthday);
		System.out.println(human);
		System.out.println(humanWithoutLiver);
		
		
	}

	public static int sum(int start, int end) {
		int result = 0;
		for (int i = start; i < end; i++) {
			result += i;
		}
		return result;
	}
	
		// Ќапишите метод, который провер€ет €вл€етс€ ли число
//			простым. „исло передаЄтс€ в качестве параметра. ≈сли
//			число простое нужно вернуть из метода true, иначе false.
	public static boolean simpleTask2(int num) {
		for (int i = 2; i < num - 1; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

		//Ќапишите метод, переворачивающий содержимое
	//массива.

//public static int array[6] reverseArray(int array[6]){
//	
//}

	
	
	
}
