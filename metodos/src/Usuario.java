public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.abaixarVolume();
        smartTv.mudarCanal(2);
        smartTv.desligar();
    }
}
