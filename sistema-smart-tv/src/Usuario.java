public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTV = new SmartTv();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual:" + smartTV.volume);

        System.out.println("Canal atual:" + smartTV.canal);

        smartTV.mudarCanal(13);
        
        System.out.println("Canal atual:" + smartTV.canal);
        
        System.out.println("Tv ligada?" + smartTV.ligada);
        System.out.println("Canal atual:" + smartTV.canal);
        System.out.println("Volume atual:" + smartTV.volume);

        smartTV.ligar ();
        System.out.println("Novo Status -> Tv ligada?" + smartTV.ligada);

        smartTV.desligar ();
        System.out.println("Novo Status -> Tv ligada?" + smartTV.ligada);
    }
}
