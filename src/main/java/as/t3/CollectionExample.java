package as.t3;

public class CollectionExample {
    public static void main(String[] args) {
//        List arrayList = new ArrayList();
//        List lincedList = new LinkedList();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);

//        Iterator iterator=arrayList.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        int  r = 0;
//        for (Object i : arrayList) {
//            r+=(int)i;
//            System.out.println(i);
//        }
//        System.out.println(r);
//
//        ListIterator listIterator=arrayList.listIterator();
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.next());
//        }
//        System.out.println("**********************");

//        Set set=new HashSet();
//        Set set = new TreeSet();
//        for (int i = 9; i >=0; i--) {
//            set.add(""+i);
//        }
//        for (int i = 9; i >= 0; i--) {
//            set.add(new MyClass("" + i));
//        }
//        set.add(""+22);
//        set.add(""+112);
//        set.add(""+12);
//        set.add(""+122);
//        for(Object s:set){
//            System.out.println(s+", ");
//        }
////        System.out.println();
//        System.out.println("**********************");
//        System.out.println("**********************");
//
//        Map map=new HashMap();
//
//        for (int i = 0; i < 10; i++) {
//            map.put(i,"Name: "+i);
//        }
//        System.out.println(map.get(1));
//        System.out.println(map);

//        Set set = new TreeSet();
//
//        Test test = new Test();
//        test.setName(new Date());
//        Test<Integer> test1 = new Test<>();
//        test.setName(34);
//        Test<String> test2 = new Test<>();
//        test2.setName("4444");



    }
}

class MyClass implements Comparable<MyClass>
//        Comparable
{
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(MyClass myClass) {
//        MyClass mc = (MyClass) o;
        return name.compareTo(myClass.getName());
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Test<D> {
    private D name;

    public D getName() {
        return name;
    }

    public void setName(D name) {
        this.name = name;
    }
}
