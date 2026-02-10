import java.util.*;

public class Set_stack_queue {
    static ArrayDeque<String> tasks = new ArrayDeque<>();

    public static void main(String[] args) {


        System.out.println("Task 1");
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        HashSet<Integer> unique = new HashSet<>();
        unique.addAll(nums);
        System.out.println(unique);


        System.out.println("\nTask 2");
        HashSet<String> users = new HashSet<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");

        System.out.println(checkUser(users, "Alice"));
        System.out.println(checkUser(users, "Eve"));


        System.out.println("\nTask 3");
        HashSet<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        System.out.println(s.size());
        s.clear();
        System.out.println(s.isEmpty());


        System.out.println("\nTask 4");
        HashSet<String> names = new HashSet<>(Arrays.asList(
                "John", "Jane", "Doe", "Smith", "Alex"
        ));
        names.remove("Doe");
        System.out.println(names);


        System.out.println("\nTask 5");
        HashSet<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> b = new HashSet<>(Arrays.asList(3, 4, 5));
        a.addAll(b);
        System.out.println(a);


        System.out.println("\nTask 6");
        HashSet<Integer> c = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> d = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        c.removeAll(d);
        System.out.println(c);


        System.out.println("\nTask 7");
        HashSet<Integer> x = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> y = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        x.retainAll(y);
        System.out.println(x);


        System.out.println("\nTask 8");
        if (a.containsAll(Arrays.asList(3, 4))) {
            System.out.println("Contains");
        }


        System.out.println("\nTask 9");
        String text = "java is fun and java is powerful";
        String[] arr = text.split(" ");
        HashSet<String> words = new HashSet<>();
        for (String w : arr) {
            words.add(w);
        }
        System.out.println(words);


        System.out.println("\nTask 10");
        String[] fruits = {"Apple", "apple", "APPLE", "Banana"};
        HashSet<String> f = new HashSet<>();
        for (int i = 0; i < fruits.length; i++) {
            f.add(fruits[i].toLowerCase());
        }
        System.out.println(f);

        System.out.println("\nTask 11");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.peek());
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


        System.out.println("\nTask 12");
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }


        System.out.println("\nTask 13");
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);
        System.out.println(dq);


        System.out.println("\nTask 14");
        dq.offerFirst(1);
        dq.offerLast(100);
        System.out.println(dq);


        System.out.println("\nTask 15");
        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());


        System.out.println("\nTask 16");
        while (!dq.isEmpty()) {
            System.out.print(dq.pollFirst() + " ");
        }
        System.out.println();


        System.out.println("\nTask 17");
        ArrayDeque<String> dd = new ArrayDeque<>(
                Arrays.asList("a", "b", "c", "b", "a")
        );
        dd.removeFirstOccurrence("b");
        dd.removeLastOccurrence("a");
        System.out.println(dd);


        System.out.println("\nTask 18");
        System.out.println(dd.size());
        System.out.println(dd.isEmpty());


        System.out.println("\nTask 19");
        dd.clear();
        System.out.println(dd.isEmpty());


        System.out.println("\nTask 20");
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("hello"));


        System.out.println("\nTask 21");
        addTask("Low priority", false);
        addTask("Urgent fix", true);
        addTask("Mail", false);
        processTask();
        processTask();
    }


    static boolean checkUser(HashSet<String> set, String name) {
        return set.contains(name);
    }

    static boolean isPalindrome(String word) {
        ArrayDeque<Character> d = new ArrayDeque<>();
        for (char c : word.toCharArray()) {
            d.addLast(c);
        }
        while (d.size() > 1) {
            if (d.removeFirst() != d.removeLast()) {
                return false;
            }
        }
        return true;
    }

    static void addTask(String t, boolean high) {
        if (high) {
            tasks.addFirst(t);
        } else {
            tasks.addLast(t);
        }
        System.out.println("Added " + t);
    }

    static void processTask() {
        if (!tasks.isEmpty()) {
            System.out.println("Processing " + tasks.pollFirst());
        }
    }
}
