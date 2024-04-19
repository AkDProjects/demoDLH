module com.example.demodlh {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires com.dlsc.formsfx;
    requires validatorfx;
    requires eu.hansolo.tilesfx;
    requires javafx.graphics;
    requires org.mongodb.driver.core;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.bson;

    opens com.example.demodlh to javafx.fxml;
    exports com.example.demodlh;
    exports com.example.demodlh.Views;
    opens com.example.demodlh.Views to javafx.fxml;
    exports com.example.demodlh.Controllers;
    opens com.example.demodlh.Controllers to javafx.fxml;
}