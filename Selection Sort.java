import java.util.Scanner;
public class SortedArray {
    // write code here   
    public static int[] getIntegers(int length){
        int i;
        int Array[] = new int[length];
        Scanner in = new Scanner(System.in);
        for(i=0;i<length;i++){
            Array[i]=in.nextInt();
        }
        return Array;
    }
    public static void printArray(int[] A){
        int n= A.length;
        int i;
        for(i=0;i<n;i++){
            System.out.printf("Element %d contents %d",i,A[i]);
        }
    }
    public static int[] sortIntegers(int[] A){ //Selection Sort
        int i,j,max,tmp;
        for(i=0;i<A.length-1;i++){
            max = i;
            for(j=i+1;j<A.length;j++){
                if (A[j]>A[max]){
                    max=j;
                }
            }
            tmp = A[i];
            A[i] = A[max];
            A[max]=tmp;
        }
        return A;
        
    }
    
}


    
 
