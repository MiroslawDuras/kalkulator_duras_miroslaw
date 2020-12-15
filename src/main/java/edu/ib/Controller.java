package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonClear;

    @FXML
    private Button buttonPlusMinus;

    @FXML
    private Button buttonPercent;

    @FXML
    private Button buttonSeven;

    @FXML
    private Button buttonEight;

    @FXML
    private Button buttonFive;

    @FXML
    private Button buttonNine;

    @FXML
    private Button buttonX;

    @FXML
    private Button buttonSix;

    @FXML
    private Button buttonPlus;

    @FXML
    private Button buttonthree;

    @FXML
    private Button buttontwo;

    @FXML
    private Button buttonFour;

    @FXML
    private Button buttonOne;

    @FXML
    private Button buttonMinus;

    @FXML
    private Button buttonDivide;

    @FXML
    private Button buttonPeriod;

    @FXML
    private Button buttonEqual;

    @FXML
    private Button buttonZero;

    @FXML
    private TextField screen;

    private int operation =0;
    private double savedNumberDivide =0;
    private double savedNumberPlus =0;
    private double savedNumberMinus =0;
    private double savedNumberX =0;
    private double savedNumberPercent =0;
    private double savedNumberPlusMinus =0;
    private double value =0;
    private double newNumber = 0;
    private int logsAddition=0;
    private int logsDivide=0;
    private int logsMinus=0;
    private int logsX=0;
    private double memory=0;
    private double newValue=0;


    private boolean isZeroFirst(){
        boolean a;
        if(screen.getText().equals("0")) {
            a=true;
        }
        else {
            a=false;
        }
        return a;
    }
    private boolean isWeirdCharFirst(){
        boolean a;
        if(screen.getText().equals("") || screen.getText().equals("-") || screen.getText().equals(".")) {
            a=true;
        }
        else {
            a=false;
        }
        return a;
    }

    @FXML
    void clearPressed(ActionEvent event) {

        screen.setText("");
        logsAddition=0;
        logsDivide=0;
        logsMinus=0;
        logsX=0;
        memory=0;
    }

    @FXML
    void dividePressed(ActionEvent event) {
        logsDivide++;
        if(isWeirdCharFirst()==false){
            if(logsDivide==1){
            savedNumberDivide = Double.parseDouble(screen.getText());
            operation = 1;
            screen.setText("");
        }
        else{
            newValue=Double.parseDouble(screen.getText());
            savedNumberDivide/=newValue;
                operation = 1;
            screen.setText("");
        }
        }
    }

    @FXML
    void eightPressed(ActionEvent event) {
        if(isZeroFirst() == false) {
            screen.setText(screen.getText() + "8");
        }

    }

    @FXML
    void equalPressed(ActionEvent event) {
        newNumber = Double.parseDouble(screen.getText());

        if(operation==1){
            value = (Double) savedNumberDivide / newNumber;
            screen.setText(String.valueOf(value));
        }
        else if(operation==2){
            value = (Double) savedNumberPlus + newNumber;
            screen.setText(String.valueOf(value));

        }
        else if(operation==3){
            value = (Double) savedNumberX * newNumber;
            screen.setText(String.valueOf(value));
        }
        else if(operation==4){
                value = (Double) savedNumberMinus - newNumber;
                screen.setText(String.valueOf(value));

        }
        else if(operation==5){
            value = (Double) savedNumberPercent/newNumber*100;
            screen.setText(String.valueOf(value));
        }

    }

    @FXML
    void fivePressed(ActionEvent event) {
        if(isZeroFirst() == false) {
            screen.setText(screen.getText() + "5");
        }
    }

    @FXML
    void fourPressed(ActionEvent event) {
        if(isZeroFirst() == false) {
            screen.setText(screen.getText() + "4");
        }
    }

    @FXML
    void minusPressed(ActionEvent event) {
        logsMinus++;
        if(screen.getText().equals("")){
            screen.setText("-");
        }
        else {
            if(logsMinus==1){
            savedNumberMinus = Double.parseDouble(screen.getText());
            operation = 4;
            screen.setText("");
        }
            else{
            newValue=Double.parseDouble(screen.getText());
            savedNumberMinus-=newValue;
                operation = 4;
            screen.setText("");
            }
        }
    }

    @FXML
    void ninePressed(ActionEvent event) {
        if(isZeroFirst() == false) {
            screen.setText(screen.getText() + "9");
        }
    }

    @FXML
    void onePressed(ActionEvent event) {
        if(isZeroFirst() == false) {
            screen.setText(screen.getText() + "1");
        }
    }

    @FXML
    void percentPressed(ActionEvent event) {
        if(screen.getText().equals("")){

        }
        else {
            savedNumberPercent = Double.parseDouble(screen.getText());
            operation = 5;
            screen.setText("");
        }

    }

    @FXML
    void periodPressed(ActionEvent event) {
        if(isWeirdCharFirst()==false){

           CharSequence screentext = screen.getText();
           if (String.valueOf(screentext).contains(".")) {

           }
           else {
               screen.setText(screen.getText() + ".");
           }
       }

    }

    @FXML
    void plusPressed(ActionEvent event) {
        logsAddition++;
        if(isWeirdCharFirst()==false){
            if(logsAddition==1) {
                savedNumberPlus = Double.parseDouble(screen.getText());
                operation = 2;
                screen.setText("");
            }
            else{
                newValue=Double.parseDouble(screen.getText());
                savedNumberPlus+=newValue;
                operation = 2;
                screen.setText("");
            }
        }
    }

    @FXML
    void plusminusPressed(ActionEvent event) {
        if(isWeirdCharFirst()==false){
            double actualNumber = Double.parseDouble(screen.getText());
            if (actualNumber > 0) {
                actualNumber = actualNumber-actualNumber-actualNumber;
                screen.setText(String.valueOf(actualNumber));
            } else if (actualNumber < 0) {
                actualNumber = actualNumber-actualNumber-actualNumber;
                screen.setText(String.valueOf(actualNumber));
            }
        }
    }

    @FXML
    void screenview(ActionEvent event) {

    }

    @FXML
    void sevenPressed(ActionEvent event) {
        if(isZeroFirst() == false) {
            screen.setText(screen.getText() + "7");
        }
    }

    @FXML
    void sixPressed(ActionEvent event) {
        if(isZeroFirst() == false) {
            screen.setText(screen.getText() + "6");
        }
    }

    @FXML
    void threePressed(ActionEvent event) {
        if(isZeroFirst() == false) {
            screen.setText(screen.getText() + "3");
        }

    }

    @FXML
    void twoPressed(ActionEvent event) {
        if(isZeroFirst() == false) {
            screen.setText(screen.getText() + "2");
        }
    }

    @FXML
    void xPressed(ActionEvent event) {
        logsX++;
        if (isWeirdCharFirst() == false) {
            if (logsX == 1) {
                savedNumberX = Double.parseDouble(screen.getText());
                operation = 3;
                screen.setText("");
            } else {
                newValue = Double.parseDouble(screen.getText());
                savedNumberX *= newValue;
                operation = 3;
                screen.setText("");
            }
        }
    }



    @FXML
    void zeroPressed(ActionEvent event) {
        if(isZeroFirst() == false) {
            screen.setText(screen.getText() + "0");
        }

    }

    @FXML
    void initialize() {
        assert buttonClear != null : "fx:id=\"buttonClear\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonPlusMinus != null : "fx:id=\"buttonPlusMinus\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonPercent != null : "fx:id=\"buttonPercent\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonSeven != null : "fx:id=\"buttonSeven\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonEight != null : "fx:id=\"buttonEight\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonFive != null : "fx:id=\"buttonFive\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonNine != null : "fx:id=\"buttonNine\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonX != null : "fx:id=\"buttonX\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonSix != null : "fx:id=\"buttonSix\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonPlus != null : "fx:id=\"buttonPlus\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonthree != null : "fx:id=\"buttonthree\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttontwo != null : "fx:id=\"buttontwo\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonFour != null : "fx:id=\"buttonFour\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonOne != null : "fx:id=\"buttonOne\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonMinus != null : "fx:id=\"buttonMinus\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonDivide != null : "fx:id=\"buttonDivide\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonPeriod != null : "fx:id=\"buttonPeriod\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonEqual != null : "fx:id=\"buttonEqual\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert buttonZero != null : "fx:id=\"buttonZero\" was not injected: check your FXML file 'kalkulator.fxml'.";
        assert screen != null : "fx:id=\"screen\" was not injected: check your FXML file 'kalkulator.fxml'.";

    }
}
