import java.util.Scanner;

//Пользователь вводит целое трехзначное число. Вывести сумму его нечетных цифр.
//
//Если число не является трехзначным, вывести "ERROR".
//
//Если нечетных цифр нет, то вывести "NO".
//
//Тестовые данные
//Номер теста	Входные данные	Выходные данные
//1	367	10
//2	-351	9
//3	268	NO
//4	116	2
//5	-246	NO
//6	4786	ERROR
//7	-362	3

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