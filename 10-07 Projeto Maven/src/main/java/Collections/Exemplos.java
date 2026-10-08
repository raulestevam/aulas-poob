package Collections;

import java.util.*;

public class Exemplos {
    public static void main (String[] args){
        List<String> nomesArrayList = new ArrayList<>();
        nomesArrayList.add("João");
        nomesArrayList.add("Maria");
        nomesArrayList.add("Miguel");
        nomesArrayList.remove(1);
        //varredura
        for(String s:nomesArrayList){
            System.out.println("Item: "+s);
        }
        Iterator iter = nomesArrayList.iterator();
        while(iter.hasNext()){
            System.out.println("Item: "+iter.next());
        }

        List<String> nomesLinkedList = new LinkedList();
        nomesLinkedList.add("Bruna");
        nomesLinkedList.add("Julia");
        nomesLinkedList.add("Eduarda");
        nomesLinkedList.remove("Julia");
        for(String s:nomesLinkedList){
            System.out.println("Item: "+s);
        }

        Set<String> nomesHashSet = new HashSet<>();
        nomesHashSet.add("João");
        nomesHashSet.add("Maria");
        nomesHashSet.add("Giovana");
        for(String s:nomesHashSet){
            System.out.println("Item: "+s);
        }
        nomesHashSet.remove(1);

        Set<String> nomesTreeSet = new TreeSet<>();
        nomesTreeSet.add("Larissa");
        nomesTreeSet.add("Vanessa");
        nomesTreeSet.add("Carol");
        for(String s:nomesTreeSet){
            System.out.println("Item: "+s);
        }
        nomesTreeSet.remove("Larissa");

        Map<Integer, String> nomesHashMap = new HashMap<>();
        nomesHashMap.put(1, "Mariana");
        nomesHashMap.put(2, "Lorena");
        nomesHashMap.put(3, "Bianca");
        System.out.println(""+nomesHashMap.get(1));
        nomesHashMap.remove(1);
        for (Map.Entry<Integer, String> item:nomesHashMap.entrySet()){
            System.out.println(item.getKey()+"<->"+item.getValue());
        }
        for (Integer key:nomesHashMap.keySet()){
            System.out.println(key+"<->"+nomesHashMap.get(key));
        }
        nomesHashMap.forEach((key, value)->{
            System.out.println(key+" ->"+value);
        });

        Map<Integer, String> nomesTreeMap = new TreeMap<>();
        nomesTreeMap.put(1, "Jessica");
        nomesTreeMap.put(2, "Brenda");
        nomesTreeMap.put(3, "Cristina");
        nomesTreeMap.forEach((k, v)->{
            System.out.println(k+" == "+v);
            System.out.println(nomesTreeMap.get(k));
        });

        Set<String> nomesLinkedHashSet = new LinkedHashSet<>();
        nomesLinkedHashSet.add("Luana");
        nomesLinkedHashSet.add("Marina");
        nomesLinkedHashSet.add("Mônica");

        Queue<String> nomesQueue = new PriorityQueue<>();
        nomesQueue.add("Jonas");
        nomesQueue.add("Lucas");
        nomesQueue.add("Márcio");
        nomesQueue.forEach((v)->{
            System.out.println(v);
        });
        nomesQueue.remove();
        nomesQueue.remove("Jonas");

        List<List<String>> listaS = new ArrayList<>();

        Deque<String> deque = new ArrayDeque<>();
        deque.add("João");
        deque.addFirst("Primeiro");
        deque.addLast("Último");

    }
}
