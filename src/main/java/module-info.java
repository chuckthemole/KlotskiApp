module klotski.main {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires net.rgielen.fxweaver.core;
    requires spring.context;
    requires spring.web;
    requires org.apache.tomcat.embed.core;

    opens com.cpt.klotski to javafx.fxml;
    exports com.cpt.klotski;
}