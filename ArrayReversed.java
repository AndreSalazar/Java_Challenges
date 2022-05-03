import java.util.*;

class ArrayReversed {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
        List<Integer> reverse = new ArrayList<>(a.size());
        for(int i = a.size()-1; i >= 0; i--){
            reverse.add(a.get(i));
        }
        
        return reverse;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(4);
		array.add(3);
		array.add(2);
		
		System.out.println("Original array: " + array);
		System.out.println("Reverse array: "  + reverseArray(array));
	}

}

