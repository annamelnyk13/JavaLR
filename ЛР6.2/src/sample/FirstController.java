package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class FirstController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button CalculateButton;

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private TextField text3;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;

    @FXML
    private Button GetButton;

    @FXML
    private TextField textField;

    @FXML
    private Label resultLabel1;

    @FXML
    void GetMonth(ActionEvent event) {
        resultLabel1.setTextFill(Color.rgb(0, 0, 0));
        if(textField.getText().equals("")) {
            resultLabel1.setTextFill(Color.rgb(210, 39, 30));
            resultLabel1.setText("Помилка: поле не може бути пустим");
            return;
        }

        if(!textField.getText().matches("[0-9]*")) {
            resultLabel1.setTextFill(Color.rgb(210, 39, 30));
            resultLabel1.setText("Помилка: ви ввели не коректні дані");
            return;
        }

        if(textField.getText().length() > 3 || Integer.parseInt(textField.getText()) == 0 || Integer.parseInt(textField.getText()) >= 12) {
            resultLabel1.setTextFill(Color.rgb(210, 39, 30));
            resultLabel1.setText("Помилка: можливий діапазон є [1:12]");
            return;
        }
        resultLabel1.setText(getNameOfMonth(Integer.parseInt(textField.getText())));
    }

    private String getNameOfMonth(int month) {
        switch (month) {
            case 1:
                return "Січень";
            case 2:
                return "Лютий";
            case 3:
                return "Березень";
            case 4:
                return "Квітень";
            case 5:
                return "Травень";
            case 6:
                return "Червень";
            case 7:
                return "Липень";
            case 8:
                return "Серпень";
            case 9:
                return "Вересень";
            case 10:
                return "Жовтень";
            case 11:
                return "Листопад";
            case 12:
                return "Грудень";
        }
        return null;
    }

    @FXML
    void calculateCylinder(ActionEvent event) {
        l1.setText(text2.getText());
        l2.setText(text3.getText());
        l3.setText(text1.getText());
    }

    @FXML
    void initialize() {
        assert CalculateButton != null : "fx:id=\"CalculateButton\" was not injected: check your FXML file 'first.fxml'.";
        assert text1 != null : "fx:id=\"text1\" was not injected: check your FXML file 'first.fxml'.";
        assert text2 != null : "fx:id=\"text2\" was not injected: check your FXML file 'first.fxml'.";
        assert text3 != null : "fx:id=\"text3\" was not injected: check your FXML file 'first.fxml'.";
        assert l1 != null : "fx:id=\"l1\" was not injected: check your FXML file 'first.fxml'.";
        assert l2 != null : "fx:id=\"l2\" was not injected: check your FXML file 'first.fxml'.";
        assert l3 != null : "fx:id=\"l3\" was not injected: check your FXML file 'first.fxml'.";
        assert GetButton != null : "fx:id=\"GetAgeButton\" was not injected: check your FXML file 'first.fxml'.";
        assert textField != null : "fx:id=\"textFieldAge\" was not injected: check your FXML file 'first.fxml'.";
        assert resultLabel1 != null : "fx:id=\"resultLabel1\" was not injected: check your FXML file 'first.fxml'.";

    }
}

//public class FirstController {
//
//    @FXML
//    private ResourceBundle resources;
//
//    @FXML
//    private URL location;
//
//    @FXML
//    private Button CalculateButton;
//
//    @FXML
//    private TextField textFieldH;
//
//    @FXML
//    private TextField textFieldR;
//
//    @FXML
//    private Label resultLabel;
//
//    @FXML
//    private Button GetAgeButton;
//
//    @FXML
//    private TextField textFieldAge;
//
//    @FXML
//    private Label resultLabel1;
//
//    @FXML
//    void GetAgeOfPeople(ActionEvent event) {
//
//        resultLabel1.setTextFill(Color.rgb(0, 0, 0));
//        if(textFieldAge.getText().equals("")) {
//            resultLabel1.setTextFill(Color.rgb(210, 39, 30));
//            resultLabel1.setText("Помилка: поле з віком не може бути пустим");
//            return;
//        }
//
//        if(!textFieldAge.getText().matches("[0-9]*")) {
//            resultLabel1.setTextFill(Color.rgb(210, 39, 30));
//            resultLabel1.setText("Помилка: ви ввели не коректні дані");
//            return;
//        }
//
//        if(textFieldAge.getText().length() > 3 || Integer.parseInt(textFieldAge.getText()) == 0) {
//            resultLabel1.setTextFill(Color.rgb(210, 39, 30));
//            resultLabel1.setText("Помилка: можливий діапазон віку є [1:99]");
//            return;
//        }
//
//        int age = Integer.parseInt(textFieldAge.getText());
//        String text;
//
//        switch (age) {
//            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ->
//                    text = "Ви дитина";
//            case 11, 12, 13, 14, 15 ->
//                    text = "Ви підліток";
//            case 16, 17, 18, 19, 20 ->
//                    text = "Ви юнак";
//            case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 ->
//                    text = "Ви молода людина";
//            default ->
//                    text = "Ви доросла людина";
//        }
//        resultLabel1.setText(text);
//    }
//
//    @FXML
//    void calculateCylinder(ActionEvent event) {
//        if(textFieldR.getText().equals("") || textFieldH.getText().equals("")) {
//            resultLabel.setTextFill(Color.rgb(210, 39, 30));
//            resultLabel.setText("Помилка: H або R не можуть бути пустими");
//            return;
//        }
//        if(!textFieldR.getText().matches("([0-9]+[.])?[0-9]+") || !textFieldH.getText().matches("([0-9]+[.])?[0-9]+")) {
//            resultLabel.setTextFill(Color.rgb(210, 39, 30));
//            resultLabel.setText("Помилка: H або R мають бути числами");
//            return;
//        }
//        float h = Float.parseFloat(textFieldH.getText());
//        float r = Float.parseFloat(textFieldR.getText());
//        double resultS = 2 * 3.14 * h * r;
//        double resultV = 3.14 * (h * h) * r;
//        resultLabel.setTextFill(Color.rgb(0, 0, 0));
//        resultLabel.setText("S = " + String.format("%.2f", resultS) + "\nV = " + String.format("%.2f", resultV));
//    }
//
//    @FXML
//    void initialize() {
//        assert CalculateButton != null : "fx:id=\"CalculateButton\" was not injected: check your FXML file 'first.fxml'.";
//        assert textFieldH != null : "fx:id=\"textFieldH\" was not injected: check your FXML file 'first.fxml'.";
//        assert textFieldR != null : "fx:id=\"textFieldR\" was not injected: check your FXML file 'first.fxml'.";
//        assert resultLabel != null : "fx:id=\"resultLabel\" was not injected: check your FXML file 'first.fxml'.";
//        assert GetAgeButton != null : "fx:id=\"GetAgeButton\" was not injected: check your FXML file 'first.fxml'.";
//        assert textFieldAge != null : "fx:id=\"textFieldAge\" was not injected: check your FXML file 'first.fxml'.";
//        assert resultLabel1 != null : "fx:id=\"resultLabel1\" was not injected: check your FXML file 'first.fxml'.";
//
//    }
//}

