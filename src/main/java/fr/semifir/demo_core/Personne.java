package fr.semifir.demo_core;

public interface Personne {
    String getNom();

    void setNom(String nom);

    String getPrenom();

    void setPrenom(String prenom);

    @Override
    String toString();
}
