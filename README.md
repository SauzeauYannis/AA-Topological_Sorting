# AA-Topological_Sorting

##### Table of Contents
* [Français](#fr)
  * [Présentation](#fr_pr)
  * [Utilisation](#fr_ut)
  * [Compétences acquises](#fr_cp)
  * [Résultat](#fr_rs)
* [English](#en)
  * [Presentation](#en_pr)
  * [Use](#en_u)
  * [Skills acquired](#en_sk)
  * [Result](#en_rs)

<a name="fr"/>

## Français

<a name="fr_pr"/>

### Présentation

Ce projet a été effectué en quatrième année du [CMI Informatique](http://formations.univ-poitiers.fr/fr/index/autre-diplome-niveau-master-AM/autre-diplome-niveau-master-AM/cmi-informatique-JD2XQGVY.html) à l'[UFR SFA Université de Poitiers](https://sfa.univ-poitiers.fr/) dans le cadre de l'enseignement [Algorithmique avancée](https://formations.univ-poitiers.fr/fr/index/autre-diplome-niveau-master-AM/autre-diplome-niveau-master-AM/cmi-informatique-JD2XQGVY/cmi-parcours-conception-logicielle-K56KZ5KL/specialite-s7-JPEIFH2K/algorithmique-avancee-JAJEH5DW.html).

Ce projet a été développé en monôme avec [Visual Studio Code](https://code.visualstudio.com/).

<a name="fr_ut"/>

### Utilisation

Pour compiler le projet, vous pouvez utiliser le [Makefile](https://github.com/SauzeauYannis/TLC-Projet/blob/main/Makefile).

La commande `make help` permet de voir les différentes commandes possibles.

Pour tester un des graphes du dossier graph, vous devez saisir la commande `make test<n>` avec n le numéro du graphe que vous voulez tester, par exemple pour tester le graphe graph/graph104.alists il suffit de faire `make test4`.
  
Pour tester un graphe aléatoire de 100 sommets avec une probabilité de 0.3 d’existence d’arc il faut utiliser la commande `make testRandom`.

Enfin pour tout tester, exécutez la commande `make testAll`.

<a name="fr_cp"/>

### Compétences acquises

* Choisir ou spécifier un type de données abstrait pour résoudre un problème particulier
* Implémenter des types de données abstraits à partir de structures de données classiques
* Utiliser les graphes pour modéliser des problèmes combinatoires ou d'optimisation
* Appliquer des algorithmes classiques en dehors de leur contexte habituel

<a name="fr_rs"/>

### Résultat

Nous avons obtenu la note de ?/20. (Résultat en mars)

<a name="en"/>

## English

<a name="en_pr"/>

### Presentation

This project was done in the fourth year of the [CMI Informatique](http://formations.univ-poitiers.fr/fr/index/autre-diplome-niveau-master-AM/autre-diplome-niveau-master-AM/cmi-informatique-JD2XQGVY.html) at the [UFR SFA Université de Poitiers](https://sfa.univ-poitiers.fr/) as part of the [Advanced Algorithmics](https://formations.univ-poitiers.fr/fr/index/autre-diplome-niveau-master-AM/autre-diplome-niveau-master-AM/cmi-informatique-JD2XQGVY/cmi-parcours-conception-logicielle-K56KZ5KL/specialite-s7-JPEIFH2K/algorithmique-avancee-JAJEH5DW.html) course.

This project was developed in monome with [Visual Studio Code](https://code.visualstudio.com/).

<a name="en_u"/>

### Use


To compile the project, you can use the [Makefile](https://github.com/SauzeauYannis/TLC-Projet/blob/main/Makefile).

The command `make help` allows you to see the different possible commands.

To test one of the graphs in the graph folder, you need to enter the command `make test<n>` with n the number of the graph you want to test, e.g. to test the graph/graph104.alists just do `make test4`.
  
To test a random graph of 100 vertices with a probability of 0.3 of arc existence you have to use the command `make testRandom`.

Finally, to test everything, run the command `make testAll`.

<a name="en_sk"/>

### Skills acquired

* Choose or specify an abstract data type to solve a particular problem
* Implement abstract data types from classical data structures
* Use graphs to model combinatorial or optimization problems
* Apply classical algorithms outside their usual context
  
<a name="en_rs"/>

### Result

We obtained a score of ?/20. (Result in March)
