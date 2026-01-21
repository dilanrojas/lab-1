public class Main {
  public static void main(String[] args) {
    int[] arrOdd = { 1, 2, 3, 4, 5, 6, 7 };

    int sum = 0;
    int mult = 1;
    int mid = arrOdd.length / 2;

    for (int i = mid; i >= 0; i--) {
      sum += arrOdd[i];
    }

    for (int i = mid; i < arrOdd.length; i++) {
      mult *= arrOdd[i];
    }

    System.out.println("Sum of all\nelements from middle to left: " + sum);
    System.out.println("\nMultiplication of all\nelements from middle to right: " + mult);
  }
}
