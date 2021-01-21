import java.util.Iterator;
import java.util.TreeSet;
import java.util.Arrays;

public class TreeSetJava {
    public static void main( String args[] ){
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll( Arrays.asList(14, 55, 59, 23, 75, 75) );
        Iterator<Integer> iter = treeSet.iterator();

        for( ; iter.hasNext() ; System.out.print( iter.next() + " " ) ){}
        System.out.println();

        System.out.println( "descending iterator" );
        Iterator<Integer> descendingIter = treeSet.descendingIterator();
        while( descendingIter.hasNext() ){
            System.out.print( descendingIter.next() );
            System.out.println();
        }
        System.out.println( " ceiling of 50 : " + treeSet.ceiling(50) );
        System.out.println( " floor   of 50 : " + treeSet.floor(50) );

        System.out.println( " ceiling of 50 : " + treeSet.higher(50) );
        System.out.println( " floor   of 50 : " + treeSet.lower(50) );
    }
}
