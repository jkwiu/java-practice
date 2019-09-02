package app.listiterator;

import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        
        list.add("1");
        list.add("2");
        list.add("3");
        
        ListIterator it = list.listIterator();

        while(it.hasNext()){
            System.out.println("next:" + it.next());           
        }

        while(it.hasPrevious()){
        System.out.println("previous: " + it.previous());
        }
    }
}