package BaiTapVeNha.Baitap22_10;
import java.util.*;

abstract class Character {
    protected String name;
    protected int hp;
    protected int baseDamage;

    public Character(String name, int hp, int baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getBaseDamage() { return baseDamage; }

    public abstract void attack();
}

interface Ranged {
    void rangedAttack();
}

interface SpellCaster {
    void castSpell();
}

class Warrior extends Character {
    public Warrior(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        System.out.println(name + " (Warrior) attacks with a sword!");
    }
}

class Archer extends Character implements Ranged {
    public Archer(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        rangedAttack();
    }

    @Override
    public void rangedAttack() {
        System.out.println(name + " (Archer) shoots an arrow!");
    }
}

class Mage extends Character implements SpellCaster {
    public Mage(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        castSpell();
    }

    @Override
    public void castSpell() {
        System.out.println(name + " (Mage) casts a fireball!");
    }
}

class ArcaneArcher extends Character implements Ranged, SpellCaster {
    public ArcaneArcher(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        rangedAttack();
    }

    @Override
    public void rangedAttack() {
        System.out.println(name + " (ArcaneArcher) shoots an arrow!");
    }

    @Override
    public void castSpell() {
        System.out.println(name + " also casts a magic spell!");
    }
}

public class SimpleRPG {
    public static void main(String[] args) {
        List<Character> party = new ArrayList<>();
        party.add(new Warrior("Arthur", 150, 20));
        party.add(new Archer("Legolas", 100, 15));
        party.add(new Mage("Gandalf", 80, 25));
        party.add(new ArcaneArcher("Sylvanas", 90, 18));

        for (Character c : party) {
            c.attack();
            if (c instanceof Ranged && c instanceof SpellCaster) {
                ((SpellCaster) c).castSpell();
            }
        }
    }
}
