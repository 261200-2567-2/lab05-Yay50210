public class Archer {

        private int level = 1;
        private int baseHP = 80;

        private int Damage = 12; // Base damage for the sword

        private int BaseRunSpeed = 375;
        public int Exp =0;




        public int MaxHp() {
            return baseHP+10*level;
        }



        public int MaxDamage() {
            return Damage+10*level;
        }

    public int Dodge() {
        return BaseRunSpeed/50;
    }

    public void levelUp() {
        if(Exp>=100){
            Exp-=100;
            level++;
        }
    }


    }

