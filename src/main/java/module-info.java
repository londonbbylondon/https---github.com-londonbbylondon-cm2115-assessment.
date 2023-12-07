module uk.ac.rgu.cm2115 {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;

    opens uk.ac.rgu.cm2115 to javafx.fxml;
    opens uk.ac.rgu.cm2115.controllers to javafx.fxml;
    opens uk.ac.rgu.cm2115.abstractions to javafx.fxml;
    opens uk.ac.rgu.cm2115.models to javafx.fxml;
    opens uk.ac.rgu.cm2115.repository to javafx.fxml;

    exports uk.ac.rgu.cm2115;
    exports uk.ac.rgu.cm2115.controllers;
    exports uk.ac.rgu.cm2115.abstractions;
    exports uk.ac.rgu.cm2115.models;
    exports uk.ac.rgu.cm2115.repository;
}
