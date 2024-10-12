module com.alesandro.ejercicio15n {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alesandro.ejercicio15n to javafx.fxml;
    exports com.alesandro.ejercicio15n;
}