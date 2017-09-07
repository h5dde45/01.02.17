package sl.t4;

import java.time.LocalDate;

class Gener<Y>{
    Y obj;

    public Gener(Y obj) {
        this.obj = obj;
    }

    public Y getObj() {
        return obj;
    }
    void showType(){
        System.out.println("Type Y is "+obj.getClass().getName());
    }
}

public class SimpleExample {
    public static void main(String[] args) {

        Gener<Integer> iObj;
        Gener<String> sObj;
        Gener<LocalDate> dObj;
//        Gener<int> i;  - only reference types

        iObj=new Gener<>(22);
//        iObj=new Gener<>(22.); - wrong
//        iObj=new Gener<>("22");  - wrong
//        iObj=new Gener<>(LocalDate.now()); - wrong
        sObj=new Gener<>("str22");
        dObj=new Gener<>(LocalDate.now());

//        iObj=sObj;  - wrong

        iObj.showType();
        Integer i = iObj.getObj();
        System.out.println(i);

        sObj.showType();
        String s = sObj.getObj();
        System.out.println(s);

        dObj.showType();
        LocalDate date = dObj.getObj();
        System.out.println(date);


    }
}
