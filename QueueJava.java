import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;

public class QueueJava {
    
	public static void main(String args[]){
        
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();

        int arr[] = { 445, 852, 784, 7512 };
        for(int i : arr){arrayDeque.add(i);}

        System.out.println( arrayDeque.size() );
        System.out.println( arrayDeque.peek() );
        System.out.println( arrayDeque.poll() );
        System.out.println( arrayDeque.addAll( Arrays.asList(1, 2, 9, 5, 33, 15) ) );

        System.out.println( arrayDeque.toString() );
    
        System.out.println( arrayDeque.clone() );
        System.out.println( arrayDeque.contains(9) );
        System.out.println( arrayDeque.contains(100) );
        System.out.println( arrayDeque.containsAll(  Arrays.asList(1, 2, 9, 5, 33, 15) ) );
        
        System.out.println( arrayDeque.remove(3) );

        System.out.println( arrayDeque.toString() );

        arrayDeque.removeAll( Arrays.asList(1, 2, 9, 5, 33, 15) );
        
    }
}
