public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("Novo status- TV ligada? " + ligada);
    }

    public void desligar() {
        ligada = false;
        System.out.println("Novo status- TV ligada? " + ligada);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void abaixarVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Você mudou para o canal: " + canal);
    }

    public void subirCanal() {
        canal++;
    }

    public void baixarCanal() {
        canal--;
    }
}
