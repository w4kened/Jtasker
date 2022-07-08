module w4.example.jtasker {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens w4.example.jtasker to javafx.fxml;
    exports w4.example.jtasker;
}