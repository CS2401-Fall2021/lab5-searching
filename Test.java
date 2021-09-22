import java.util.Scanner;

// Used for running automatic tests. DO NOT EDIT
public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    String[] inputs=line.split(",");

    int n =Integer.parseInt(inputs[1]);
    int i =Integer.parseInt(inputs[2]);
    if(inputs[0].equals("ls")){
      System.out.println("l:"+BugFinder.findViaLinearSearch(0,emulateCodeSubmissions(n,i)));
    }
    if(inputs[0].equals("bs")){
      System.out.println("b:"+BugFinder.findViaBinarySearch(0,n-1,emulateCodeSubmissions(n,i)));
    }
    if(inputs[0].equals("c")){
      System.out.println("c:"+BugFinder.isBinarySearchBetter(emulateCodeSubmissions(n,i)));
    }

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
