public class Main {

  public static void main(String[] args) {
    int n=100;
    int targetIndex =25;
    boolean[] emulation= emulateCodeSubmissions(n,targetIndex);
    System.out.println("Expected linear steps: 25");
    System.out.println("Actual linear steps: " +BugFinder.findViaLinearSearch(emulateCodeSubmissions(n,targetIndex)));
    System.out.println("Expected binary steps: 5");
    System.out.println("Actual binary steps: " +BugFinder.findViaBinarySearch(emulateCodeSubmissions(n,targetIndex)));
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
