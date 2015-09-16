import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Ja on 07/09/2015.
 */






class SmallApple extends Apple{

    String name;
    SmallApple(){

        System.out.println("SmallApple");
    }


    SmallApple(String name){

        System.out.println("SmallApple name:" + name);
    }
}

class BigApple extends Apple{
    String name;
    BigApple(){

        System.out.println("BigApple");
    }

    BigApple(String name){

        System.out.println("BigApple name:" + name);
    }



}


public class Upcasting {
    public ArrayList<Apple>variousApples = new ArrayList<Apple>();
    Upcasting(){

        variousApples.add(new Apple());
        variousApples.add(new SmallApple());
        variousApples.add(new BigApple());
        Collections.addAll(variousApples, new Apple(), new Apple());

    }




}