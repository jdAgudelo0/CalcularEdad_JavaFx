module a.calcularedad {
    requires javafx.controls;
    requires javafx.fxml;


    opens a.calcularedad to javafx.fxml;
    exports a.calcularedad;
}