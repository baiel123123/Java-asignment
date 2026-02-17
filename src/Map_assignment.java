import java.util.*;

public class Map_assignment {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);
        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.get("Aida"));
        if (map.containsKey("Mira")) {
            System.out.println("Found: " + map.get("Mira"));
        } else {
            System.out.println("Not found");
        }

        Integer oldDana = map.put("Dana", 80);
        System.out.println(oldDana);
        System.out.println(map);

        map.remove("Azat");
        boolean removed = map.remove("NonExisting") != null;
        System.out.println(removed);

        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());

        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);

        int miraVal = map.getOrDefault("Mira", -1);
        if (miraVal == -1) {
            System.out.println("Not found");
        }
        System.out.println(map.getOrDefault("Aida", -1));

        map.putIfAbsent("Aida", 90);
        map.putIfAbsent("Mira", 88);

        map.replace("Aida", 85, 86);
        map.replace("Aida", 91);
        map.replace("Missing", 100);

        for (String k : map.keySet()) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (Integer v : map.values()) {
            System.out.print(v + " ");
        }
        System.out.println();

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + "=" + e.getValue() + " ");
        }
        System.out.println();

        int count = 0;
        for (int v : map.values()) {
            if (v >= 80) count++;
        }
        System.out.println(count);

        int maxVal = -1;
        String maxName = "";
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > maxVal) {
                maxVal = e.getValue();
                maxName = e.getKey();
            }
        }
        System.out.println(maxName + " " + maxVal);

        String text = "Java is fun and Java is powerful and fun";
        Map<String, Integer> wordCount = new HashMap<>();
        for (String w : text.toLowerCase().split(" ")) {
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
        }
        System.out.println(wordCount);

        String str = "Mississippi";
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        char mostFreqChar = ' ';
        int maxFreq = 0;
        for (Map.Entry<Character, Integer> e : charCount.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                mostFreqChar = e.getKey();
            }
        }
        System.out.println(charCount);
        System.out.println(mostFreqChar);

        String[] words = {"hi", "book", "java", "sun", "loop", "map"};
        Map<Integer, List<String>> grouped = new HashMap<>();
        for (String w : words) {
            grouped.putIfAbsent(w.length(), new ArrayList<>());
            grouped.get(w.length()).add(w);
        }
        System.out.println(grouped);

        String swiss = "swiss";
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : swiss.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        char firstNonRep = ' ';
        for (char c : swiss.toCharArray()) {
            if (freq.get(c) == 1) {
                firstNonRep = c;
                break;
            }
        }
        System.out.println(firstNonRep == ' ' ? "None" : firstNonRep);

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (numMap.containsKey(comp)) {
                System.out.println(numMap.get(comp) + " " + i);
                break;
            }
            numMap.put(nums[i], i);
        }

        String[] fruits = {"apple", "banana", "apple", "orange", "banana", "kiwi"};
        Map<String, Integer> fruitCount = new HashMap<>();
        for (String f : fruits) {
            fruitCount.put(f, fruitCount.getOrDefault(f, 0) + 1);
        }
        for (Map.Entry<String, Integer> e : fruitCount.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println(e.getKey());
            } else {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }

        Map<String, Integer> m1 = new HashMap<>();
        m1.put("A", 1);
        m1.put("B", 2);
        Map<String, Integer> m2 = new HashMap<>();
        m2.put("B", 2);
        m2.put("A", 1);
        System.out.println(m1.equals(m2));
        System.out.println(m1.hashCode() + " " + m2.hashCode());

        map.put("LowScore", 50);
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() < 60) {
                it.remove();
            }
        }

        Map<String, Integer> scores1 = new HashMap<>();
        scores1.put("Aida", 40);
        scores1.put("Azat", 35);
        scores1.put("Dana", 50);

        Map<String, Integer> scores2 = new HashMap<>();
        scores2.put("Azat", 10);
        scores2.put("Dana", 5);
        scores2.put("Mira", 45);

        for (Map.Entry<String, Integer> e : scores2.entrySet()) {
            scores1.merge(e.getKey(), e.getValue(), Integer::sum);
        }
        System.out.println(scores1);

        Map<Integer, List<String>> inverted = new HashMap<>();
        for (Map.Entry<String, Integer> e : scores1.entrySet()) {
            inverted.putIfAbsent(e.getValue(), new ArrayList<>());
            inverted.get(e.getValue()).add(e.getKey());
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        for (int i = 0; i < Math.min(2, sortedWords.size()); i++) {
            System.out.println(sortedWords.get(i).getKey());
        }
    }
}