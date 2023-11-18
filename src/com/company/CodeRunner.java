package com.company;

public class CodeRunner {
    public static void main(String[] args) {
//        int command = 2;
//
//        if (command == 0) {
//            System.out.println("CodeRunner running North");
//        }else if(command == 1){
//            System.out.println("CodeRunner running South");
//        }else if (command == 2){
//            System.out.println("CodeRunner running West");
//        }else if (command == 3){
//            System.out.println("CodeRunner is running East");
//        }else if (command>= 4 || command < 0){
//            System.out.println("CodeRunner is confused - doesn’t know where to go");
//        }else {
//            System.out.println("Unknown command");
//        }
        CodeRunner codeRunner = new CodeRunner();
        codeRunner.running(1);
    }

    public String running(int command) {

        if (command == 0) {

            return "CodeRunner running North";

        }else if (command == 1) {

            return "CodeRunner running South";

        }else if (command == 2) {

            return "CodeRunner running West";

        }else if (command == 3) {

            return "CodeRunner running East";

        }else if( (command >= 4) || (command < 0) ) {

            return "CodeRunner is confused - doesn't know where to go!";

        }else {

            return "Unknown command.";

        }

    }

}