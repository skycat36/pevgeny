package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {

    public int ask(String questions, int[] range){
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(questions, range);
                invalid = false;
            } catch (MenuOutExeption moe) {
                moe.printStackTrace();
                System.out.println("Please select key from menu. ");
            }catch (NumberFormatException nfe) {
                System.out.println("Please enter validate date again. ");
            }
        }while (invalid);
        return value;
    }
}
