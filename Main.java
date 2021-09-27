public class Main {

  public static void main(String[] args) {
    int n=100;
    int targetIndex =25;
    boolean[] emulation= emulateCodeSubmissions(n,targetIndex);
    System.out.println("Expected linear steps: 26");
    System.out.println("Actual linear steps: " +BugFinder.findViaLinearSearch(0,emulateCodeSubmissions(n,targetIndex)));
    System.out.println("Expected binary steps: 2");
    // HINT: your midpoints should be 49, then 24. index 24 is true, and it looks forward to index 25, which is our first false.
    System.out.println("Actual binary steps: " +BugFinder.findViaBinarySearch(0,n-1,emulateCodeSubmissions(n,targetIndex)));
    System.out.println("Expected isBinaryBetter: true");
    System.out.println("Actual isBinaryBetter : " +BugFinder.isBinarySearchBetter(emulateCodeSubmissions(n,targetIndex)));
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

}
