module com.example.todoapplication {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.todoapplication to javafx.fxml;
    exports com.example.todoapplication;
}