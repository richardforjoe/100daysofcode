package chapter12;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args){
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");


        System.out.println(fruit.size()); //4
        System.out.println(fruit); //[banana, orange, apple, lemon]
        // un-ordered, can hold any type of data, Methods: add,clear, contains, isEmpty,iterator,remove,size
    }

    public static void listDemo(){
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2)); //banana
        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]

        //Array list, linked list, stacked - these are ordered, index starts at zerop
        //can contain duplicates. ordered they are added
        //Methods: add(int index, Object obj), addAll, get, indexOf, lastindexOf,listitertor,remove,set

    }

    public static void queueDemo(){
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]

        fruit.remove();
        System.out.println(fruit);//[lemon, banana, orange, lemon]

        System.out.println(fruit.peek());//lemon
        //linkedlist, priority que. FIFO - remove first.firs = head, last = tail. .peek - retruns the head
        //Method: add, peek, element, remove, poll
    }

    public static void mapDemo(){
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size()); //4
        System.out.println(fruitCalories); //{banana=105, orange=45, apple=95, lemon=17}

        System.out.println(fruitCalories.get("lemon"));//17

        System.out.println(fruitCalories.entrySet());//[banana=105, orange=45, apple=95, lemon=17]

        fruitCalories.remove("orange");
        System.out.println(fruitCalories);//{banana=105, apple=95, lemon=17}

        //Maps unique keys to a value. Value unique not key. Populat implimentation: Hashmap, Treemap, LinkedHashmap
        //add calorie - fruit name as Key, calories as value. Does not inherit collection interface. Map has put method - Key + value.
        //unique key, pass value , updates existing key. Putifabscent - call to avoid if populated.
    }

    public void print(Collection<String> collection){
        Iterator<String> i = collection.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        for(String item : collection){
            System.out.println(item);
        }

        collection.forEach(System.out::println);
    }

    public void print(Map<String, Integer> map){
        for( Map.Entry entry : map.entrySet()){
            System.out.println(entry.getValue());
        }

        map.forEach(
                (k,v)->System.out.println("Fruit: " + k + ", Calories: " + v));
    }
}