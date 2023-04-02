package tasks;
/*
Грузовой самолет должен пролететь с грузом из пункта А в пункт С через пункт В. Емкость бака для топлива у самолета – 300 литров. Потребление топлива на 1 км в зависимости от веса груза у самолета следующее:

          - до 500 кг  (включительно) :    1 литров / км

          - до 1000 кг (включительно):   4 литров / км

          - до 1500 кг (включительно):   7 литров / км

          - до 2000 кг (включительно):   9 литров / км.

          - более 2000 кг – самолет не поднимает.

Пользователь вводит расстояние между пунктами А и В,  расстояние между пунктами В и С, а также вес груза.

Программа должна рассчитать какое минимальное количество топлива необходимо для дозаправки самолету в пункте В, чтобы долететь из пункта А в пункт С. В случае невозможности преодолеть любое из расстояний – программа должна вывести ERROR.

Числовой результат работы программы округляется до двух знаков после десятичной точки.
 */
import java.util.Scanner;

public class Task4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int distanceAB = scanner.nextInt();
    int distanceBC = scanner.nextInt();
    int weight = scanner.nextInt();
    scanner.close();

    int fuelAB, fuelBC;
    int airCapacity = 300;

    if (weight <= 500) {
      fuelAB = distanceAB;
      fuelBC = distanceBC;
    } else if (weight <= 1000) {
      fuelAB = distanceAB * 4;
      fuelBC = distanceBC * 4;
    } else if (weight <= 1500) {
      fuelAB = distanceAB * 7;
      fuelBC = distanceBC * 7;
    } else if (weight <= 2000) {
      fuelAB = distanceAB * 9;
      fuelBC = distanceBC * 9;
    } else {
      System.out.println("ERROR");
      return;
    }

    int totalFuel = fuelAB + fuelBC;
    int leftFuelAB = airCapacity - fuelAB;
    int leftFuelBC = leftFuelAB - fuelBC;

    int result = 0;
    if(leftFuelBC < 0) {
      result = Math.abs(leftFuelBC);
    }

    if (totalFuel > 600 || fuelAB > 300 || fuelBC > 300) {
      System.out.println("ERROR");
    } else if (totalFuel < 300) {
      System.out.printf("%.2f", (double)result);
    } else {
      System.out.printf("%.2f", (double)result);
    }

  }

}
