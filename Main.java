import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input

        try {
            System.out.println("*********************************************");

            Scanner input1 = new Scanner(System.in);
            System.out.println("1- Enter two numbers to do mathematics : ");
            System.out.print("Number 1 : ");
            int num1 = input1.nextInt();
            System.out.print("Number 2 : ");
            int num2 = input1.nextInt();
            System.out.println("addition : " + (num1 + num2) + "\n" +
                    "subtract : " + (num1 - num2) + "\n" +
                    "multiply : " + (num1 * num2) + "\n" +
                    "divide : " + (num1 / num2) + "\n" +
                    "remainder : " + (num1 % num2) + "\n");
        } catch (ArithmeticException e) {
            System.out.println("Invalid statement : ArithmeticException");
        } catch (InputMismatchException e) {
            System.out.println("Invalid statement : InputMismatchException (You should enter a number here)");
        } catch (Exception e) {
            System.out.println("Invalid statement , try another numbers");
        }

//    2. Write a Java program that takes a number as input and prints its multiplication table up to 10.


        try {

            System.out.println("*********************************************");
            System.out.print("2- Enter a number to print the multiplication table up to 10 : ");
            Scanner input2 = new Scanner(System.in);
            int num_multi10 = input2.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(num_multi10 + " * " + (i) + " = " + (num_multi10 * i));
            }
        } catch (ArithmeticException e) {
            System.out.println("Invalid statement : ArithmeticException");
        } catch (InputMismatchException e) {
            System.out.println("Invalid statement : InputMismatchException (You should enter a number here)");
        } catch (Exception e) {
            System.out.println("Invalid statement , try another numbers");
        }

//        3. Write a Java program to print the area and perimeter of a circle.
        try {
            System.out.println("*********************************************");
            System.out.print("3- Enter The radius to find the perimeter and the area : ");
            Scanner input3 = new Scanner(System.in);
            double radius = input3.nextDouble();
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.println("Perimeter is : " + perimeter);
            System.out.println("Area is : " + area);
        } catch (ArithmeticException e) {
            System.out.println("Invalid statement : ArithmeticException");
        } catch (InputMismatchException e) {
            System.out.println("Invalid statement : InputMismatchException (You should enter a number here)");
        } catch (Exception e) {
            System.out.println("Invalid statement , try another numbers");
        }

//        4. Java program to find out the average of a set of integers
        try {
            System.out.println("*********************************************");
            Scanner input4 = new Scanner(System.in);
            double sum = 0;
            System.out.print("4- Enter the count of numbers:  ");
            double user_number = input4.nextDouble();
            for (int i = 1; i <= user_number; i++) {
                System.out.print("Enter number " + i + ": ");
                double numbers = input4.nextDouble();
                sum = sum + numbers;
            }
            double average = sum / user_number;
            System.out.println("The average is : " + average);
        } catch (ArithmeticException e) {
            System.out.println("Invalid statement : ArithmeticException");
        } catch (InputMismatchException e) {
            System.out.println("Invalid statement : InputMismatchException (You should enter a number here)");
        } catch (Exception e) {
            System.out.println("Invalid statement , try another numbers");
        }


//    5. Write a Java program that accepts three integers as input, adds the first two integers
//    together, and then determines whether the sum is equal to the third integer.
        System.out.println("*********************************************");
        try {
            Scanner input5 = new Scanner(System.in);
            System.out.println("5- Enter two number to sum then enter the third number" + "\n" +
                    "and see if the third number is the result or not.");
            System.out.print("Input the first number : ");
            int first_num = input5.nextInt();
            System.out.print("Input the second number : ");
            int second_num = input5.nextInt();
            System.out.print("Input the third number : ");
            int third_num = input5.nextInt();

            checkSumThreeNumbers(first_num, second_num, third_num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid statement : InputMismatchException (You should enter a number here)");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        6. Write a Java program to reverse a word.
        try {


            System.out.println("*********************************************");
            Scanner input6 = new Scanner(System.in);
            System.out.print("6- Enter a word to reverse it : ");
            String string_reverse = input6.nextLine();
            reversed(string_reverse);

        } catch (Exception e) {
                System.out.println(e.getMessage());
            }

//        7 - Java program to check whether the given number is even or odd
//

        try {

            System.out.println("*********************************************");
            Scanner input7 = new Scanner(System.in);
            System.out.print("7- Enter a number to check if it odd or even : ");
            int odd_even = input7.nextInt();
            if (odd_even % 2 == 0) {
                System.out.println("The number is Even");
            } else {
                System.out.println("The number is Odd");
            }
        } catch (ArithmeticException e) {
            System.out.println("Invalid statement : ArithmeticException");
        } catch (InputMismatchException e) {
            System.out.println("Invalid statement : InputMismatchException (You should enter a number here)");
        } catch (Exception e) {
            System.out.println("Invalid statement , try another numbers");
        }

//
//        8 - Java program to convert the temperature in Centigrade to Fahrenheit
        System.out.println("*********************************************");

        Scanner input8 = new Scanner(System.in);
        try {

            System.out.print("8- Enter temperature in Centigrade: ");
            double centigrade = input8.nextDouble();
            double fahrenheit = (1.8 * centigrade) + 32;
            System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
        } catch (ArithmeticException e) {
            System.out.println("Invalid statement : ArithmeticException");
        } catch (InputMismatchException e) {
            System.out.println("Invalid statement : InputMismatchException (You should enter a number here)");
        } catch (Exception e) {
            System.out.println("Invalid statement , try another numbers");
        }
//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.

        System.out.println("*********************************************");
        try {
            System.out.print("Enter the string : ");
            Scanner input9 = new Scanner(System.in);
            String string = input9.nextLine();
            System.out.print("Enter the number of the char (start with 0) : ");
            int char_index = input9.nextInt();
            checkCharAt(char_index, string);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid statement : InputMismatchException (You should enter a number here)");
        } catch (Exception e) {
            System.out.println("Invalid statement , try another numbers");
        }


//    10. Write a Java program to print the area and perimeter of a rectangle.
        try {
            System.out.println("*********************************************");

            Scanner input10 = new Scanner(System.in);
            System.out.print("Enter the width : ");
            double width = input10.nextDouble();
            System.out.print("Enter the height : ");
            double height = input10.nextDouble();
            System.out.println("Area is " + width + " * " + height + " = " + String.format("%.2f", (height * width)));
            System.out.println("Perimeter is 2 * " + "(" + (width) + " + " + (height) + ")" + " = " + String.format("%.2f", (2 * (width + height))));

        } catch (ArithmeticException e) {
            System.out.println("Invalid statement : ArithmeticException");
        } catch (InputMismatchException e) {
            System.out.println("Invalid statement : InputMismatchException (You should enter a number here)");
        } catch (Exception e) {
            System.out.println("Invalid statement , try another numbers");
        }
    }






    public static void checkSumThreeNumbers(int first_num, int second_num, int third_num) throws Exception {
        if (first_num + second_num != third_num) {
            throw new Exception("The sum of the first two numbers does not equal the third number.");
        } else {
            System.out.println("The result is: true");
        }
    }

    public static void checkCharAt(int char_index, String string) throws StringIndexOutOfBoundsException {
        if (char_index >= string.length()) {
            throw new StringIndexOutOfBoundsException("number of char index you entered have exceed the number length ");
        } else {
            System.out.println("The character you want : " + string.charAt(char_index));
        }


    }


    public static void reversed(String string_reverse) throws Exception {
        if (string_reverse.isEmpty()) {
            throw new Exception("The string shouldent be empty");
        } else {
            String new_string = "";
            for (int i = string_reverse.length(); i != 0; i--) {
                new_string = new_string + string_reverse.charAt(i - 1);
            }

            System.out.println("Reverse word : " + new_string);

        }
    }
}