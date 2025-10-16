public class GiocaNumeri {
    public static void main(String[] args) throws Exception {
        System.out.println("INIZIO!");
        GestoreGioco gg = new GestoreGioco();
        Giocatore g1 = new Giocatore("Mario", gg);
        Giocatore g2 = new Giocatore("Luigi", gg);


        g1.start();
        g2.start();


        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.out.println("errore");
        }


        System.out.println("FINE GIOCO!");
    }
}
