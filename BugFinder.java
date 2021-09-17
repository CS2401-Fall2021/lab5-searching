public class BugFinder {

  public static void BugFinder() {
  }

  public static boolean[] emulateCodeSubmissions(int numberOfChanges, int indexOfFailure) {

    boolean[] result = new boolean[numberOfChanges];
    for (int i = 0; i < numberOfChanges; i++) {
      if (i < indexOfFailure) {
        result[i] = true;
      } else {
        result[i] = false;
      }
    }
    return result;
  }

  public static int findViaLinearSearch(int numberOfChanges, int indexOfFailure) {
    boolean[] changes = emulateCodeSubmissions(numberOfChanges, indexOfFailure);
    return 0;
  }

  public static int findViaBinarySearch(int numberOfChanges, int indexOfFailure) {
    boolean[] changes = emulateCodeSubmissions(numberOfChanges, indexOfFailure);
    return 0;
  }

  public static boolean isBinarySearchBetter(int numberOfChanges, int indexOfFailure) {
    return false;
  }
}
