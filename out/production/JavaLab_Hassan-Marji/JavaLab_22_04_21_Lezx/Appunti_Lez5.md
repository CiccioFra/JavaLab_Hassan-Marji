## `JavaLab lezX del 21 Aprile 2022`
- guardie ed intercettatori di Angular
- sor procidius
- - su Git di Hasa -> demo -> .. -> entities -> Studente.java
- - in repository/StudenteRepository.java -> riga 22 {CALL seleziona_studenti(?, ?,..)} // è nel DB // ?parametri segnaPosto
- - demo/file/stored_procedure -> qualcosa.java
lomboc per evitare di scrivere get e set
- - 1) integrare la libreria mysql -> project Structure su intelliJ -> Libraries-> primo + -> mysql -> ricerca -> ..
- - 2) application.properties -> server.port=8081
- - 3) sudduivisione in cartelle
- - 4) creato il DB) - - USE studente;     DROP TABLE studente;
- - - 4a) CREATE TABLE studenti(
    ID int AUTO_INCREMENT PRIMARY KEY,
    NOME VARCHAR(30) NOT NULL,
    COGNOME VARCHAR(50) NOT NULL,
    INDIRIZZO VARCHAR(50) NOT NULL  );
- - - 4b) INSERT INTO `studenti` (`ID`, `NOME`, `COGNOME`, `INDIRIZZO`) VALUES (NULL, 'Ciccio', 'Franchi', 'via roma'), (NULL, 'Pippo', 'Cane', 'via Albertini');
- - 5) SI PARTE DAI MODEL 
- - - 5a) classe Studente
- - - creare package repository
- - - in repository -> StudenteRepository.java .... -> stabiliamo la connessione nel try
- - 6) in controller -> StudenteController.java -> nella classe...
- - //controller si interfaccia con Repository, che interroga DB
---
# Come connettere Angular
## `JPA` - non si usano comandi SQL (come es. create table)

la mette nel pom 

cors sono richieste front-end per abilitare 

come funzioinano i progetti spring
- creo tutti i package: controller, exception, entities, repository, service.
- `partiamo da entities` -> Libro.java
- - @entity specifica che questa classe è un model  sono annotazioni lovbok
- - @Table
- per ogni entità bisogna fare -> implement Serializable 
- - @Id  decoratore-annotation
- - @Column
- - @ManyToOne  // come costruire le relazioni
- - - problema: togliere l'annotazione DATA, loboc da problemi
- - generiamo getter e setter
- `altra entity` -> Autore.java
- - come sopra
- - @OneToMany  // come costruire le relazioni //l'azione dominante è di solito dal lato one, il fetch è come ottiene i dati, orphan.. rimuove i nodi orfani
- - - OneToMany non prevere get e set
- in ogni entità creo una repository-interfaccia che estende un generico JpaRepository<Autore, Long> (è la classe che serve per colledarsi al db per operazioni crud,  il primo parametro è la classe con cui lavoro, il secondo parametro è l'identificativo della classe)
- - 
- nel controller: AutoreController
- - @CrossOrigin -> accetta le richieste che arrivano dall'indirizzo 4200, che è quello predefinito di Angular
- in service -> AutoreService (interface)   // delega la classe che creo per implementare l'interfaccia
- service/impl -> AutoreServiceImpl (è la classe che comunica con repository)
- - ogni servizio deve avere la notazione @Service
- - creo l'istanza per lavora col DB
- - - riga 25 fa lui la creazione della query SELECT
- ultimamo la costruzione del controller -> il controller lo devo interfacciare col service, che si interfaccia con... che comunica col DB
- - differenza risp a prima in @GetMapping ... 
- - - qui si lavora con le chiamate http (il return)

## `Creiamo progettino Angular`
- creo component
- app-routring.modules.ts -> aggiungo path in Rout [..qui..]
- creo class (classe) in models/autore
---
- prima importare in app.module.te il modulo HttpClientModule
- modif autore.service.ts   è il codice che collega Angular a Spring, implemento la connessione
- home.component.ts (usa Respons Sentity posso tornare l'errore http generato e stamparlo a consol)
