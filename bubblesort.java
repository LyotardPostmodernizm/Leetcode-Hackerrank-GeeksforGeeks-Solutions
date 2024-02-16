import java.util.Scanner;
/**
 * bubble sort
 */
public class bubblesort {

    


    public void bubble(int A[]){

        int n = A.length;
        int i,j;
        int swap;
        int tmp;
        for(i=0;i<n-1;i++){
            swap = 0;
            for(j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                    swap=1;
                }
            }
            if(swap == 0) break;
            
        }
        

    }

    public static void main(String args[]){
        bubblesort sort = new bubblesort();
        Scanner in = new Scanner(System.in);
        System.out.println("Array's length:");
        int n=in.nextInt();
        int Array[] = new int[n];
        int i;
        int eleman;
        for(i=0;i<n;i++){
            System.out.println("Array's "+i+". element:");
            eleman = in.nextInt();
            Array[i] = eleman;

        }
        System.out.println("Entered Array:");

        for(i=0;i<n;i++){
            System.out.print(Array[i]+" ");
        }
        sort.bubble(Array);

        System.out.println("Sorted Array:");

        for(i=0;i<n;i++){
            System.out.print(Array[i]+" ");
        }
        




    }
    
    
}

  
