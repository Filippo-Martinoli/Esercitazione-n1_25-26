import java.util.Scanner;


public class Giocatore extends Thread {
    //attributi
    int punteggio;
    String nome;
    int id;
    GestoreGioco gg;


    //metodi
    /*
     *
     */
    public Giocatore(String nome) {
        this.nome = nome;
        punteggio = 0;
    }


    public Giocatore(String nome, GestoreGioco gestore) {
        this.nome = nome;
        this.gg = gestore;
    }

    public void comunica() {
        System.out.printf("Sono il giocatore %s !!!\n", nome);
    }


    public void gioca() {

        //chiedere in input un numero
        System.out.println("Inserisci un numero: ");
        //leggere il numero inserito
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //visualizzare il numero scelto
        System.out.println("Ho scelto il numero " + num);
        gg.verifica(num);
    }

    @Override
    public void run() {
        comunica();
        /* try {
           sleep(5000);
        } catch(InterruptedException e) {
            System.err.println("");
        }*/
        gioca();
    }
}

