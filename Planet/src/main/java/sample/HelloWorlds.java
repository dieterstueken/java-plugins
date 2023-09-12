package sample;

import java.util.*;

public class HelloWorlds {

   public static void main(String ... args) {

      List<Planet> worlds = ServiceLoader.load(Planet.class).stream()
              .map(ServiceLoader.Provider::get).toList();

      if(worlds.isEmpty()) {
         System.err.println("no worlds discovered :-(");
      } else {
         worlds.stream()
                 .map(Planet::name)
                 .map(name -> "hello " + name)
                 .forEach(System.out::println);
      }
   }
}
