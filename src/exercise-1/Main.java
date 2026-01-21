public class Main {
  public static void main(String[] args) {
    int[] arrA = { 8, 5, 1, 2 };
    int[] arrB = { 11, 45, 22, 30 };

    int pairs = 0;

    for (int i = 0; i < arrA.length; i++) {
      if (arrA[i] % 2 == 0) {
        pairs++;
      }

      if (arrB[i] % 2 == 0) {
        pairs++;
      }
    }

    int[] arrPairs = new int[pairs];
    int size = 0;

    for (int i = 0; i < arrPairs.length; i++) {
      if (arrA[i] % 2 == 0) {
        arrPairs[size] = arrA[i];
        size++;
      }

      if (arrB[i] % 2 == 0) {
        arrPairs[size] = arrB[i];
        size++;
      }
    }

    System.out.println("Pairs in array: ");
    for (int n : arrPairs) {
      System.out.println(n);
    }
  }
}
