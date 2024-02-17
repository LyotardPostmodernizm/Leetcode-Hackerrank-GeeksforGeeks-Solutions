import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
public class sort_string_lists {
    public static void main(String[] args) throws Exception {
       ArrayList<String> list = new ArrayList<String>();

       Comparator<String>comp = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            if(o1.length()>o2.length()) return 1;
            else return -1;
            
        }
       };
       list.add("Mehmetasdasdas");
       list.add("Onur");
       list.add("Aysel");
       System.out.println("Before sorting:");
       System.out.println(list);
       Collections.sort(list,comp);
       System.out.println("After sorting:");
       System.out.println(list);

       
       
    }
}