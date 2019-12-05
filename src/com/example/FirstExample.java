package com.example;

import java.util.Scanner;

public class FirstExample {
	int myNumber;

	public static void main(String[] args) {

	
	// тип и название переменной без поднятия переменных.
//		int myNumber = 56;
//		float myFloatNumber = 2.88f;
//		double myDouble = 3.77;
//		boolean myBoolean = true;
//		char myChar = 'c';
//		double res = ((double) myNumber)/3;
//		int resTwo = ++myNumber;
//		System.out.println(resTwo);
//		System.out.println(++resTwo);
//		System.out.println(res);
//		System.out.println(myNumber);
//		System.out.println(myDouble);
//		System.out.println(myBoolean);
//		System.out.println(myChar);
//		System.out.print(myNumber);
//		System.out.print("_ " + myChar);

//		Scanner sc = new Scanner(System.in);
//		
//		String consoleString = sc.nextLine();
//		
//		System.out.println("input: " + consoleString);
//		
//		int intNumber = sc.nextInt();
//		System.out.println("input: " + intNumber);

//		System.out.println("fall seven times");
//		System.out.println("and");
//		System.out.println("stand up eight");
//		System.out.println("");
//		System.out.print("\"Your time is limited,\r\n"
//				+ "so don't waste it,\r\n"
//				+ "living someone else’s life\"");
//						System.out.println("Steve Jobs");
//						
//						
//						int a = 50;
//						int b = 25;
//						int sum = a+b;
//						int dif = a-b;
//						int mul = a*b;
//						int div = a/b;
//						System.out.println("sum equals " + sum);
//						System.out.println("difference equals " + dif);
//						System.out.println("multiple equals " + mul);
//						System.out.println("division equqals " + div);

//						Scanner sc = new Scanner(System.in);
//		    			int uderNumber = sc.nextInt(); 			
//						int percent =  sc.nextInt();
//						int  np = userNumber*percent/100;
//						  System.out.println("percent equals " + np);

//							Scanner sc = new Scanner(System.in);
//							int side =  sc.nextInt();
//							int  area = side*side;
//							System.out.println("area equals " + area);
//		
//						2 Пользователь вводит с клавиатуры число, состоящее
//							из четырех цифр. Требуется найти произведение цифр.
//							Например, если с клавиатуры введено 1324, тогда резуль-
//							тат произведения 1*3*2*4 = 24.
//		
//						Scanner sc = new Scanner(System.in);
//						int inputNumber = sc.nextInt();
//						int first = inputNumber/1000;
//						inputNumber = inputNumber - first*1000;
//						int second =  (inputNumber)/100;
//						inputNumber = inputNumber - second*100;
//						int third  = (inputNumber)/10;
//						inputNumber = inputNumber - third*10;
//						int fourth = inputNumber; 
//		
//						System.out.println("numbers " + first+ "," + second+ "," + third+ "," + fourth);
//						System.out.println("multiple numbers equals" + first*second*third*fourth);

//					
	/*
	 * Пользователь вводит с клавиатуры количество метров. Требуется вывести
	 * результат перевода метров в сантиметры, дециметры, миллиметры, мили.
	 */
//						Scanner sc = new Scanner(System.in);
//						float meters = sc.nextInt();
//						float centimeters = meters*100;
//						float decimeters = meters*10;
//						float millimeters = meters*1000;
//						float miles = meters/1700;
//						System.out.println("centimeters equals " + centimeters);
//						System.out.println("decimeters equals " + decimeters);
//						System.out.println("millimeters equals " + millimeters);
//						System.out.println("miles equals " + miles);

	/*
	 * 4 Напишите программу, вычисляющую площадь треугольника. Пользователь с
	 * клавиатуры вводит размер основания треугольника и размер высоты.
	 */

//						Scanner sc = new Scanner(System.in);
//						float height = sc.nextInt();
//						float base = sc.nextInt();
//						float triangleArea = height*base/2;
//						System.out.println("area equals " + triangleArea);

	/*
	 * 5 Пользователь с клавиатуры вводит четырёхзначное число. Необходимо
	 * перевернуть число и отобразить результат. Например, если введено 4512,
	 * результат 2154.
	 */

//		Scanner sc = new Scanner(System.in);
//		int inputNum = sc.nextInt();
//		int first = inputNum/1000;
//		inputNum = inputNum - first*1000;
//		int second =  (inputNum)/100;
//		inputNum = inputNum - second*100;
//		int third  = (inputNum)/10;
//		inputNum = inputNum - third*10;
//		int fourth = inputNum; 
//
//		System.out.println("reversed number for " + first+ second + third + fourth + " is " +fourth + third+ second+ first);

//		Scanner sc = new Scanner(System.in);
//		int inputNUM = sc.nextInt();
//		String salary  = (inputNUM>2000)? "OK":"low";	
//		System.out.println("Salary is " + salary);

	/*
	 * Пользователь вводит с клавиатуры число. Необходимо проверить его на четность
	 * и нечетность. Если число четное требуется вывести на экран число и надпись
	 * «Even number». Если число нечетное выведите на экран число и надпись «Odd
	 * number». *
	 */

//	Scanner sc = new Scanner(System.in);
//	int inputNUMb = sc.nextInt();
//	if(inputNUMb%2==0)
//	{
//		System.out.println("Even number");
//	}else
//	{
//		System.out.println("Odd number");
//	}
//	

		
		/*Пользователь вводит с клавиатуры три числа. В зависимости от выбора пользователя программа выводит на экран сумму трёх чисел или произведение трёх чисел. */
		
//		Scanner sc = new Scanner(System.in);
//		int inputNUMb1 = sc.nextInt();
//		int inputNUMb2 = sc.nextInt();
//		int inputNUMb3 = sc.nextInt();
//		System.out.println("Enter action");
//		String action = sc.next();
//		
//		if(action.equals("sum"))
//		{
//			double act = inputNUMb1 + inputNUMb2 + inputNUMb3;
//			System.out.println("sum equals " + act);
//		}else if (action.equals("mul"))
//		{
//			double act = inputNUMb1*inputNUMb2*inputNUMb3;
//			System.out.println("multiple equals " + act);
//		} else {
//			System.out.println("You're fool");
//		}
		
		
	
	
	
	
	
	
	
	
}
}