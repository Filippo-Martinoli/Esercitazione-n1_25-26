/**
 * La classe {@code GiocaNumeri} contiene il metodo {@code main}
 * che avvia il gioco con due giocatori che tentano di indovinare
 * un numero vincente gestito dalla classe {@code GestoreGioco}.
 */
public class GiocaNumeri {

    /**
     * Metodo principale che rappresenta il punto di ingresso del programma.
     * Crea il gestore del gioco e due giocatori, li avvia come thread,
     * e attende la loro terminazione prima di stampare la fine del gioco.
     *
     * @param args argomenti passati da linea di comando (non utilizzati)
     * @throws Exception se si verifica un errore durante l'esecuzione del gioco
     */
    public static void main(String[] args) throws Exception {
        System.out.println("INIZIO!");

        // Crea il gestore del gioco
        GestoreGioco gg = new GestoreGioco();

        // Crea due giocatori che parteciperanno al gioco
        Giocatore g1 = new Giocatore("Mario", gg);
        Giocatore g2 = new Giocatore("Luigi", gg);

        // Avvia entrambi i thread dei giocatori
        g1.start();
        g2.start();

        // Attende che entrambi i giocatori terminino l’esecuzione
        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.out.println("errore");
        }

        System.out.println("FINE GIOCO!");
    }
}
