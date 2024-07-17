package desafios.poo;

public class Iphone {
    public static void main(String[] args) {
        MeuReprodutorMusical vlcPlayer = new MeuReprodutorMusical();
        MeuNavegadorInternet chrome = new MeuNavegadorInternet();
        MeuAparelhoTelefonico dial = new MeuAparelhoTelefonico();

        vlcPlayer.tocar();
    }
}
