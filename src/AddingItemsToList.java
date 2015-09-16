import java.util.*;
import java.util.Iterator;

/**
 * Created by Ja on 07/09/2015.
 */

class AddAll {

    public Collection<Integer> myCollection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));


    Integer[] moreInts = {66, 77, 88, 99};
    List<Integer> nums1 = Arrays.asList(1,2,-1);

    public void addStuff() {

        myCollection.addAll(Arrays.asList(moreInts));
        myCollection.addAll(nums1);

        Collections.addAll(myCollection, 11, 12, 13, 14, 15);
        Collections.addAll(myCollection, moreInts);
        System.out.println("AddAll addStuff");

    }



        /*@Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Integer> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Integer integer) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Integer> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }*/

}


public class AddingItemsToList {
    AddingItemsToList(){

        AddAll adi = new AddAll();
        adi.addStuff();
        System.out.println(adi.toString());
    }



}
