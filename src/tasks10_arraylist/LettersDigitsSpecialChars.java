package tasks10_arraylist;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

        String letters ="";
        String digit ="";
        String specialCharacter ="";

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)){
                letters+=c;
            }
            if (Character.isDigit(c)) {
                digit+=c;
            }
            if (!Character.isLetterOrDigit(c)){
                specialCharacter+=c;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digit = " + digit);
        System.out.println("specialCharacter = " + specialCharacter);

        }

    }

