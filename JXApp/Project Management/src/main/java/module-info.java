module com.amannirala13.projectmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.amannirala13.projectmanagement to javafx.fxml;
    exports com.amannirala13.projectmanagement;
    exports com.amannirala13.projectmanagement.controllers;
    opens com.amannirala13.projectmanagement.controllers to javafx.fxml;
}