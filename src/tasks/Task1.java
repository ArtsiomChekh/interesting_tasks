package tasks;

 /*
Пользователь вводит целое трехзначное число. Вывести сумму его нечетных цифр.
Если число не является трехзначным, вывести "ERROR".
Если нечетных цифр нет, то вывести "NO".
 */

import java.util.Scanner;

class Task1 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    String stringOfNumb = Integer.toString(number);

    if (!stringOfNumb.matches("^-?[0-9]{3}$")) {
      System.out.println("ERROR");
    } else {
      number = Math.abs(number);
      int sum = 0;

      while (number > 0) {
        int digit = number % 10;
        if (digit % 2 != 0) {
          sum += digit;
        }
        number /= 10;
      }

      if (sum == 0) {
        System.out.println("NO");
      } else {
        System.out.println(sum);
      }
    }
  }
}