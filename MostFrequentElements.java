import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentElements {
    public static List<Integer> frequent(int[] array) {
        int i;
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> elements = new ArrayList<>();

        // Dizideki elemanların frekansını hesaplama
        for (i = 0; i < array.length; i++) {
            mp.put(array[i], mp.getOrDefault(array[i], 0) + 1);
        }

        int max_count = 0, element = -1;

        // En çok tekrar eden elemanı bulma
        for (Map.Entry<Integer, Integer> val : mp.entrySet()) {
            if (max_count < val.getValue()) {
                element = val.getKey();
                max_count = val.getValue();
            }
        }
        for(Map.Entry<Integer, Integer> val : mp.entrySet()){
            if(val.getValue()==max_count){
                elements.add(val.getKey());
            }
        }

       return elements;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 4, 1, 2 ,2};
        List <Integer>result = new ArrayList<>();
        result = frequent(arr);
        System.out.println(result);
        
    }
}
