# Meeting Room Management API

## Description
Ce projet vise à créer une API pour la gestion des salles de réunion d'une PME. Cette solution est particulièrement nécessaire en raison des restrictions dues au COVID-19, rendant la gestion des salles plus complexe. Le projet est développé en Java et se conforme aux spécifications suivantes.

## Fonctionnalités
- Création statique des salles réparties sur trois sites, avec quatre salles par site.
- La base de données nommée `gestiondb` est créée lors du premier lancement du projet, incluant les données des tables `salle` et `room`.
- Les salles sont rangées dans un tableau et le mapping `roomList` permet de voir toutes les salles disponibles.
- Possibilité de réserver une salle via un bouton de réservation menant à la page de réservation.
- Si une salle ne répond à aucun des critères des quatre types de conférence, la vue de réservation n'envoie pas le formulaire mais affiche un message d'alerte.
- Le formulaire de réservation demande la capacité, qui doit être de minimum 1 et de maximum 70% de la capacité initiale de la salle en raison des restrictions COVID.
- Le champ de type de réunion (`meeting type`) est ajusté selon les critères requis pour chaque type de conférence.
- Le champ de jour, initialement désactivé, devient activé une fois le type de réunion sélectionné. Il est impossible de choisir les weekends ou une date passée.
- L'heure de réservation doit être choisie selon les disponibilités, en prenant en compte l'heure de nettoyage pour désinfecter la salle avant la prochaine utilisation.
- JavaScript est utilisé pour communiquer avec Thymeleaf, offrant ainsi une expérience utilisateur plus fluide.
