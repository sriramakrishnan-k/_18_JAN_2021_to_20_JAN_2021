import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListJava {
	public static void main(String args[]){
        
        ArrayList<Integer> arrayList = new ArrayList<>();

        int arr[] = { 445, 852, 784, 7512};
        for(int i : arr){arrayList.add(i);}

        System.out.println( arrayList.size() );
        System.out.println( arrayList.get(2) );
        System.out.println( arrayList.remove(3) );
        System.out.println( arrayList.addAll( Arrays.asList(1, 2, 9, 5, 33, 15) ) );

        System.out.println( arrayList.toString() );
        System.out.println( arrayList.indexOf(852) );
        System.out.println( arrayList.indexOf(33) );
        System.out.println( arrayList.clone() );
        System.out.println( arrayList.contains(9) );
        System.out.println( arrayList.contains(100) );
        System.out.println( arrayList.containsAll(  Arrays.asList(1, 2, 9, 5, 33, 15) ) );
        
        System.out.println( arrayList.remove(3) );

        System.out.println( arrayList.toString() );

        arrayList.removeAll( Arrays.asList(1, 2, 9, 5, 33, 15) );
        
    }

}
