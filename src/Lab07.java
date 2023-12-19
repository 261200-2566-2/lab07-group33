import java.util.Iterator;

class Main{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(10);


        System.out.println("Size after creation: " + set.size());
        System.out.println("Is empty: " + set.isEmpty());


        set.add("apple");
        set.add("banana");
        set.add("cherry");
        System.out.println("Size after adding elements: " + set.size());
        System.out.println("Contains apple: " + set.contains("apple"));
        System.out.println("Contains grape: " + set.contains("grape"));


        set.remove("banana");
        System.out.println("Size after removing element: " + set.size());

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Next element: " + fruit);
        }


        HashSet<String> fruits = new HashSet<>(10);
        fruits.add("apple");
        fruits.add("cherry");
        System.out.println("Contains all fruits: " + set.containsAll(fruits));


        set.addAll(fruits);
        System.out.println("Size after adding fruits: " + set.size());


        fruits.add("orange");
        set.retainAll(fruits);
        System.out.println("Size after retaining fruits: " + set.size());


        fruits.remove("apple");
        set.removeAll(fruits);
        System.out.println("Size after removing fruits: " + set.size());


        set.clear();
        System.out.println("Size after clearing: " + set.size());

    }
}