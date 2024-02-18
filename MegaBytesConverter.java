public class MegaBytesConverter {
    // write code here
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int mb;
        int kb;
        if(kiloBytes<0) System.out.println("Invalid Value");
        else{
            mb = kiloBytes/1024;
            kb = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+mb+" MB and "+kb+ " KB");
        }
        
    }
}
