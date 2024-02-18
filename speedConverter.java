public class SpeedConverter { //Converts kilometer to millis
    public static long toMilesPerHour(double kilometersPerHour){
        double value;
        long result;
        if(kilometersPerHour<0) return -1;
        else{
            value=kilometersPerHour/1.609;
            result=Math.round(value);
        
        }
        return result;
    }
    public static void printConversion(double kilometersPerHour){
       
        if(kilometersPerHour<0) System.out.println("Invalid Value");
        else{
            
            System.out.println(kilometersPerHour+ " km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }

}
