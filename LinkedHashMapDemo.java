import java.util.*;
class LinkedHashMapDemo {
    public static void main(String[] args) {
         Hashtable<Integer,String>map=new Hashtable<>();
    map.put(1,"Asif");
    map.put(2,"Fayaz");
    map.put(3,"koushik");
    map.put(4,"salma");
    map.put(5,"sameera");
    System.out.println(map.containsValue("Asif"));
     System.out.println(map.containsKey(5));
      System.out.println(map.isEmpty());
       System.out.println(map.get(1));
        System.out.println(map.keySet());
         System.out.println(map.values());
          System.out.println(map.remove(5));
           System.out.println(map);
            System.out.println(map.entrySet());
           map.clear();
            System.out.println(map);
            System.out.println(map.isEmpty());
    }
}
