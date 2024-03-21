package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        // healthPercentage 100'den büyükse 100'e eşitleniyor
        this.healthPercentage = Math.min(healthPercentage, 100);
        // healthPercentage 0'dan küçükse 0'a eşitleniyor
        this.healthPercentage = Math.max(this.healthPercentage, 0);
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        // Oyuncunun canı 0'ın altına düşerse ekrana mesaj basılıyor
        if (healthPercentage <= 0) {
            System.out.println(name + " player has been knocked out of game");
            healthPercentage = 0; // Canı 0'dan küçük olmasın diye kontrol ekleniyor
        }
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        // Oyuncunun canı 100'den fazla olursa 100'e eşitleniyor
        healthPercentage = Math.min(healthPercentage, 100);
    }
}
