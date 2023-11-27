module com.example.sep1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sep1 to javafx.fxml;
    exports com.example.sep1;
}