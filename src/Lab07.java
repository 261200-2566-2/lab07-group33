import java.util.Arrays;



class Main {
    public static void main(String[] args) {

        Set<String> colors = new Set<>();


        System.out.println("Is set empty: " + colors.isEmpty());

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Set size after adding elements: " + colors.size());

        System.out.println("Set contains 'Red': " + colors.contains("Red"));

        colors.remove("Blue");

        System.out.println("Set size after removing element: " + colors.size());

        System.out.println("Colors set contains all selected colors: " + colors.containsAll(Arrays.asList("Red", "Green")));

        colors.removeAll(Arrays.asList("Red", "Green"));

        System.out.println("Colors set after removing elements: " + colors.size());

        colors.addAll(Arrays.asList("Yellow", "Purple", "Orange"));

        System.out.println("Colors set after adding several elements at once: " + colors.size());

        colors.retainAll(Arrays.asList("Yellow","Purple"));

        System.out.println("Set size after retaining: " + colors.size());


        colors.clear();

        System.out.println("Set empty after clearing: " + colors.isEmpty());
    }
}




