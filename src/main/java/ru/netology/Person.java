package ru.netology;

public class Person {

    protected final String name;
    protected final String secondName;
    protected int age;
    protected String city;

    protected Person(PersonBuilder personBuilder){
        name = personBuilder.name;
        secondName = personBuilder.secondName;
        age = personBuilder.age;
        city = personBuilder.city;
    }

    public PersonBuilder newChildBuilder(){
        return new PersonBuilder()
                .setSecondName(this.secondName)
                .setCity(this.city);
    }

    protected boolean hasAge(){
        return age != 0;
    }

    protected boolean hasCity(){
        return city != null;
    }

    protected void happyBirthday(){
        if(hasAge()) {
            age = age + 1;
        } else {
            System.out.println("We don`t know " + getName() + "`s age");
        }

    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

}
