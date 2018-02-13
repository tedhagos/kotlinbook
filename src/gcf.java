



public class gcf {

  public static void main(String args[]) {

    int a = 10;
    int b = 12;

    int rem = 1;

    while ((rem = a % b) != 0) {
      a = b;
      b = rem;
    }
    System.out.println(b);
  }
}
