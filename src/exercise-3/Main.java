public class Main {
  public static void main(String[] args) {
    int[] arr = { 20, 42, 17, 49, 29, 49, 19, 49 };

    int highest = arr[0];
    int highestCount = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > highest) {
        highest = arr[i];
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == highest) {
        highestCount++;
      }
    }

    System.out.println("Highest num: " + highest);
    System.out.println("Highest num counter: " + highestCount);
  }
}
