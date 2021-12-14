package fr.semifir.demo_core;

import org.springframework.stereotype.Component;

@Component
public class Administrateur implements Personne{
    @Override
    public String getNom() {
        return null;
    }

    @Override
    public void setNom(String nom) {

    }

    @Override
    public String getPrenom() {
        return null;
    }

    @Override
    public void setPrenom(String prenom) {

    }
}
