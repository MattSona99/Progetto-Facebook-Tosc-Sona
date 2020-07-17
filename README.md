# PROGETTO FACEBOOK

Lo scopo del progetto è quello di effettuare statistiche dei post Facebook di un utente mediante l'analisi di questi ultimi.

Il mezzo principale è l'uso dell'API che Facebook mette a disposizione nella sezione Developers (https://developers.facebook.com/), in particolare il Tool di esplorazione per la API Graph.

E' stata creata un'applicazione che consente di generare il codice dei post di un utente attraverso un AccessToken. L'AccessToken è stato aquisito dopo aver richiesto le varie autorizzazioni utente (ex.: user_posts, user_id, user_name, etc..). Dato che un AccessToken ha una scadenza piuttosto rapida, è stato poi generato un AccessToken di lunga durata (con scadenza 15 Settembre 2020).

Mediante l'uso del Software Eclipse si è poi sviluppato il codice in Java per effettuare una chiamata all'API di Facebook e poter effettuare le varie statistiche.
Per fare ciò, abbiamo importato dentro al progetto una nuova Referenced Library che permette di connettersi con la nostra applicazione (restfb.jar).

La nostra applicazione permette all'utente di analizzare i seguenti dati mediante API GET:

- Statistiche sulle lunghezze dei post (media dei caratteri, post con più caratteri, post con meno caratteri);
- Statistiche su post scritti esclusivamente con caratteri maiuscoli;
- Statistiche su hashtags presenti nei post;
- Salvare la lista dei Post in un nuovo File in un percorso a scelta dell'utente (bisogna modificarlo nel codice);
Il tutto è stato implementato con Window Builder, permettendo di creare:
- una schermata di Login utente attraverso la verifica del proprio AccessToken;
- una schermata contenente un Menù con tutte le possibili funzioni;

Il progetto in Java è stato suddiviso nel seguente modo:

Package Facebook_Call:  -> Class Call : 
                              - Leggi_Post : consente di accedere ai post di un utente e salvarli su un Vector dinamico di tipo String, restituisce un oggetto di tipo                                           User_Profile; 
                        -> Class User_Profile : 
                              - getUser_name : restituisce una String; 
                              - setUser_name : fa in modo di modificare la String passatagli come parametro;
Package Salva_File:     -> Class Writer:
                              - Scrivi_File : consente di scrivere su file il Vector di String passatogli come parametro; è qui che l'utente deve inserire il percorso del file                                   in cui vuole che venga salvata la lista dei post;
Package Statistiche:    -> Class Hashtags:
                              - controllo: restituisce true se nella String passatagli c'è un carattere del tipo "#";
                              - hashtag: controlla, attraverso la funzione "controllo", se nella lista dei post sono presenti hashtags;
                        -> Class SoloMaiuscoli:
                              - Controllo: restituisce true se nella String passatagli ci sono esclusivamente caratteri maiuscoli, con eccezione degli spazi;
                              - Maiuscolo: controlla, attraverso la funzione "Controllo", se nella lista dei post sono presenti post esclusivamente in maiuscolo; 
                              - getM : restituisce il vettore dei post con hashtags;
                        -> Class Lunghezza:
                              - lunghezza: salva su un vettore di int tutte le lunghezze del vettore di String passatogli come parametro;
                              - media: restituisce il valore (int) della media di tutte le lunghezze dei post;
                              - minimo: restituisce il valore (int) del post con lunghezza minore;
                              - massimo: restituisce il valore (int) del posto con lunghezza maggiore;
Package LoginGUI:       -> Class LoginScreen:
                              - main : inizializza e rende visibile la schermata di Login;
                              - LoginScreen : inizializza tutte le caratteristiche della schermata di Login (ed inizializza la schermata di Menù se l'AccessToken è valido);
                        -> Class Menù:
                              - initialize: inizializza tutte le caratteristiche della schermata di Menù (è qui che vengono chiamati i diversi metodi degli altri package);
Package testFacebook:   -> Class testCall: consente di effettuare test sulla Call all'API di Facebook, controllando se l'username sia giusto; 
                        -> Class testMedia: consente di effettuare test sulla media della lunghezza dei post, controllando quest'ultima;






DATI:
AccessToken per il profilo di Lorenzo Toscanelli : EAAKdS6UMQ6QBAMb3oNDOmZA1n7e2ZAoAGkJcbmDfuKtKnIDX4C4gZBIsSmhaCbYOUUuG3PPSLovKG36tPeyAyiNyHuedicxd8DDlfKwUVZCny8crH27QYQ94tZAn0kZB4OarWnwim7QcZA9v9AXWX17gFqduUlmZCMIFgAfIsuZCZBcwZDZD
AccessToken per il profilo di Matteo Sonaglioni : EAAjCznvVZCs4BAM4ZCbEsJd4uDK5NPFZB7uSkAvNY1gbLJZC2RPpVurryf8o0q9z0T6CKKwEM7ts9ygO1hd40DZB4ft0dZAxsutBKQXhkxyYowHdtRWxFrvF0D0hAF1pzQKnI5dA0pNgmNQbHKbmZCNTZBviOPMU2yk4KJ6tzgDNPwZDZD

