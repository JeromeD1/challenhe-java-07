package challengeJava07;

import java.util.ArrayList;
// import java.util.Arrays;

public class Hangar {
 public static void main(String[] args) {
    Car clio = new Car("Clio", 20000);
    Car megane = new Car("Megane", 38000);
    Boat titanic = new Boat("Titanic" , 85000);
    Boat vespucci = new Boat("Amerigo Vespucci", 985000);

    System.out.println(clio.doStuff());
    System.out.println(megane.doStuff());
    System.out.println(titanic.doStuff());
    System.out.println(vespucci.doStuff());

    ArrayList<Car> cars = new ArrayList<>();
    cars.add(clio);
    cars.add(megane);

    ArrayList<Boat> boats = new ArrayList<>();
    boats.add(titanic);
    boats.add(vespucci);

   // System.out.println(Arrays.toString(cars)); // fonctionne pour les tableaux mais pas pour les ArrayList

   System.out.println("Liste des voitures");

   for(Car voiture : cars) {
    System.out.println("- " + voiture.getBrand() + " --> (" + voiture.getKilometers() + " km)");
   }

   System.out.println("Liste des bateaux");

   for(Boat bato : boats) {
    System.out.println("- " + bato.getBrand()  + " --> (" + bato.getKilometers() + " km)");
   }
 }   
}
