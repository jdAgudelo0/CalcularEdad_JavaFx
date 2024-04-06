package a.calcularedad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class ControlladorVista {

    @FXML
    private DatePicker dPFecha;

    @FXML
    private Label welcomeText;


    /**
     * Metodo del boton que sirve para calcular la edad y mostrarla por pantalla.
     * @param event
     */
    @FXML
    void calcularEdad(ActionEvent event) {

        int year = dPFecha.getValue().getYear();
        int yearActual = LocalDate.now().getYear();
        int edad = yearActual - year;


        welcomeText.setText("Tu edad es: " + edad);

    }

}
