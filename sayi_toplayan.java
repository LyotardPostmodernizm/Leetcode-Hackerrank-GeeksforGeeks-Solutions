public class sayi_toplayan {

    public static int number_add(String text){
        int i=0;
        int number=0;
        int number2;
        int sum = 0;
        char karakter;
        while(i<text.length()){

            if(Character.isDigit(text.charAt(i))){
                karakter = text.charAt(i);
                number = Character.getNumericValue(karakter);
                
                while(i+1 <text.length() && Character.isDigit(text.charAt(i+1))){
                    number2 = Character.getNumericValue(text.charAt(i+1));
                    number = number*10 + number2;
                    i++;
                    
                }
                sum += number;
                
                
            }

            i++;
            
        }
        return sum;


    }

    public static void main(String[] args) {
        String metin = "a1c21b210";
        int sonuc = number_add(metin);
        System.out.println(sonuc);
    }
}