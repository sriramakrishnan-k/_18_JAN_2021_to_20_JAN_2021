import java.util.HashMap;

public 
class HashMapJava {

    public static 
    void main(String args[]){

        HashMap< Integer, Character > hashMap = new HashMap< Integer, Character >();

        char charArray[] = {'a', 'b', 'c', 'd'};
        int  intArray[]  = {1, 2, 3, 4};
      
        for( int i = 0 ; i < 4 ; i++ ){
            hashMap.put( intArray[i] , charArray[i] ); 
        }

        System.out.println( hashMap.toString() );

        System.out.println( hashMap.containsKey(1) );
        System.out.println( hashMap.isEmpty() );
        System.out.println( hashMap.keySet() );
        System.out.println( hashMap.values() );
        
        System.out.println( hashMap.containsValue( 'b' ) );
        System.out.println( hashMap.replace( 1, 'A' ) );
        System.out.println( hashMap );

        hashMap.remove(2);
        System.out.println( hashMap );

        hashMap.clear();
        System.out.println( hashMap );

    }
}
