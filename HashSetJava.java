import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.*;

public class HashSetJava {

    public static void main( String args[]){
        HashSet<Integer> hashSet = new HashSet();

        Stream.of( 1, 2, 3, 4 ).forEach(hashSet::add);
        System.out.println(hashSet);
        hashSet.forEach(System.out::println);
        System.out.println( hashSet.contains(2) );
        hashSet.addAll( Arrays.asList(78, 78, 45, 78, 22) );

        System.out.println( hashSet );
        System.out.println( hashSet.remove(45));
        System.out.println( hashSet );

        System.out.println( hashSet.isEmpty() );
        Iterator<Integer> iter = hashSet.iterator();

        while( iter.hasNext() ){
            System.out.println( iter.next() );
        }
    }
}
