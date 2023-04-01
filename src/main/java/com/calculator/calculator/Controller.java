package com.calculator.calculator;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    public Label display;
    public Button equalsBtn;
    private String result = "";
    private String firstOperand = "";
    private String secondOperand = "";
    private String operationType = "";
    private boolean firstInput = true;
    private SimpleStringProperty labela;
    public Controller() {
        labela = new SimpleStringProperty("0");
    }

    public SimpleStringProperty labelaProperty() {
        return labela;
    }
    public String getLabela() {
        return labela.get();
    }

    @FXML
    public void initialize() {
        display.getStyleClass().add("brojIspravan");
        equalsBtn.getStyleClass().add("unosNijeIspravan");
        display.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String o, String n) {
                if (labela.get().codePoints().filter(ch -> ch == '.').count()>1) {
                    display.getStyleClass().removeAll("brojIspravan");
                    display.getStyleClass().add("brojNijeIspravan");
                }
            }
        });
    }

    public void operationSetup(String operation) {
        operationType = operation;
    }

    public void divAction(ActionEvent actionEvent) {
        operationSetup("/");
        if(!result.equals("")){
            firstOperand = result;
        }
        labela.set(firstOperand);
    }

    public void modAction(ActionEvent actionEvent) {
        operationSetup("%");
        if(!result.equals("")){
            firstOperand = result;
        }
        labela.set(firstOperand);
    }

    public void subAction(ActionEvent actionEvent) {
        operationSetup("-");
        if(!result.equals("")){
            firstOperand = result;
        }
        labela.set(firstOperand);
    }

    public void mulAction(ActionEvent actionEvent) {
        operationSetup("*");
        if(!result.equals("")){
            firstOperand = result;
        }
        labela.set(firstOperand);
    }

    public void addAction(ActionEvent actionEvent) {
        operationSetup("+");
        if(!result.equals("")){
            firstOperand = result;
        }
        labela.set(firstOperand);
    }

    public void sevenClick(ActionEvent actionEvent) {
        if(operationType.equals("") && firstInput){
            if(firstOperand.equals("") || (firstOperand.charAt(0) == '0' && firstOperand.length() == 1)) {
                firstOperand = "7";
            }
            else {
                firstOperand += "7";
            }
            labela.set(firstOperand);

        } else {
            if(secondOperand.equals("") || (secondOperand.charAt(0) == '0' && secondOperand.length() == 1)) {
                secondOperand = "7";
            }
            else {
                secondOperand += "7";
            }
            labela.set(secondOperand);
            equalsBtn.getStyleClass().removeAll("unosNijeIspravan");
            equalsBtn.getStyleClass().add("unosIspravan");
        }
    }

    public void eightClick(ActionEvent actionEvent) {
        if(operationType.equals("") && firstInput){
            if(firstOperand.equals("") || (firstOperand.charAt(0) == '0' && firstOperand.length() == 1)) {
                firstOperand = "8";
            }
            else {
                firstOperand += "8";
            }
            labela.set(firstOperand);
        } else {
            if(secondOperand.equals("") || (secondOperand.charAt(0) == '0' && secondOperand.length() == 1)) {
                secondOperand = "8";
            }
            else {
                secondOperand += "8";
            }
            labela.set(secondOperand);
            equalsBtn.getStyleClass().removeAll("unosNijeIspravan");
            equalsBtn.getStyleClass().add("unosIspravan");
        }
    }

    public void nineClick(ActionEvent actionEvent) {
        if(operationType.equals("") && firstInput){
            if(firstOperand.equals("") || (firstOperand.charAt(0) == '0' && firstOperand.length() == 1)) {
                firstOperand = "9";
            }
            else {
                firstOperand += "9";
            }
            labela.set(firstOperand);
        } else {
            if(secondOperand.equals("") || (secondOperand.charAt(0) == '0' && secondOperand.length() == 1)) {
                secondOperand = "9";
            }
            else {
                secondOperand += "9";
            }
            labela.set(secondOperand);
            equalsBtn.getStyleClass().removeAll("unosNijeIspravan");
            equalsBtn.getStyleClass().add("unosIspravan");
        }
    }

    public void fourClick(ActionEvent actionEvent) {
        if(operationType.equals("") && firstInput){
            if(firstOperand.equals("") || (firstOperand.charAt(0) == '0' && firstOperand.length() == 1)) {
                firstOperand = "4";
            }
            else {
                firstOperand += "4";
            }
            labela.set(firstOperand);
        } else {
            if(secondOperand.equals("") || (secondOperand.charAt(0) == '0' && secondOperand.length() == 1)) {
                secondOperand = "4";
            }
            else {
                secondOperand += "4";
            }
            labela.set(secondOperand);
            equalsBtn.getStyleClass().removeAll("unosNijeIspravan");
            equalsBtn.getStyleClass().add("unosIspravan");
        }
    }

    public void fiveClick(ActionEvent actionEvent) {
        if(operationType.equals("") && firstInput){
            if(firstOperand.equals("") || (firstOperand.charAt(0) == '0' && firstOperand.length() == 1)) {
                firstOperand = "5";
            }
            else {
                firstOperand += "5";
            }
            labela.set(firstOperand);
        } else {
            if(secondOperand.equals("") || (secondOperand.charAt(0) == '0' && secondOperand.length() == 1)) {
                secondOperand = "5";
            }
            else {
                secondOperand += "5";
            }
            labela.set(secondOperand);
            equalsBtn.getStyleClass().removeAll("unosNijeIspravan");
            equalsBtn.getStyleClass().add("unosIspravan");
        }
    }

    public void sixClick(ActionEvent actionEvent) {
        if(operationType.equals("") && firstInput){
            if(firstOperand.equals("") || (firstOperand.charAt(0) == '0' && firstOperand.length() == 1)) {
                firstOperand = "6";
            }
            else {
                firstOperand += "6";
            }
            labela.set(firstOperand);
        } else {
            if(secondOperand.equals("") || (secondOperand.charAt(0) == '0' && secondOperand.length() == 1)) {
                secondOperand = "6";
            }
            else {
                secondOperand += "6";
            }
            labela.set(secondOperand);
            equalsBtn.getStyleClass().removeAll("unosNijeIspravan");
            equalsBtn.getStyleClass().add("unosIspravan");
        }
    }

    public void twoClick(ActionEvent actionEvent) {
        if(operationType.equals("") && firstInput){
            if(firstOperand.equals("") || (firstOperand.charAt(0) == '0' && firstOperand.length() == 1)) {
                firstOperand = "2";
            }
            else {
                firstOperand += "2";
            }
            labela.set(firstOperand);
        } else {
            if(secondOperand.equals("") || (secondOperand.charAt(0) == '0' && secondOperand.length() == 1)) {
                secondOperand = "2";
            }
            else {
                secondOperand += "2";
            }
            labela.set(secondOperand);
            equalsBtn.getStyleClass().removeAll("unosNijeIspravan");
            equalsBtn.getStyleClass().add("unosIspravan");
        }
    }

    public void oneClick(ActionEvent actionEvent) {
        if(operationType.equals("") && firstInput){
            if(firstOperand.equals("") || (firstOperand.charAt(0) == '0' && firstOperand.length() == 1)) {
                firstOperand = "1";
            }
            else {
                firstOperand += "1";
            }
            labela.set(firstOperand);
        } else {
            if(secondOperand.equals("") || (secondOperand.charAt(0) == '0' && secondOperand.length() == 1)) {
                secondOperand = "1";
            }
            else {
                secondOperand += "1";
            }
            labela.set(secondOperand);
            equalsBtn.getStyleClass().removeAll("unosNijeIspravan");
            equalsBtn.getStyleClass().add("unosIspravan");
        }
    }

    public void pointClick(ActionEvent actionEvent) {
        if(operationType.equals("") && firstInput) {
            firstOperand += ".";
            labela.set(firstOperand);
        }
        else {
            secondOperand += ".";
            labela.set(secondOperand);
        }
    }

    public void zeroClick(ActionEvent actionEvent) {
        if(operationType.equals("") && firstInput){
            if(firstOperand.equals("")){
                firstOperand = "0";
            } else if(firstOperand.charAt(0) == '0' && firstOperand.length() == 1) {
                firstOperand = "0";
            } else {
                firstOperand += "0";
            }
            labela.set(firstOperand);
        } else{
            if(secondOperand.equals("")){
                secondOperand = "0";
            } else if(secondOperand.length() == 1 && secondOperand.charAt(0) == '0') {
                secondOperand = "0";
            } else {
                secondOperand += "0";
            }
            labela.set(secondOperand);
            equalsBtn.getStyleClass().removeAll("unosNijeIspravan");
            equalsBtn.getStyleClass().add("unosIspravan");
        }
    }

    public void threeClick(ActionEvent actionEvent) {
        if(operationType.equals("") && firstInput){
            if(firstOperand.equals("") || (firstOperand.charAt(0) == '0' && firstOperand.length() == 1)) {
                firstOperand = "3";
            }
            else {
                firstOperand += "3";
            }
            labela.set(firstOperand);
        } else {
            if(secondOperand.equals("") || (secondOperand.charAt(0) == '0' && secondOperand.length() == 1)) {
                secondOperand = "3";
            }
            else {
                secondOperand += "3";
            }
            labela.set(secondOperand);
            equalsBtn.getStyleClass().removeAll("unosNijeIspravan");
            equalsBtn.getStyleClass().add("unosIspravan");
        }
    }

    public void equalsAction(ActionEvent actionEvent) {
        firstInput = false;
        Double prvi = Double.parseDouble(firstOperand);
        Double drugi = Double.parseDouble(secondOperand);
        if(operationType.equals("+")) {
            Double rezultat = prvi + drugi;
            labela.set(rezultat.toString());
            result = rezultat.toString();
        }
        else if(operationType.equals("-")) {
            Double rezultat = prvi - drugi;
            labela.set(rezultat.toString());
            result = rezultat.toString();
        }
        else if(operationType.equals("*")) {
            Double rezultat = prvi * drugi;
            labela.set(rezultat.toString());
            result = rezultat.toString();
        }
        else if(operationType.equals("/")) {
            Double rezultat = prvi / drugi;
            labela.set(rezultat.toString());
            result = rezultat.toString();
        }
        else {
            Double rezultat = prvi % drugi;
            labela.set(rezultat.toString());
            result = rezultat.toString();
        }
        operationType = "";
        secondOperand = "";
    }
}
