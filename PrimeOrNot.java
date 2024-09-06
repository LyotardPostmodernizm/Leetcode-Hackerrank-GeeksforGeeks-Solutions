import java.util.Scanner;

public class PrimeOrNot {
    public static Boolean control(int number){
        
        int i=3;

        if(number==2) return true;

        else if(number%2==0) return false;
            
        while(i*i<number && number%i!=0){
            i+=2;
        }
        if(i*i>=number){
            
            return true;
        } 
        else{
            
            return false;
        }


        
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number= ");
        int number=scanner.nextInt();
        if(control(number)){
            System.out.println("Prime");
        }
        else System.out.println("Not Prime");
    }
}
