module com.example.ninemenmorris {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ninemenmorris to javafx.fxml;
    exports com.example.ninemenmorris;
}