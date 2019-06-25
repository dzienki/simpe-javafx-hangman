package sample;

import java.util.Arrays;
import java.util.Random;

public class Hangman {
    StringHandler strings=new StringHandler();
    char[] nowGuessing, playerGuessing;
    String word;
    Random rand=new Random();
    int points=0;

    int mistakes=0;

    Hangman(){
        initGame();
    }
    void initGame(){
        mistakes=0;
        int random=rand.nextInt(strings.getListSize());
        word=strings.getList().get(random);
        strings.getList().remove(random);
        nowGuessing=word.toCharArray();
        playerGuessing=new char[word.length()];
        for(int i=0;i<nowGuessing.length;i++){
            if(nowGuessing[i]==' ') playerGuessing[i]=' ';
            else playerGuessing[i]='_';
        }
        System.out.println(nowGuessing);
        System.out.println(playerGuessing);
    };
    void guessChar(char ch){
        if(contains(nowGuessing,ch)){
            System.out.println("zawiera");
            for(int i=0;i<playerGuessing.length;i++){
               if(nowGuessing[i]==ch) playerGuessing[i]=ch;
            }
        }
        else {
            mistakes++;
            System.out.println("pudło");
        }
        if(mistakes>7){
            playerGuessing=new char[8];
            playerGuessing="You LOSE".toCharArray();
        }
        else if(!contains(playerGuessing,'_')){
            points++;
            playerGuessing=new char[7];
            playerGuessing="You Win".toCharArray();
        }
    }
    public static boolean contains(final char[] array, final int v) {

        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }
    private void nextWord(){
        initGame();
        points++;
    }
    public char[] getNowGuessing() {
        return nowGuessing;
    }
    public char[] getPlayerGuessing(){
        return playerGuessing;
    }
    public int getPoints() {
        return points;
    }
    public int getMistakes() {
        return mistakes;
    }
}
