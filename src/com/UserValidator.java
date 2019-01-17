package com;

/**
 * Created by Rafal Gromek on @ {DATE}.
 */
public class UserValidator {

    public boolean validateAge(int age) {
        if(age <=15) {
            System.out.println("Too young!");
            return false;

        } else {

            System.out.println("User age is okey!");
            return true;
        }
    }

    public void validateSex(char sex) {

        if(sex == 'm') {
            System.out.println("User is a male");

        } else if(sex == 'f') {
            System.out.println("User is a female");

        } else {
            System.out.println("Unkwon sex!");
        }
    }
}
