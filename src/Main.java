import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1
        ArrayList<String> b1 = new ArrayList<>();
        b1.add("Book A");
        b1.add("Book B");

        ArrayList<String> b2 = new ArrayList<>();
        b2.add("Book B");
        b2.add("Book C");

        ArrayList<String> merged = new ArrayList<>();
        for (String s : b1) {
            if (!merged.contains(s)) merged.add(s);
        }
        for (String s : b2) {
            if (!merged.contains(s)) merged.add(s);
        }
        System.out.println("1: " + merged);

        // 2
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("The Lord of the Rings");
        movies.add("Up");

        String longest = movies.get(0);
        for (String m : movies) {
            if (m.length() > longest.length()) longest = m;
        }
        System.out.println("2: " + longest);

        // 3
        ArrayList<String> food = new ArrayList<>();
        food.add("Pizza");
        food.add("Burger");
        food.add("Pizza");

        int pCount = 0;
        for (String f : food) {
            if (f.equals("Pizza")) pCount++;
        }
        System.out.println("3: " + pCount);

        // 4
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Banana");

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals("Banana")) {
                fruits.remove(i);
                i--;
            }
        }
        System.out.println("4: " + fruits);

        // 5
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, "Black");
        }
        System.out.println("5: " + colors);

        // 6
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Basketball");

        ArrayList<String> sub = new ArrayList<>();
        sub.add("Football");
        sub.add("Tennis");
        System.out.println("6: " + sports.containsAll(sub));

        // 7
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Tulip");
        flowers.add("Rose");
        System.out.println("7: " + flowers.indexOf("Rose") + ", " + flowers.lastIndexOf("Rose"));

        // 8
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cat");

        ArrayList<String> unique = new ArrayList<>();
        for (String a : animals) {
            if (!unique.contains(a)) unique.add(a);
        }
        animals = unique;
        System.out.println("8: " + animals);

        // 9
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("Rome");
        String[] cityArr = new String[cities.size()];
        for (int i = 0; i < cities.size(); i++) {
            cityArr[i] = cities.get(i);
        }
        System.out.println("9: " + cityArr[0]);

        // 10
        int[] digits = {1, 2, 3};
        ArrayList<Integer> dList = new ArrayList<>();
        for (int d : digits) dList.add(d);
        System.out.println("10: " + dList);

        // 11
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("USA"); c1.add("Canada");
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Canada"); c2.add("France");
        ArrayList<String> common = new ArrayList<>();
        for (String s : c1) {
            if (c2.contains(s)) common.add(s);
        }
        System.out.println("11: " + common);

        // 12
        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Bob");
        names.add("Anna");
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() % 2 == 0) {
                names.remove(i);
                i--;
            }
        }
        System.out.println("12: " + names);

        // 13
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Hello");
        songs.add("Sky");
        songs.add("Yesterday");
        String shortS = songs.get(0);
        for (String s : songs) {
            if (s.length() < shortS.length()) shortS = s;
        }
        System.out.println("13: " + shortS);

        // 14
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Orange");
        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).replaceAll("[AEIOUaeiou]", "*"));
        }
        System.out.println("14: " + words);

        // 15
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(2); nums.add(3);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int n : nums) {
            if (n % 2 == 0) even.add(n);
            else odd.add(n);
        }
        System.out.println("15: " + even + " " + odd);

        // 16
        ArrayList<String> days = new ArrayList<>();
        days.add("Mon"); days.add("Tue"); days.add("Wed"); days.add("Thu");
        for (int i = 0; i < 2; i++) {
            String temp = days.remove(days.size() - 1);
            days.add(0, temp);
        }
        System.out.println("16: " + days);

        // 17
        ArrayList<String> studs = new ArrayList<>();
        studs.add("Tom"); studs.add(null); studs.add("Bob");
        for (int i = 0; i < studs.size(); i++) {
            if (studs.get(i) == null) {
                studs.remove(i);
                i--;
            }
        }
        System.out.println("17: " + studs);

        // 18
        String top1 = "", top2 = "";
        for (String m : movies) {
            if (m.length() > top1.length()) {
                top2 = top1;
                top1 = m;
            } else if (m.length() > top2.length() && !m.equals(top1)) {
                top2 = m;
            }
        }
        System.out.println("18: " + top2);

        // 19
        ArrayList<Integer> resLens = new ArrayList<>();
        for (String f : fruits) resLens.add(f.length());
        System.out.println("19: " + resLens);

        // 20
        ArrayList<ArrayList<String>> deps = new ArrayList<>();
        ArrayList<String> d1 = new ArrayList<>();
        d1.add("Alice"); d1.add("Bob");
        ArrayList<String> d2 = new ArrayList<>();
        d2.add("Tom");
        deps.add(d1);
        deps.add(d2);
        System.out.println("20: " + deps);
    }
}