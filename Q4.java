import java.util.Scanner;

public class Q4 {

  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int num1, num2;
    System.out.println("Enter a number");
    num1 = in.nextInt();
    System.out.println("Enter another number");
    num2 = in.nextInt();
    square_add(num1, num2);
  }

  public static void square_add(int num1, int num2) {
    int square_add;
    square_add=num1*num1+num2*num2;
    System.out.println(square_add);

  }
}
