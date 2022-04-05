package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheckerController {
    @FXML
    private TextField regexTextField;
    @FXML
    private TextArea stringTextArea;
    @FXML
    private Label regexHeaderLabel;
    @FXML
    private Label stringHeaderLabel;
    @FXML
    private Label resultLabel;

    @FXML
    public void onCheckRegexButtonClick(ActionEvent actionEvent) {
        String myString = stringTextArea.getText();
        String myRegex = regexTextField.getText();

        Pattern myPattern = Pattern.compile(myRegex);
        Matcher myMatcher = myPattern.matcher(myString);

        if (myMatcher.find()) {
            resultLabel.setText("OK");
        } else {
            resultLabel.setText("NG");
        }
    }
}