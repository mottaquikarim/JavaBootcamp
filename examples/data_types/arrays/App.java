import java.util.ArrayList;

public class App {
  public static void main(String args[]) {
    // basic array
    int[] numbers;
    numbers = new int[10];
    numbers[0] = 10;
    numbers[1] = 20;
    
    // more dynamic ArrayList
    ArrayList<String> names = new ArrayList<String>();

    names.add("Dan");
    names.add("Ella");
    names.add("Ava");
    names.add("Owen");

    // print all names
    System.out.println(names);

    // print one by one
    int i = 0;
    System.out.println(names.get(i));
    i++;
    System.out.println(names.get(i));
    i++;
    System.out.println(names.get(i));
    i++;
    System.out.println(names.get(i));

    // remove one by one
    names.remove(names.size() - 1);
    System.out.println(names);
    names.remove(names.size() - 1);
    System.out.println(names);
    names.remove(names.size() - 1);
    System.out.println(names);
    names.remove(names.size() - 1);
    System.out.println(names);

  }
}