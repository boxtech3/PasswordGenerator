/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passwordgen;

import java.util.Random;

/**
 *
 * @author boxtech3 Description: This is the generator class for the password
 * creator app
 */
public class Generator {

    //declare variables
    private int length;
    private boolean includeUppercase;
    private boolean includeLowercase;
    private boolean includeNumbers;
    private boolean includeSpecialCharacters;

    //create constructor
    public Generator(int length) {
        this.length = length;
        this.includeUppercase = true;
        this.includeLowercase = true;
        this.includeNumbers = true;
        this.includeSpecialCharacters = true;
    }

    //generate the password
    public String generatePassword(int passSize) {
        //declare password variable
        String theWordAndNums;
        theWordAndNums = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        int shoes = 1;

// Loop to generate password characters
        StringBuilder sb = new StringBuilder(passSize);
        for (int i = 0; i < passSize; i++) {
            char code = getRandomCharacter(theWordAndNums);
            sb.append(code);
        }

        return sb.toString();

    }

    //random character generator
    private char getRandomCharacter(String source) {
        Random random = new Random();
        int index = random.nextInt(source.length());
        return source.charAt(index);
    }

}
