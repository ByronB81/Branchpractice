public class EatIt {
  public static void main(String[] args) {
    String[] foods = {"Spaghetti","Pizza","Pastrami","Olives","Onions","Carne Asada"};

    System.out.println();
    System.out.println("I'm hungry... Let's see what we have to eat!");
    System.out.println("Look at all this good stuff!");
    System.out.println("I have: ");

    for (Integer i = 0; i < 4; i++) {
      System.out.print(foods[i] + ", ");
    }

    System.out.println("and " + foods[5] + "!");
    System.out.println();

    for (Integer i = 0; i < 4; i++) {
      System.out.println("Let's eat some " + foods[i]);
      System.out.println("NomNomNom");
      System.out.println();
    }

    System.out.println("Thanks but I'm full now!");
    System.out.println();
    System.out.println("Zzzzzzzzz...");
  }
}
