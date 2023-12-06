public class Lab07{

    public static void main(String[] args){
        Set<String> set = new Set<>();

        set.add("a");
        set.add("b");
        set.add("c");

        System.out.println("Set Size: " + set.size());
        System.out.println("Contain a?: " + set.contains("a"));
        System.out.println("Contain b?: " + set.contains("b"));
        System.out.println("Contain c?: " + set.contains("c"));
        System.out.println("Contain hello?: " + set.contains("hello"));

        set.remove("a");

        System.out.println("Contain \"a\" after removal?: " + set.contains("a"));

        set.clear();

        System.out.println("Set size after cleared: " + set.size());
        System.out.println("is Set empty?: " + set.isEmpty());
    }

}