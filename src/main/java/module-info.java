module com.example.demodlh {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires com.dlsc.formsfx;
    requires validatorfx;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;

    opens com.example.demodlh to javafx.fxml;
    exports com.example.demodlh;
}