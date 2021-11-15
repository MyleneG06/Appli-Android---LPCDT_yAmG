# Appli-Android---LPCDT_yAmG
Projet fait par Yassine AJROUD et Mylène GERVAISE pour la Licence Pro CDTL-DAM 2021

# Description

Voici notre projet d'application **Android** en langage _Kotlin_ sur le thème du projet de croisière conçu en IHM.

1. Cloner le repository 
   ```sh
   git clone https://github.com/MyleneG06/Appli-Android---LPCDT_yAmG.git
   ```
2. Ouvrir dans _Android Studio_ en ouvrant un projet existant. 


<p align="center">
  <img src="https://user-images.githubusercontent.com/86916604/141783424-6f293a76-d23d-49d9-a491-35ad270c9c91.png" alt="visuel de Romanticruise" width="500" height="auto"/>
</p>



<details close>
  <summary>Table of Contents</summary>
  <ul>
    <li><a href="#accueil">Page d'accueil</a></li>
    <li><a href="#profile">Profile</a></li>
    <li><a href="#map">Map</a></li>
    <li><a href="#menu">Menu</a></li>   
    <li><a href="#contribution">Contribution</a></li>
    <li><a href="#convention">Convention de nommage</a></li>
  </ul>
</details>



## Accueil
Quand nous chargeons l'application Romanticruise, nous remarquons la personnalisation du thème par une couleur romantique. Nous arrivons sur la page principale au format  _Bottom Navigation Activity_. Il y a 3 items de navigation : profile, menu et carte.

### Profile 
La page **profile** permettra de personnaliser notre compte dans _détails_ ou changer la _langue_. Les fichiers de langues sont générés en anglais et français pour le moment. Il est également possible de se _déconnecter_. 
Ces fonctionnalités ne sont pas encore implémentées, il faut les plannifier dans la roadmap.

### Map
Le menu **map** permettra de rediriger l'utilisateur sur une carte avec ses coordonnées de géolocalisation. Pour le moment nous avons juste généré une alerte au format _toast_.

### Menu
Le **menu burger** permet de visualiser la liste des services disponibles à bord de la croisière. 


## Contribution
Les contributuions sur ce projet sont possibles et bienvenues à condition de se mettre en contact avec l'équipe au préalable. Voici les étapes à suivre :

1. Récupérer le projet ou faire un Pull
2. Créer une branche pour chaque fonctionnalité (`git checkout -b feature/AmazingFeature`)
3. Enregistrez vos modifications (`git commit -m 'Add some AmazingFeature'`)
4. Pousser dans la (`git push origin feature/AmazingFeature`)

## Convention
Pour les conventions de nommage, nous vous redirigieons vers la communauté Android qui préconnise le snake et camelCase.




