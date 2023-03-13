package ru.redblog.phonebook;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;

public class BookController implements Initializable {

    @FXML
    private TableView<Person> tbData;
    @FXML
    public TableColumn<Person, String> lastName;
    @FXML
    public TableColumn<Person, String> firstName;
    @FXML
    public TableColumn<Person, String> oldName;
    @FXML
    public TableColumn<Person, String> phone;
    private ObservableList<Person> person;

    @Override
    public void initialize (URL location, ResourceBundle resources) {
        lastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        oldName.setCellValueFactory(new PropertyValueFactory<>("OldName"));
        phone.setCellValueFactory(new PropertyValueFactory<>("Phone"));
        person = FXCollections.observableArrayList(
                new Person("Терентье", "Иван","Владимирович", "89030054321"),
                new Person("Пупкин", "Сергей","Владимирович", "89040054321"),
                new Person("Сидарчук", "Иван","Владимирович", "89030554321"),
                new Person("Тетерев", "Алексей","Владимирович", "85030054321"),
                new Person("Баклан", "Иван","Владимирович", "87030054321"));
        tbData.setItems(person);
    }
}




