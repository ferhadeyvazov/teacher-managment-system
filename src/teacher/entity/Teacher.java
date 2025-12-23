package teacher.entity;

public class Teacher {
    private String firstname;
    private String surname;
    private byte age;

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public byte getAge() {
        return age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstname + " " + surname + " " + age;
    }


}
