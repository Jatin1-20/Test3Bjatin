module com.example.test3bjatin {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.test3bjatin to javafx.fxml;
    exports com.example.test3bjatin;
}