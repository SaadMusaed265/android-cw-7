package com.example.cw7;

private class pokemon {
    private string name;
    private   int image ;
    private int attack ;
    private int defence;
    private int total;

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
    public pokemon(string name, int image, int attack, int defence, int total) {
        this.name = name;
        this.image = image;
        this.attack = attack;
        this.defence = defence;
        this.total = total;
    }

