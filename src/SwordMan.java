public class SwordMan {
    private int level = 1;
    private int baseHP = 100;
    private int BaseRunSpeed = 300;
    private int Damage = 15; // Base damage for the sword

    public int RecentLevel() {
        return level;
    }



    public int MaxHp() {
        return baseHP + 10 * level;
    }



    public int MaxDamage( ) {
        return Damage + 10 * level;
    }

    public int Dodge() {
        return BaseRunSpeed/50 + MaxHp()/8;
    }

    public void levelUp() {
            level++;
        }
    }
