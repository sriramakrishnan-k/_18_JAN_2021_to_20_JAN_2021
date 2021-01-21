import java.util.TreeMap;

public class TreeMapJava {
    public static 
    void main(String args[]){

        TreeMap< Integer, Character > treeMap = new TreeMap< Integer, Character >();

        char charArray[] = {'a', 'b', 'c', 'd'};
        int  intArray[]  = {1, 2, 3, 4};
      
        for( int i = 0 ; i < 4 ; i++ ){
            treeMap.put( intArray[i] , charArray[i] ); 
        }

        System.out.println( treeMap.toString() );

        System.out.println( treeMap.containsKey(1) );
        System.out.println( treeMap.isEmpty() );
        System.out.println( treeMap.keySet() );
        System.out.println( treeMap.values() );
        
        System.out.println( treeMap.containsValue( 'b' ) );
        System.out.println( treeMap.replace( 1, 'A' ) );
        System.out.println( treeMap );

        treeMap.remove(2);
        System.out.println( treeMap );

        treeMap.clear();
        System.out.println( treeMap );

    }
}
