package va.t5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("tree");
        System.out.println(list);
        list.subList(1,3).clear();
        System.out.println(list);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(2);
        System.out.println(priorityQueue.offer(3));
        priorityQueue.offer(1);

        System.out.println(priorityQueue.peek());

        Integer integer;
        while ((integer=priorityQueue.poll())!=null){
            System.out.println(integer);
        }

        Deque<Integer> deque=new ArrayDeque<>();
        deque.offerLast(3);
        deque.offerLast(2);
        deque.offerLast(1);

        while ((integer=deque.pollFirst())!=null){
            System.out.println(integer);
        }

        SortedSet<String> sortSet=new TreeSet<>();
        sortSet.add("sdf");
        sortSet.add("rfd");
        sortSet.add("esd");
        System.out.println(sortSet);
        sortSet.headSet("sdf").clear();
        System.out.println(sortSet);

        List<String> stringList=new ArrayList<>();
        stringList.add("dd");
        stringList.add("ff");
        stringList.add("dd");
        stringList.add("ff");
        System.out.println(stringList);

        Set<String> stringSet=new LinkedHashSet<>(stringList);
        System.out.println(stringSet);

        List<String> stringList2=new ArrayList<>(stringSet);
        System.out.println(stringList2);

        Map<String,String> map=new HashMap<>();
        map.put("foo","bar");
        map.put("bar","baz");
        System.out.println(map);
        System.out.println(map.remove("bar"));
        System.out.println(map);
        map.put("bar1","baz");
        map.put("bar2","baz");
        map.put("bar3","baz");

        for(String s:map.keySet()){
            System.out.print(s+" ");
        }
        System.out.println();

        for(String s:map.values()){
            System.out.print(s+" ");
        }
        System.out.println();

        for(Map.Entry<String,String> s:map.entrySet()){
            System.out.println(s.getKey()+" = "+s.getValue());
        }
        System.out.println();

    }
}
