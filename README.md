# SCOPO

Lo scopo del progetto è quello di effettuare statistiche dei post Facebook di un utente mediante l'analisi di questi ultimi.

Il mezzo principale è l'uso dell'API che Facebook mette a disposizione nella sezione Developers (https://developers.facebook.com/), in particolare il Tool di esplorazione per la API Graph.

E' stata creata un'applicazione che consente di generare il codice dei post di un utente attraverso un AccessToken. L'AccessToken è stato aquisito dopo aver richiesto le varie autorizzazioni utente (ex.: user_posts, user_id, user_name, etc..). Dato che un AccessToken ha una scadenza piuttosto rapida, è stato poi generato un AccessToken di lunga durata (con scadenza 15 Settembre 2020).

Mediante l'uso del Software Eclipse si è poi sviluppato il codice in Java per effettuare una chiamata all'API di Facebook e poter effettuare le varie statistiche.
Per fare ciò, abbiamo importato dentro al progetto una nuova Referenced Library che permette di connettersi con la nostra applicazione (restfb.jar).

# FUNZIONI DELL'APPLICAZIONE:


La nostra applicazione permette all'utente di analizzare i seguenti dati mediante API GET:

- Statistiche sulle lunghezze dei post (media dei caratteri, post con più caratteri, post con meno caratteri);
- Statistiche su post scritti esclusivamente con caratteri maiuscoli;
- Statistiche su hashtags presenti nei post;
- Salvare la lista dei Post in un nuovo File in un percorso a scelta dell'utente (bisogna modificarlo nel codice);

Il tutto è stato implementato con Window Builder, permettendo di creare:
- una schermata di Login utente attraverso la verifica del proprio AccessToken;
- una schermata contenente un Menù con tutte le possibili funzioni;

# PROGETTO JAVA:


Il progetto in Java è stato suddiviso nel seguente modo:
- Package Facebook_Call : Presenta le classi con cui ci colleghiamo all'API e restituisce i metadati;
- Package Salva_File : Presenta la classe per salvare tutti i post in un file (il percorso di destinazione deve essere modificato all'interno del codice);
- Package Statistiche: Presente le classi per ottenere statistiche su media della lunghezza dei post, post più lungo/corto, post con hashtags e post solo in maiuscolo;
- Package LoginGUI : Presenta le classi con cui sono state create le due interfacce (Login e Menù) che permettono di usufruire di tutte le altre funzioni del progetto;
- Package testFacebook : Presenta le classi con cui si possono effettuare test sulla Call e sulla media;

# INTERFACCE DI LOGIN E MENU'

![LOGINNNN](https://user-images.githubusercontent.com/67501051/87820660-c0832780-c86e-11ea-8e39-fa9e0a8e99a6.png)





# DATI:

AccessToken per il profilo di Lorenzo Toscanelli : EAAKdS6UMQ6QBAMb3oNDOmZA1n7e2ZAoAGkJcbmDfuKtKnIDX4C4gZBIsSmhaCbYOUUuG3PPSLovKG36tPeyAyiNyHuedicxd8DDlfKwUVZCny8crH27QYQ94tZAn0kZB4OarWnwim7QcZA9v9AXWX17gFqduUlmZCMIFgAfIsuZCZBcwZDZD

AccessToken per il profilo di Matteo Sonaglioni : EAAjCznvVZCs4BAM4ZCbEsJd4uDK5NPFZB7uSkAvNY1gbLJZC2RPpVurryf8o0q9z0T6CKKwEM7ts9ygO1hd40DZB4ft0dZAxsutBKQXhkxyYowHdtRWxFrvF0D0hAF1pzQKnI5dA0pNgmNQbHKbmZCNTZBviOPMU2yk4KJ6tzgDNPwZDZD


# NOTE:

Nella classe Call, sotto commenti, avevamo iniziato ad impostare l'idea di accedere alle menzioni di un post, ma senza risultati.

# AUTORI

Matteo Sonaglioni, Lorenzo Toscanelli
