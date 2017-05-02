import java.io.Console;

public class PingPong {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Let's play Ping Pong Pandemonium");
    System.out.println("Pick a number!");
    String strNum = console.readLine();
    Integer userNum = Integer.parseInt(strNum);

    for (Integer i = 1; i <= userNum; i++) {
      if (i % 15 == 0) {
        System.out.println("PANDEMONIUM");
      } else if (i % 5 == 0){
        System.out.println("Pong");
      } else if (i % 3 == 0) {
        System.out.println("Ping");
      } else {
      System.out.println(i);
      }
    }
  }
}
