package tasks.day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map3D {

    public static void main(String[] args) {
        String[] array = "мама мыла раму мыла".split(" ");

        Map<Integer, Map<String, List<String>>> club = new HashMap<>();

        List<String> group1 = new ArrayList<>();
        group1.add("Vasia");
        group1.add("Kola");

        List<String> group2 = new ArrayList<>();
        group2.add("Sveta");
        group2.add("Masha");

        List<String> group3 = new ArrayList<>();
        group3.add("Petya");
        group3.add("Dasha");

        Map<String, List<String>> mapeGroup1 = new HashMap<>();
        mapeGroup1.put("alpha", group1);
        Map<String, List<String>> mapeGroup2 = new HashMap<>();
        mapeGroup2.put("beta", group2);
        Map<String, List<String>> mapeGroup3 = new HashMap<>();
        mapeGroup3.put("gamma", group3);


        club.put(1, mapeGroup1);
        club.put(2, mapeGroup2);
        club.put(3, mapeGroup3);

        club.get(3).get("gamma").get(0);

        System.out.println(club);
    }
}
