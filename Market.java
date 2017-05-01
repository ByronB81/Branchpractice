public class Market {
  public static void main(String[] args){
    String[] list = {"Sriracha","trash bags", "soup"};
    Integer[] prices = {3,6,2};

    for (String item : list){
      System.out.println("Don't forget to grab " + item + "!");
    }

    Integer total = 0;
    for (Integer price : prices) {
      total += price;
    }
    System.out.println("Should cost " + total + " dollars.");
  }
}
