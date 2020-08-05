public class WHotToDo {
    public static void main(String[] args) {
        int tame = 19;
        boolean inGoodWeather = false;
        boolean late = tame >= 23 || tame <= 5;
        if ( late) {
            System.out.println(" спать");
        }
        if ( !late && inGoodWeather) {
            System.out.println(" гулять");
        }
        if ( !late && !inGoodWeather){
            System.out.println(" читать");
            

        }


    }
}
