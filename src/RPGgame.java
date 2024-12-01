import java.util.Scanner;

public class RPGgame {

private int coins = 0;
private boolean HasBoot1 = false;
private boolean HasBoot2 = false;
private boolean Dog = false;
private boolean Dragon = false;




    public void Shop(){
        System.out.println("1 : Boots50");
        System.out.println("2 : Boots100");
        System.out.println("3 : Dog");
        System.out.println("4 : Dragon");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input == 1){
            if(coins>=50){
                if(HasBoot1){
                    System.out.println("You  already have boots50!");
                }else{
                    System.out.println("You purchase boots50!");
                    HasBoot1 = true;

                }
            }else{
                System.out.println("not enough coins!");
            }
        }

        if(input == 2){
            if(coins>=100){
                if(HasBoot2){
                    System.out.println("You already have boots100!");
                }else{
                    System.out.println("You purchase boots100!");
                    HasBoot2 = true;
                }
            }else{
                System.out.println("not enough coins!");
            }
        }

        if(input== 3){
            if(coins>=50){
                if(Dog){
                    System.out.println("You already have dog!");
                }else{
                    System.out.println("You purchase dog!");
                    Dog = true;
                }
            }else{
                System.out.println("not enough coins!");
            }
        }

        if(input == 4){
            if(coins>=100){
                if(Dragon){
                    System.out.println("You already have dragon!");
                }else{
                    System.out.println("You purchase dragon!");
                    Dragon = true;
                }
            }else{
                System.out.println("not enough coins!");
            }

        }
        SecondState();
    }

    public void getCoins() {
        coins=coins+50;
    }



    public void SecondState(){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int input = 0;

        while(input != 3){
            System.out.println("1 : Shop   2 : Dungeons   3 : Exit");
            input = sc.nextInt();

            if(input == 1){
                Shop();
            }
            else if(input == 2){
                if(!main.IsDead()){
                    getCoins();
                    System.out.println("Level = " + main.Character.RecentLevel() + " coins = " + coins);
                } else {
                    System.out.println("Character is dead, cannot enter dungeons.");
                }
            }
            else if(input == 3){
                End();
            }
            else {
                System.out.println("Invalid option. Please choose again.");
            }
        }
    }







    public void End(){
            System.out.println("You Have");
            if(HasBoot1){
                System.out.println("Boot50");
            }
            if(HasBoot2){
                System.out.println("Boot100");
            }
            if(Dog){
                System.out.println("Dog");
            }
            if(Dragon){
                System.out.println("Dragon");
            }
            if(!HasBoot1&&!HasBoot2&&!Dog&&!Dragon){
                System.out.println("Nothing!!!");
            }
        }

    }


