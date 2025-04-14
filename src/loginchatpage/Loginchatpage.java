/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginchatpage;

import java.util.Scanner;

public class Loginchatpage {

     //system will be able to let 4 users register
    static String[] registerUsername = new String[4];
    static String[] registerPassword = new String[4];
    static String[] registerCellphoneNumber = new String[4];
    
     //variables are declared
    static String userName;
    static String passWord;
    static String cellPhoneNumber;
    static String loginUser;
    static String loginPassword;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our registration login page");
        // register your username
        System.out.println("Register your username");
        userName = input.nextLine();
        while(!chckUsername(userName)){
            System.out.println("Register your user name again");
            userName = input.nextLine();  
        }
      //password registration
        System.out.println("Register your login password");
        String passWord = input.nextLine();
        while(!chckpassWord(passWord)){
            System.out.println("Register your password again");
            passWord = input.nextLine();               
        }
        // cellphone number registration
        System.out.println("Register your cellphone number");
        String cellphoneNumber = input.nextLine();
        while(!chckcellphoneNumber(cellphoneNumber)){
            System.out.println("Register your cellphone number again");
            cellphoneNumber = input.nextLine();   
        }
        registerUsername[0] = userName;
        registerPassword[0] = passWord;
        registerCellphoneNumber[0] = cellphoneNumber;
        System.out.println("Registration complete"); 
        // user login page
        System.out.println("Conguradulatin with your registration now Welcome to your login page");
        System.out.println("Enter your login userName");
        loginUser = userName;
        System.out.println("Enter your login passWord");
        loginPassword = passWord;
        
        input.close();   
    }
     //function for username requirement
    public static boolean chckUsername(String userName){
      if(userName.contains("_") && userName.length() <= 5){
          System.out.println("your username is correct you may procced");
          return true;
       
      }else{
          System.out.println("username is incorrect please repeat");
          return false;
      }
    }
    // function for password Requirement
    public static boolean chckpassWord(String passWord){
        boolean length = passWord.length() !=8;
        boolean capital = passWord.matches(".*[A-Z].*");
        boolean number = passWord.matches(".*[0-9].*");
        boolean special = passWord.matches(".*[^*@-zA-Z0-9]");
        
        if(length && capital && number && special){
            System.out.println("Your password is correct you may proceed");
          return true;   
        }else{
            System.out.println("Your password is incorrect please try again");
          return false;
        }  
    }
    // function for cellphone Requirement
    public static boolean chckcellphoneNumber( String cellphoneNumber){
       if(cellphoneNumber.matches("^\\+\\d{1,3}\\d{1,10}$")){
           System.out.println("Your cellphone number is correct you may procceed");
           return true;
       }else{
           System.out.println("Your cellphone number is incorrect please try again");
           return false;
       }
        
    }
    
    


 }




    
        
        
        
    
