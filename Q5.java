import java.util.Scanner;
public class Q5 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char letter;
    int num1, num2;
    System.out.print("Enter a letter: ");
    letter = in.next().charAt(0);
    System.out.print("Enter a number: ");
    num1 = in.nextInt();
    System.out.print("Enter another number: ");
    num2 = in.nextInt();
    print(num1, num2, letter);
  }
  public static void print(int On_a_line, int Number_of_lines, char Print_letter) {
    for (int a=1; a<=Number_of_lines; a++) {
      for (int b=1; b<= On_a_line; b++) {
        System.out.print(Print_letter + " ");

      }
      System.out.println();
    }
  }
}
