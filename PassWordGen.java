/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordgen;

import java.util.Scanner;

/**
 *
 * @author Tristan Description: Set to run the Password generator
 */
public class PassWordGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //summon the Scanner
        Scanner makePass = new Scanner(System.in);
        System.out.println("Please insert the length of your new password: ");
        int passLong = makePass.nextInt();
        Generator genny = new Generator(passLong);

        //for (int i = 0; i < passLong; i++) {
        String newPass;
        newPass = genny.generatePassword(passLong);
        System.out.println("Your new Password is: " + newPass);
        //}

    }

}
