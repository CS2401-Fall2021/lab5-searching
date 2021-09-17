public class Main {

  public static void main(String[] args) {
    int n=100;
    int targetIndex =25;

    System.out.println("Expected linear steps: 25");
    System.out.println("Actual linear steps: " +BugFinder.findViaLinearSearch(n,targetIndex));
    System.out.println("Expected binary steps: 6");
    System.out.println("Actual binary steps: " +BugFinder.findViaBinarySearch(n,targetIndex));
    System.out.println("Expected isBinaryBetter: true");
    System.out.println("Actual isBinaryBetter : " +BugFinder.isBinarySearchBetter(n,targetIndex));
  }
}
