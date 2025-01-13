package com.duellingwands.spells.model;


public class Spell {
    private Long id;
    private String name;
    private String description;
    private String type;
    private String affinity;
    private int difficulty;
    private int damage;

 // Constructors
    public Spell(Long id, String name, String description, String type, String affinity, int difficulty, int damage) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.affinity = affinity;
        this.difficulty = difficulty;
        this.damage = damage;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAffinity() {
        return affinity;
    }

    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}