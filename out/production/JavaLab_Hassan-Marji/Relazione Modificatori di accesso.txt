Modificatori di accesso incontrati
    -   Public  -> rende la classe/metodo/attributo accessibile/valorizzabile
            da qualunque classe/metodo, anche se esterne al package del progetto (caso di import);
            la valorizzazione delle variabili può avvenire per parametro dell'oggetto (al momento dell'istanza della classe),
            per parametro di un metodo ( oggetto.metodo(parametro); )
            e per assegnamento (oggetto.proprieta = "Ciccio";) anche successivamente all'istanza;
            Se la classe istanziata è priva di costruttore, la valorizzazione dei/l parametro/i
            persiste nelle successive istanze della classe, e cmq sinchè il programma è in runtime.

    -   Private  -> rende il metodo/attributo accessibile/valorizzabile
            solo dai metodi interni alla classe in cui sono stati dichiarati,
            la valorizzazione delle variabili, al momento dell'istanza,
            o successivamente come parametro di un metodo ( oggetto.metodo(parametro); )
            è limitata all'oggetto. la classe genitrice deve avere un costruttore per permettere ciò,
            ed anche dichiarati i metodi get e set.

    esistono anche (più per mia memoria)
    -   Protected  ->    rende il metodo/attributo accessibile/valorizzabile come se fosse public
            solo dalle classi interni al package, e dalle classi che estendono la genitrice

    -   Default ->  rende il metodo/attributo accessibile/valorizzabile come se fosse public
            solo dalle classi interni al package

domande:
-   modificatori di accesso di Classi
-   la classe estesa (non astratta) si chiama "base" come in C# ?
-   cosa sono le SuperClassi? le classi estese.. specifiche?
-   ho un pò di confusione nel confronto tra classi estese e classi importate
