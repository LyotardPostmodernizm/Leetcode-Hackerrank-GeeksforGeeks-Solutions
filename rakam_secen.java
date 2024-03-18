import java.util.ArrayList;

public class rakam_secen {

    public static ArrayList<Character> rakam_sec(String metin1){
        int i;
        ArrayList<Character>rakamlar = new ArrayList<Character>();
        for(i=0;i<metin1.length();i++){
            if(Character.isDigit(metin1.charAt(i))){
                rakamlar.add(metin1.charAt(i));
            }

            
        }
        return rakamlar;
    }

    public static void main(String[] args) {
        String metin = "ahmad12mehmet234qwqef4523fsdfsf30";
        ArrayList<Character>sonuc  = rakam_sec(metin);
        System.out.println(sonuc);
        System.out.println("Length = "+sonuc.size());



    }
}