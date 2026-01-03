package com.example.chapter3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class WeatherController {

    @FXML private TextField cityField;
    @FXML private Button refreshButton;

    @FXML
    public void initialize() {
        refreshButton.disableProperty().bind(cityField.textProperty().isEmpty());
    }
}
