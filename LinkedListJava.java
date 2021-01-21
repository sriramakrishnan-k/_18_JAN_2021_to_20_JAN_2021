import java.util.LinkedList;
import java.util.Arrays;

public class LinkedListJava {
    public static void main(String args[]){
        LinkedList<Integer> linkedList = new LinkedList<>();
    int arr[] = { 445, 852, 784, 7512};
        for(int i : arr){linkedList.add(i);}

        System.out.println( linkedList.size() );
        System.out.println( linkedList.get(2) );
        System.out.println( linkedList.remove(3) );
        System.out.println( linkedList.addAll( Arrays.asList(1, 2, 9, 5, 33, 15) ) );

        System.out.println( linkedList.toString() );
        System.out.println( linkedList.indexOf(852) );
        System.out.println( linkedList.indexOf(33) );
        System.out.println( linkedList.clone() );
        System.out.println( linkedList.contains(9) );
        System.out.println( linkedList.contains(100) );
        System.out.println( linkedList.containsAll(  Arrays.asList(1, 2, 9, 5, 33, 15) ));
        
        System.out.println( linkedList.remove(3) );

        System.out.println( linkedList.toString() );

       linkedList.removeAll( Arrays.asList(1, 2, 9, 5, 33, 15) );
    }
}
