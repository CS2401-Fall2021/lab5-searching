import java.util.Scanner;

// Used for running automatic tests. DO NOT EDIT
public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    String[] inputs=line.split(",");

    int n =Integer.parseInt(inputs[1]);
    int i =Integer.parseInt(inputs[2]);
    if(inputs[0].equals("l")){
      System.out.println("l:"+BugFinder.findViaLinearSearch(n,i));
    }
    if(inputs[0].equals("b")){
      System.out.println("b:"+BugFinder.findViaBinarySearch(n,i));
    }
    if(inputs[0].equals("c")){
      System.out.println("c:"+BugFinder.isBinarySearchBetter(n,i));
    }

  }

}
