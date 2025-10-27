import java.util.Scanner;

/**
 * La classe {@code Giocatore} rappresenta un partecipante al gioco.
 * Ogni giocatore è gestito come un thread che comunica con un oggetto
 * {@code GestoreGioco} per provare a indovinare un numero vincente.
 */
public class Giocatore extends Thread {

    /** Il punteggio del giocatore (non ancora utilizzato in questa versione). */
    int punteggio;

    /** Il nome del giocatore. */
    String nome;

    /** L'identificatore del giocatore (non ancora utilizzato in questa versione). */
    int id;

    /** Riferimento all'oggetto {@code GestoreGioco} che gestisce la verifica del numero. */
    GestoreGioco gg;

    /**
     * Costruttore della classe {@code Giocatore}.
     * Inizializza il giocatore con un nome e punteggio iniziale pari a 0.
     *
     * @param nome il nome del giocatore
     */
    public Giocatore(String nome) {
        this.nome = nome;
        punteggio = 0;
    }

    /**
     * Costruttore della classe {@code Giocatore}.
     * Inizializza il giocatore con un nome e un riferimento al {@code GestoreGioco}.
     *
     * @param nome il nome del giocatore
     * @param gestore il gestore del gioco con cui il giocatore interagisce
     */
    public Giocatore(String nome, GestoreGioco gestore) {
        this.nome = nome;
        this.gg = gestore;
    }

    /**
     * Comunica il nome del giocatore stampandolo a video.
     */
    public void comunica() {
        System.out.printf("Sono il giocatore %s !!!\n", nome);
    }

    /**
     * Esegue una giocata chiedendo all'utente di inserire un numero,
     * visualizzando il numero scelto e chiamando il metodo verifica()
     * del GestoreGioco per controllare se è corretto.
     */
    public void gioca() {
        // chiedere in input un numero
        System.out.println("Inserisci un numero: ");

        // leggere il numero inserito
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // visualizzare il numero scelto
        System.out.println("Ho scelto il numero " + num);

        // verifica tramite GestoreGioco
        gg.verifica(num);
    }

    /**
     * Metodo eseguito quando il thread del giocatore viene avviato.
     * Il giocatore comunica il proprio nome e poi gioca.
     */
    @Override
    public void run() {
        comunica();
        gioca();
    }
}
