import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Ja on 07/09/2015.
 */


class LI {

    ArrayList<Apple> GeneralLee = new ArrayList<Apple>();

    LI () {

        GeneralLee.add(new Apple());

        GeneralLee.add(new BigApple("General Big Apple"));
        GeneralLee.add(new BigApple());

        GeneralLee.add(new SmallApple("General Small Apple"));
        GeneralLee.add(new SmallApple());
    };


}


public class MyIterator {

    public LI myIteratorArrrayList = new LI();
    public  ArrayList<Apple> LM = new ArrayList<Apple>();


   MyIterator(){

       myIteratorArrrayList.GeneralLee.add(new Apple());

       LM = myIteratorArrrayList.GeneralLee;
       LM.add(new Apple());

       Iterator<Apple>myIterator =LM.iterator();

       while(myIterator.hasNext()) {
           Apple p = myIterator.next();
           System.out.print(p.id() + ":" + p + " iterator");
       }

       ListIterator<Apple>myListIterator = LM.listIterator();

       while(myListIterator.hasPrevious()){

           System.out.print(myListIterator.previous().id() + " hhh");
       }

   }


}
