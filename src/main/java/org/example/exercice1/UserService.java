package org.example.exercice1;

class UserService {
    public void save(String name, String email) {
        System.out.println(String.format(
                "Enregistrement de l'utilisateur %s et son email %s dans la BDD", name, email));
    }
}
