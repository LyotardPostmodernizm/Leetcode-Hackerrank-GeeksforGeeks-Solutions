import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

    public static int frequent(int[] array) {
        int i;
        Map<Integer, Integer> mp = new HashMap<>();

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

        return element;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 4, 1};
        int element = frequent(arr);
        System.out.println("most frequent element is= "+element);
    }
}
