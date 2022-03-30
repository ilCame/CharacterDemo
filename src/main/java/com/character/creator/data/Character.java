package com.character.creator.data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Character {

    private String name;
    private String alignment;

    private Characteristics charCharacts = new Characteristics();
    private Set<Player> player = new HashSet<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getalignment(){
        return alignment;
    }

    public void setalignment(String alignment) {
        this.alignment = alignment;
    }

    public Characteristics getCharCharacts() {
        return charCharacts;
    }

    public void setCharCharacts(Characteristics charCharacts) {
        this.charCharacts = charCharacts;
    }

    public Set<Player> getPlayer() {
        return player;
    }

    public void setPlayer(Set<Player> player) {
        this.player = player;
    }
}
