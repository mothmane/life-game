# Life Game
---

Le jeu de la vie fut inventé par John Horton Conway en 1970, alors qu’il était professeur de mathématiques à l’université de Cambridge, au Royaume-Uni

[Lien WikiPedia ](https://fr.wikipedia.org/wiki/Jeu_de_la_vie)

Ce projet a été réalisé en utilisant l'approche TDD Baby Steps.  

## TDD 

Test Driven Developement , (Developpement piloté par les Tests) est une pratique de l’eXtreme Programming. 

Le cycle préconisé par le TDD comporte cinq étapes :


##### 1 identification et écriture de Tests

Après la compréhension du problème, de la fonctionnalité à développer, la première à se poser est : 

Quels sont les tests qui, s'ils sont verts, nous permettront de dire que notre solution au problème est valide ?

##### 2 vérification que les Tests une fois exécutés sont KO

En effet il faut s'assurer que les Tests ne sont pas Verts par défaut.
Ca parrait bête mais ça peut sauver des vies.

####  3 développement 

Le développement est précis et bien orienté, il consiste à développer le code permettant de passer les Tests. La motivation première est de voir du vert lors du passage des tests.

#### 4 validation des Tests

Après exécution des Tests : 

	- 	En cas de Vert absolu, passer à l’étape 4 
	- 	Sinon reprendre l'étape 3

#### 5 Amélioration du code 

Remanier le code , l'optimiser.
A chaque amélioration repasser les Tests pour s'assurer que nous sommes toujours en Vert.


## Development

	./mvn clean install


## Building for production :D


    ./mvn clean install
    
 