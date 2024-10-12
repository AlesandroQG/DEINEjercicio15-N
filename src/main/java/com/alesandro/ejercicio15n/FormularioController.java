package com.alesandro.ejercicio15n;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FormularioController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}