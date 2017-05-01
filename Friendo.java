public class Friendo {
  public static void main(String[] args) {
    String[] friends = {"Sarah", "Susan", "Matthew"};

    System.out.println("These are some of my friends:");
    for (String friend : friends) {
      System.out.println(friend + " is a pretty kool kat!");
    }

    for (String friend : friends){
      if (friend.startsWith("S")){
        System.out.println( friend + " can bring an entree to the party");
      } else {
        System.out.println(friend + " maybe you can just bring some beer");
      }
    }

  }
}
