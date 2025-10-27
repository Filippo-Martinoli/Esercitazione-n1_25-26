
public class GestoreGioco {

    private int numeroVincente;


    public GestoreGioco() {
        numeroVincente = 10;
    }

    
    public void verifica(int num) {
        if (num == numeroVincente) {
            // verifica num
            System.out.println("Il numero è giusto, BRAVO!!!");
        } else {
            System.out.println("Il numero è sbagliato, riprova!!!");
        }
    }
}
