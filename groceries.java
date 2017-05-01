public class Groceries {
  public static void main(String[] args) {
    String[] items = {"eggs", "milk", "bread", "bananas", "cereal","rice"};
    Integer[] prices = {4,3,5,4,6,3};
    Integer total = 0;

    for (Integer i = 0; i < items.length; i++){
      System.out.print(items[i]);
      System.out.println(": " + prices[i]);
      total += prices[i];
    }

    System.out.println();
    System.out.println("+++++++++++");
    System.out.println();
    System.out.println("You bought a total of " + items.length + " items for " + total + " dollars" );
  }
}
