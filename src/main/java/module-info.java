module ru.redblog.phonebook {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires jakarta.xml.bind;
    requires java.prefs;

    opens ru.redblog.phonebook to javafx.fxml;
    exports ru.redblog.phonebook;
}