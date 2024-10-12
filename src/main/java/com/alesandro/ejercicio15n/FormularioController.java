package com.alesandro.ejercicio15n;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/**
 * Clase que controla los eventos de la ventana
 */
public class FormularioController {
    @FXML // fx:id="txtApellidos"
    private TextField txtApellidos; // Value injected by FXMLLoader

    @FXML // fx:id="txtNombre"
    private TextField txtNombre; // Value injected by FXMLLoader

    @FXML // fx:id="txtProfesion"
    private TextField txtProfesion; // Value injected by FXMLLoader

    /**
     * Función que se ejecuta cuando se pulsa el botón "Aceptar". Válida los datos del formulario
     *
     * @param event
     */
    @FXML
    void aceptar(ActionEvent event) {
        String error = "";
        if (txtNombre.getText().isBlank()) {
            error = "El campo Nombre no puede estar vacío";
        }
        if (txtApellidos.getText().isBlank()) {
            if (!error.isBlank()) {
                error += "\n";
            }
            error += "El campo Apellidos no puede estar vacío";
        }
        if (txtProfesion.getText().isBlank()) {
            if (!error.isBlank()) {
                error += "\n";
            }
            error += "El campo Profesión no puede estar vacío";
        }
        if (!error.isBlank()) {
            alerta(error);
        } else {
            String resultado = "Nombre: " + txtNombre.getText() + "\nApellidos: " + txtApellidos.getText() + "\nProfesión: " + txtProfesion.getText();
            confirmacion(resultado);
        }
    }

    /**
     * Función que se ejecuta cuando se pulsa el botón "Cancelar". Cierra la aplicación
     *
     * @param event
     */
    @FXML
    void cancelar(ActionEvent event) {
        Platform.exit();
    }

    /**
     * Función que muestra un mensaje de alerta al usuario
     *
     * @param texto contenido de la alerta
     */
    public void alerta(String texto) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setHeaderText(null);
        alerta.setTitle("ERROR");
        alerta.setContentText(texto);
        alerta.showAndWait();
    }

    /**
     * Función que muestra un mensaje de confirmación al usuario
     *
     * @param texto contenido del mensaje
     */
    public void confirmacion(String texto) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText(null);
        alerta.setTitle("Info");
        alerta.setContentText(texto);
        alerta.showAndWait();
    }

}