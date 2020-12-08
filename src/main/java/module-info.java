module klotski {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    opens com.cpt.klotski to javafx.fxml;
    exports com.cpt.klotski;
}