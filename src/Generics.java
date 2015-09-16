import java.util.ArrayList;

/**
 * Created by Ja on 06/09/2015.
 */


class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }

}


public class Generics {

    ArrayList<Apple> apples = new ArrayList<Apple>();

    public void generateApples(){

        for(int i = 0; i < 3; i++)
            apples.add(new Apple());

        for(int i = 0; i < apples.size(); i++)
            System.out.println(apples.get(i).id());

        for(Apple c : apples)
            System.out.println(c.id());
    }

}
