module com.example.contacsapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contacsapp to javafx.fxml;
    exports com.example.contacsapp;
}