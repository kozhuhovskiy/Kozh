package BattleShipGame;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){

        DotCom one = new DotCom();
        one.setName("vk.com");
        DotCom two = new DotCom();
        two.setName("twitter.com");
        DotCom three = new DotCom();
        three.setName("eBay.com");
        /*DotCom four = new DotCom();
        four.setName("facebook.com");*/

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        /*dotComsList.add(four);*/

        System.out.println("Ваша цель - уничтожить три корабля(сайта)");
        System.out.println("vk.com, twitter.com, facebook.com ,eBay.com ");
        System.out.println("Корабли размещены на 7 клетках, начиная от 0 и заканичая 6");
        System.out.println("Координаты: 'a', 'b', 'c', 'd', 'e', 'f', 'g'. " );
        System.out.println("Сделайте выстрел, например 'а2'");
        System.out.println("Попытайтесь уничтожить их за минимальное количство ходов");

        for (DotCom dotComToSet: dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while (!dotComsList.isEmpty()){
            String usersGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(usersGuess);
        }
        finishGame();
    }
    private void checkUserGuess (String userGuess) {
        numOfGuesses++;
        String result = "Мимо";

        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")) {
                break;

            }
            if (result.equals("Потопил")) {
                dotComsList.remove(dotComToTest);
                break;

            }
            System.out.println(result);
        }
    }
    private  void finishGame(){

        System.out.println("Все сайты уничтожены! Вы сможете создать новые социальные сети");

        if (numOfGuesses <= 18) {
            System.out.println("Вы уничтожили корабли за: " + numOfGuesses + "попыток");
            System.out.println("Возможно вы профессиональный хакер!");

        }
        else {
            System.out.println("Вы долго уничтожали корабли, это заняло: " + numOfGuesses + "попыток");
            System.out.println("Профессионалы уничтожают корабли меньше чем за 13 попыток");
        }
    }
    public static void main (String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}

