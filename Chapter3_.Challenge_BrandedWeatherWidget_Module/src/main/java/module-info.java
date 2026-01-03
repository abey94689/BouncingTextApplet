module com.example.chapter3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.chapter3 to javafx.fxml;
    exports com.example.chapter3;
}
