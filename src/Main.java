import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    RPGgame game = new RPGgame();
    SwordMan Character = new SwordMan();


    public boolean IsDead(){
        if(Character.Dodge()>10){
            Character.levelUp();
        return false;

        }else{
            return true;

        }
    }



    public static void main(String[] args) {

        RPGgame game = new RPGgame();
        game.SecondState();

    }
}