module com.example.lesson2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson2 to javafx.fxml;
    exports com.example.lesson2;
}