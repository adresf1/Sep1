module com.example.sep1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires XmlJsonParser;
    requires java.sql;


    opens com.example.sep1 to javafx.fxml, XmlJsonParser;
    exports com.example.sep1;
}