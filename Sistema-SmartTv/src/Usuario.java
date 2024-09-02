public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV LIGADA? " + smartTv.ligada);
        System.out.println("CANAL ATUAL: " + smartTv.canal);
        System.out.println("VOLUME ATUAL: " + smartTv.volume);
    
        //ligar e desligar a TV  
        smartTv.ligar();
        System.out.println("NOVO SATUS -> TV LIGADA? " + smartTv.ligada);
    
        smartTv.desligar();
        System.out.println("NOVO SATUS -> TV LIGADA? " + smartTv.ligada);
        
        //volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("VOLUME ATUAL: " + smartTv.volume);

        //mudar o canal
        smartTv.mudarCanal(13);
        System.out.println("CANAL ATUAL: " + smartTv.canal);
    }
        
}
