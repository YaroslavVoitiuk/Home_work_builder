package ru.netology;

public class PersonBuilder {

    protected String name;
    protected String secondName;
    protected int age;
    protected String city;

    public PersonBuilder setName(String name){
        this.name = name;
        return this;
    }

    public PersonBuilder setSecondName(String secondName){
        this.secondName = secondName;
        return this;
    }

    public PersonBuilder setAge(int age){
        if(age > 0) {
            this.age = age;
            return this;
        } else {
            throw new IllegalArgumentException("Возраст не может быть отрицательный !");
        }
    }

    public PersonBuilder setCity(String city){
        this.city = city;
        return this;
    }

    public Person build(){
        if(this.name != null && this.secondName != null) {
            return new Person(this);
        } else {
            throw new IllegalStateException("Не верно введены имя или фамилия !");
        }
    }

}
