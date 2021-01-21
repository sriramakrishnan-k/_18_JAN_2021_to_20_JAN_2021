import java.util.LinkedHashMap;

public class LinkedHashMapJava {
    public static void main(String args[]){
        LinkedHashMap<Float, Character> linkedHashMap = new LinkedHashMap<Float, Character>();

        char   charArray[]   = {'a', 'b', 'c', 'd'};
        float  floatArray[]  = {1, 2, 3, 4};

        for( int i = 0 ; i < 4 ; i++ ){
            linkedHashMap.put( floatArray[i], charArray[i] );
        }
        System.out.println( linkedHashMap.keySet() );
        System.out.println( linkedHashMap.values() );
        System.out.println( linkedHashMap );
    }
}
