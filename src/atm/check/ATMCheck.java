/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.check;
import java.util.Scanner;


/**
 *
 * @author Nwanwobi Samuel
 */
public class ATMCheck {

    /**
     * @param args the command line arguments
     * Main method where the two methods finds expression and relate
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArr = getInput();
        checkSum(myArr);
    }
    /**
     * This method gets the credit card number inputed and converts it in a form that
     * can easily be used for our calculation
     * @return intArr 
     */
    public static int[] getInput(){
        // Scanner to input the credit card number
        Scanner input_creditCard = new Scanner(System.in);
        System.out.println("Enter card number: ");
        //The inputed credit card number shows on a new line
        String input = input_creditCard.nextLine();
        //Store splitted characters by white spaces 
        String[] stringArr = input.split(" ");
        final int SIZE = stringArr.length;
        //This is our returning array
        int[] intArr = new int[SIZE];
        // Filling integer array with data converted from String array
        for (int i = 0; i < SIZE; i++){
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        //to prevent resource leaks
        input_creditCard.close();
        //returns the integer array
        return intArr;
    }
    /**
     * This method handles the entire calculation which is then used with the inputed digits 
     * from the getInput() method
     * @param array 
     */
    public static void checkSum(int[] array){
        int n = 2;
        for (int i = 1; i < array.length; i += 2){
            int[] myArray = new int [array[i] * n]; 
        }
        System.out.println("Element a: " myArray[]); 
        
    }
    
    public void checkCardType(){
    
    }
    
}
