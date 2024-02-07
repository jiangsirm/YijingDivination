module com.example.divination {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.divination to javafx.fxml;
    exports com.example.divination;
}