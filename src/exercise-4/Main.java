public class Main {
  public static void main(String[] args) {
    int[] messedArr = { 20, 42, 17, 49, 29, 49, 19, 49 };
    int[] tidyArr = bubbleSort(messedArr);

    int highestOdd = tidyArr[0];
    int lowestPair = tidyArr[tidyArr.length - 1];

    for (int i = 0; i < tidyArr.length; i++) {
      if (tidyArr[i] % 2 != 0 && tidyArr[i] > highestOdd) {
        highestOdd = tidyArr[i];
      }

      if (tidyArr[i] % 2 == 0 && tidyArr[i] < lowestPair) {
        lowestPair = tidyArr[i];
      }
    }

    System.out.println("Highest odd: " + highestOdd);
    System.out.println("Lowest pair: " + lowestPair);
  }

  public static int[] bubbleSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    return arr;
  }
}
