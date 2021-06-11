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
    private TextField textField;

    @FXML
    private Label resultLabel1;

    @FXML
    void calculateCylinder(ActionEvent event) {

        if(text1.getText().equals("") || text2.getText().equals("") || text3.getText().equals("") ) {
            l1.setText("Помилка: поле не може бути пустим");
            return;
        }

        if(!text1.getText().matches("[0-9]*") || !text2.getText().matches("[0-9]*") || !text3.getText().matches("[0-9]*")) {
            l1.setText("Помилка: ви ввели не коректні дані");
            return;
        }

        int x = Integer.parseInt(text1.getText());
        int y = Integer.parseInt(text2.getText());
        int z = Integer.parseInt(text3.getText());
        float result = (float) Math.sqrt(Math.pow(x, 2)) * y - 14 * z;
        l1.setText(String.format("%.2f", result));
    }

    @FXML
    void initialize() {
        assert CalculateButton != null : "fx:id=\"CalculateButton\" was not injected: check your FXML file 'first.fxml'.";
        assert text1 != null : "fx:id=\"text1\" was not injected: check your FXML file 'first.fxml'.";
        assert text2 != null : "fx:id=\"text2\" was not injected: check your FXML file 'first.fxml'.";
        assert text3 != null : "fx:id=\"text3\" was not injected: check your FXML file 'first.fxml'.";
        assert l1 != null : "fx:id=\"l1\" was not injected: check your FXML file 'first.fxml'.";
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

