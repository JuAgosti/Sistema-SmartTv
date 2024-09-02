public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //ligada ou desligada
    public void ligar(){
        ligada=true;
    }
    
    public void desligar(){
        ligada=false;
    }

    //mudar volume
    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
        System.out.println("Aumentado o volume para: " + volume);
    }

        public void diminuirVolume(){
        System.out.println("Diminuindo o valor para: " + volume);
        //volume = volume - 1;
        volume--;
    }

    //mudar canal
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
       canal++;  
    }

    public void diminuirCanal(){
        canal--;  
    }
    
}
