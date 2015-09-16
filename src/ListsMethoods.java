import java.util.*;

/**
 * Created by Ja on 07/09/2015.
 */

class generateList {


    ArrayList<Apple> appleList = new ArrayList<Apple>();

    generateList() {

        appleList.add(new Apple());

        appleList.add(new BigApple("I am a BigApple"));
        appleList.add(new BigApple());

        appleList.add(new BigApple("I am a SmallApple"));
        appleList.add(new BigApple());

    }

}


public class ListsMethoods {

    public generateList myLovelyNewArrrayList = new generateList();
    public  ArrayList<Apple> LM = new ArrayList<Apple>();


    ListsMethoods() {

        myLovelyNewArrrayList.appleList.add(new Apple());

        LM = myLovelyNewArrrayList.appleList;
        LM.add(new Apple());

        Apple funnyApple = new BigApple("funnyApple");
        LM.add(funnyApple);
        // Is there any funnyApple Apple? returns true
        System.out.println(LM.contains(funnyApple));
        System.out.println("LM.indexOf(funnyApple) :" + LM.indexOf(funnyApple));

        LM.remove(funnyApple);

        LM.contains(funnyApple); // now returns false
        System.out.println(LM.get(2).id()); // 10
        System.out.println(LM.size()); // 7

        for (Apple A: LM)
            System.out.println(A.id());

    }


    public void moreMethods(){

        LM.add(3, new SmallApple("another SmallApple"));
        System.out.println("LM.size: " + LM.size());  // 8

        List<Apple> sub = LM.subList(1, 4);
        System.out.println("sub: " + sub.toString()); // sub: [BigApple@14ae5a5, BigApple@7f31245a, SmallApple@6d6f6e28]
       // Collections.sort(sub);

        sub = Arrays.asList(LM.get(1), LM.get(3));
        System.out.println("sub: " + sub.toString());  //sub: [BigApple@14ae5a5, SmallApple@6d6f6e28]


        LM.addAll(sub);

        LM.set(2, new BigApple("AnotherBigApple"));
        System.out.println("LM: " + LM.toString());

    }

}
