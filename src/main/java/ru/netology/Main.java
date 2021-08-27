package ru.netology;

public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Olga")
                .setSecondName("Smith")
                .setAge(27)
                .setCity("Kyiv")
                .build();
        Person son = mom.newChildBuilder()
                        .setName("Ivan")
                        .build();
        mom.happyBirthday();
        son.happyBirthday();
        System.out.println(mom.getName() + " has a child " + son.getName() );
        System.out.println(mom);
        System.out.println(son);

    }

}

