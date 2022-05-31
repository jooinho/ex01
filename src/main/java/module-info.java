module com.example.ex01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ex01 to javafx.fxml;
    exports com.example.ex01;
}