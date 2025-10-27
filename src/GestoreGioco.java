/**
 * La classe {@code GestoreGioco} gestisce un semplice gioco
 * in cui l'utente deve indovinare un numero vincente.
 */
public class GestoreGioco {

    /**
     * Il numero che rappresenta la combinazione vincente del gioco.
     */
    private int numeroVincente;

    /**
     * Costruttore della classe {@code GestoreGioco}.
     * Inizializza il numero vincente a 10.
     */
    public GestoreGioco() {
        numeroVincente = 10;
    }

    /**
     * Verifica se il numero inserito dall'utente corrisponde
     * al numero vincente. Stampa un messaggio in console che
     * indica se il numero è corretto o meno.
     *
     * @param num il numero inserito dall'utente da confrontare con quello vincente
     */
    public void verifica(int num) {
        if (num == numeroVincente) {
            // verifica num
            System.out.println("Il numero è giusto, BRAVO!!!");
        } else {
            System.out.println("Il numero è sbagliato, riprova!!!");
        }
    }
}
