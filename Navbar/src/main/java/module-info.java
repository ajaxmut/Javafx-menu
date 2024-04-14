module com.example.navbar {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.navbar to javafx.fxml;
    exports com.example.navbar;
}