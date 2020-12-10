module klotski.test {
    requires org.junit.jupiter.api;
    requires spring.boot.test;
    opens com.cpt.klotski to javafx.fxml;
    //exports com.cpt.klotski;
}