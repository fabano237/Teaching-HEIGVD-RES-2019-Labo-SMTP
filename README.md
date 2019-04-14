
Fabrice Mbassi

14.04.2019

Objectif du Laboratoire:
Implementer une application ClientSmtp qui envois à un groupe 
de personnes des blagues par eamil. Un des membres du groupe est celui
qui servira d'expediteur et les autres victimes seront les destinataires.

Principe de fonctionnement:

lorsqu'on lance l'application celui ci parcour les fichiers de configurations
à savoir:

*Config.properties: il contient le nombre de groupe, le numero de port utiliser pour
communication client/serveur, l'adress du serveur local et l'eamil de la personne 
qui envois les messages au groupes.

*victims.utf8: qui contient les informations sur les adresse mail des victimes.



Realisation:

l'application client utilise l'API socket pour la connexion au serveur SMTP.
Nous avons choisi d'utiliser la lecture des bytes et des buffer Input/ouput dans des fichiers.
 Aux niveau des responsabilités des classes nous avons les classes:
 - configurationManager donc la responsabilité est de parcurrir le fichier de configuration Config.properties
 - Personne: donc la responsabilité est de definir les information sur une personne nom prenom email.
 - Group: donc la responsabilité est definir une structure de donnée dans la quelle on stock des personnes d'un groupe.
 - Prank: donc la responsabilité est de definir les différentes rubriques d'un email qui sera envoyé à une victime.
 - PrankGenerator: genère des prank pour les groupes définis de façon aléatoire.
 - SmtpClient: donc la responsabilité est de gérer l'aspect communication client serveur à travers l'API socket.
 
 
 Test Pratique:
 
 Au depart nous avons utilisé l'utilitaire telnet et le langage propre à smtp protocol pour envoyer des email factif au personnes qu'on voulait.
 Puis après avoir dévelloper notre application client nous avons voulu simuler le même sénario et pour cela nous avon s du utilisé l'un des simulateur
 des serveur smtp connu à savoir MockMock qui écoute sur le port 8282 de son interface web. nous utilisons donc l'adresse de notre dockeur pour se connecter 
 et nous écoutons sur ce numéro de port. notre client lui communique sur le port 2525.