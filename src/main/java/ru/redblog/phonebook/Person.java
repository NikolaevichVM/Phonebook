package ru.redblog.phonebook;

import javafx.beans.property.SimpleStringProperty;

public class Person{

    SimpleStringProperty LastName;
    SimpleStringProperty FirstName;
    SimpleStringProperty OldName;
    SimpleStringProperty Phone;

     public Person(String lastName, String firstName, String oldName, String phone){
       LastName = new SimpleStringProperty(lastName);
       FirstName = new SimpleStringProperty(firstName);
       OldName = new SimpleStringProperty(oldName);
       Phone = new SimpleStringProperty(phone);
    }

    public String getLastName() {
        return LastName.get();
    }

    public SimpleStringProperty lastNameProperty() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName.get();
    }

    public SimpleStringProperty firstNameProperty() {
        return FirstName;
    }

    public String getOldName() {
        return OldName.get();
    }

    public SimpleStringProperty oldNameProperty() {
        return OldName;
    }

    public String getPhone() {
        return Phone.get();
    }

    public SimpleStringProperty phoneProperty() {
        return Phone;
    }

    public void setLastName(String lastName) {
        this.LastName.set(lastName);
    }

    public void setFirstName(String firstName) {
        this.FirstName.set(firstName);
    }

    public void setOldName(String oldName) {
        this.OldName.set(oldName);
    }

    public void setPhone(String phone) {
        this.Phone.set(phone);
    }
}
