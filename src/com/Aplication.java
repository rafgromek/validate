package com;

/**
 * Created by Rafal Gromek on @ {DATE}.
 */
 class Application {

    public static void main (String[] args) {

        System.out.println("Starting...");

        int age = 15;
        char sex = 'm';

        UserValidator validator = new UserValidator();

        boolean isHigherThanFifteen = validator.validateAge(age);

        if(isHigherThanFifteen) {
            validator.validateSex(sex);
        }

        System.out.println("End of the program");
    }
}
