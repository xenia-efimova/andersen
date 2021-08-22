package Homework_8.Planets.src.main.java;

import java.util.*;

public class ArrayWords {
    public static void planets() {
        String mercury = "Меркурий";
        String venus = "Венера";
        String earth = "Земля";
        String mars = "Марс";
        String jupiter = "Юпитер";
        String saturn = "Сатурн";
        String uranus = "Уран";
        String neptune = "Нептун";
        String pluto = "Плутон";

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList
                (mercury, venus, earth, mars, jupiter, saturn, uranus, neptune, pluto, mercury, mars, saturn));

        Set<String> solarSystemUnique = new HashSet<>(solarSystem);

        System.out.println();
        System.out.println("Массив планет Солнечной системы:");
        System.out.println(solarSystem.toString());
        System.out.println();
        System.out.println("Уникальные планеты:");
        System.out.println(solarSystemUnique.toString());
        System.out.println();
        System.out.println("Столько раз встречается каждая планета:");
        for (String key : solarSystemUnique) {
            System.out.println(key + ": " + Collections.frequency(solarSystem, key));
        }
    }
}