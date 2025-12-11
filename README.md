## GiocaNumeri

Questo progetto implementa un  gioco in cui due giocatori, rappresentati tramite thread, cercano di indovinare un numero vincente gestito dalla classe GestoreGioco.

## Descrizione del progetto

Il programma simula una piccola sfida tra due giocatori:

1. Ogni giocatore viene eseguito come thread.
2. I giocatori chiedono all’utente di inserire un numero.
3. Il numero viene confrontato con la combinazione vincente.
4. Il gioco termina quando entrambi i thread hanno completato il tentativo.

## Struttura delle classi

## GestoreGioco
- Contiene il numero vincente (impostato da me a 10).
- Metodo verifica (int num) per controllare se il numero inserito dal giocatore è corretto.

## Giocatore
- Estende Thread.
- Ogni thread:
- comunica il proprio nome,
- richiede un numero tramite input,
- chiama gg.verifica(num) per la verifica.

## GiocaNumeri (classe main)
- Avvia l’intera applicazione.
- Crea:
- un GestoreGioco,
- due giocatori (Mario e Luigi),
- avvia e sincronizza i thread con start() e join().

