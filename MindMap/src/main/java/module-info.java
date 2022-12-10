module com.example.mindmap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mindmap to javafx.fxml;
    exports com.example.mindmap;
}