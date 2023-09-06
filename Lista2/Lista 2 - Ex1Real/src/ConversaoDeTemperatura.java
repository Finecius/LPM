public class ConversaoDeTemperatura {

    private static double faren=0 , celsius=0;

    public static double TransfFaren (double celsius){
        return faren = (celsius*1.8)+32;
    }

    public static double TransfCelsius (double faren){
        return celsius = (faren-32)/1.8;
    }
}
