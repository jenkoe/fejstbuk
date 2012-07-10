package org.openblend.fejstbuk.ui;

import org.openblend.fejstbuk.domain.Gender;
import org.openblend.fejstbuk.domain.User;

import java.io.Serializable;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

/**
 * @author <a href="mailto:tomaz.cerar@redhat.com">Tomaz Cerar</a>
 */
@ConversationScoped
@Named
public class RegisterAction implements Serializable {
    private String name;
    private String lastName;
    private Gender gender;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
    public void register() {
        User user = new User();
        user.setName(name);
        user.setSurname(lastName);
        user.setGender(gender);
        user.setLocation(country);



    }
}
