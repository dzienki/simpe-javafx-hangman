package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

import java.util.Arrays;

public class Controller {
    public Label text;
    public Button buttonA;
    public Button buttonB;
    public Button buttonC;
    public Button buttonD;
    public Button buttonE;
    public Button buttonF;
    public Button buttonZ;
    public Button buttonY;
    public Button buttonX;
    public Button buttonW;
    public Button buttonV;
    public Button buttonU;
    public Button buttonT;
    public Button buttonS;
    public Button buttonR;
    public Button buttonP;
    public Button buttonO;
    public Button buttonN;
    public Button buttonM;
    public Button buttonL;
    public Button buttonG;
    public Button buttonH;
    public Button buttonI;
    public Button buttonJ;
    public Button buttonK;
    public Line line1;
    public CubicCurve line3;
    public Line line2;
    public Ellipse belly;
    public Line line4;
    public Line line5;
    public Line line6;
    public Line line7;
    public Circle head;
    public Label points;
    Hangman game=new Hangman();
    //text.setText(game.getNowGuessing());
    //guess.setText(game.playerGuessing);
    public void updateImg(){
        switch (game.getMistakes()){
            case 7:
                line6.setVisible(true);
                line7.setVisible(true);
            case 6:
                line5.setVisible(true);
            case 5:
                line4.setVisible(true);
            case 4:
                line3.setVisible(true);
            case 3:
                line1.setVisible(true);
                line2.setVisible(true);
            case 2:
                belly.setVisible(true);
            case 1:
                head.setVisible(true);
                break;
            case 0:
                break;
            default:
                    line1.setVisible(false);
                    line3.setVisible(false);
                    line2.setVisible(false);
                    belly.setVisible(false);
                    line4.setVisible(false);
                    line5.setVisible(false);
                    line6.setVisible(false);
                    line7.setVisible(false);
                    head.setVisible(false);
                    activateButtons(true);

        }
    }
    public void updateTxt(){
        String tmp=new String(game.getPlayerGuessing());
        text.setText(tmp);
        points.setText("Points: "+game.getPoints());
        updateImg();
    }
    public void testButton(ActionEvent event){
        game.initGame();
        activateButtons(false);
        String tmp=new String(game.getPlayerGuessing());
        text.setText(tmp);
    }
    public void guessA(ActionEvent event){
        game.guessChar('a');
        updateTxt();
        buttonA.setDisable(true);
    }
    public void guessB(ActionEvent event){
        game.guessChar('b');
        updateTxt();
        buttonB.setDisable(true);
    }
    public void guessC(ActionEvent event){
        game.guessChar('c');
        updateTxt();
        buttonC.setDisable(true);
    }
    public void guessD(ActionEvent event){
        game.guessChar('d');
        updateTxt();
        buttonD.setDisable(true);
    }
    public void guessE(ActionEvent event){
        game.guessChar('e');
        updateTxt();
        buttonE.setDisable(true);
    }
    public void guessF(ActionEvent event){
        game.guessChar('f');
        updateTxt();
        buttonF.setDisable(true);
    }
    public void guessG(ActionEvent event){
        game.guessChar('g');
        updateTxt();
        buttonG.setDisable(true);
    }
    public void guessH(ActionEvent event){
        game.guessChar('h');
        updateTxt();
        buttonH.setDisable(true);
    }
    public void guessI(ActionEvent event){
        game.guessChar('i');
        updateTxt();
        buttonI.setDisable(true);
    }
    public void guessJ(ActionEvent event){
        game.guessChar('j');
        updateTxt();
        buttonJ.setDisable(true);
    }
    public void guessK(ActionEvent event){
        game.guessChar('k');
        updateTxt();
        buttonK.setDisable(true);
    }
    public void guessL(ActionEvent event){
        game.guessChar('l');
        updateTxt();
        buttonL.setDisable(true);
    }
    public void guessM(ActionEvent event){
        game.guessChar('m');
        updateTxt();
        buttonM.setDisable(true);
    }
    public void guessN(ActionEvent event){
        game.guessChar('n');
        updateTxt();
        buttonN.setDisable(true);
    }
    public void guessO(ActionEvent event){
        game.guessChar('q');
        updateTxt();
        buttonO.setDisable(true);
    }
    public void guessP(ActionEvent event){
        game.guessChar('p');
        updateTxt();
        buttonP.setDisable(true);
    }
    public void guessR(ActionEvent event){
        game.guessChar('r');
        updateTxt();
        buttonR.setDisable(true);
    }
    public void guessS(ActionEvent event){
        game.guessChar('s');
        updateTxt();
        buttonS.setDisable(true);
    }
    public void guessT(ActionEvent event){
        game.guessChar('t');
        updateTxt();
        buttonT.setDisable(true);
    }
    public void guessU(ActionEvent event){
        game.guessChar('u');
        updateTxt();
        buttonU.setDisable(true);
    }
    public void guessV(ActionEvent event){
        game.guessChar('v');
        updateTxt();
        buttonV.setDisable(true);
    }
    public void guessY(ActionEvent event){
        game.guessChar('y');
        updateTxt();
        buttonY.setDisable(true);
    }
    public void guessX(ActionEvent event){
        game.guessChar('x');
        updateTxt();
        buttonX.setDisable(true);
    }
    public void guessZ(ActionEvent event){
        game.guessChar('z');
        updateTxt();
        buttonZ.setDisable(true);
    }
    public void guessW(ActionEvent event){
        game.guessChar('w');
        updateTxt();
        buttonW.setDisable(true);
    }
    public void activateButtons(boolean state){
        buttonA.setDisable(state);
        buttonB.setDisable(state);
        buttonC.setDisable(state);
        buttonD.setDisable(state);
        buttonE.setDisable(state);
        buttonF.setDisable(state);
        buttonZ.setDisable(state);
        buttonY.setDisable(state);
        buttonX.setDisable(state);
        buttonW.setDisable(state);
        buttonV.setDisable(state);
        buttonU.setDisable(state);
        buttonT.setDisable(state);
        buttonS.setDisable(state);
        buttonR.setDisable(state);
        buttonP.setDisable(state);
        buttonO.setDisable(state);
        buttonN.setDisable(state);
        buttonM.setDisable(state);
        buttonL.setDisable(state);
        buttonG.setDisable(state);
        buttonH.setDisable(state);
        buttonI.setDisable(state);
        buttonJ.setDisable(state);
        buttonK.setDisable(state);
    }
}
