public class StringManipulation {
    public static void main(String[] args) {
        String originalString = "programming is easy";
        String stringWithoutSpaces = "";
        String modifiedString;

        // Remove spaces from the original string
        for (int i = 0; i < originalString.length(); i++) {
            if (!originalString.substring(i, i + 1).equals(" ")) {
                stringWithoutSpaces += originalString.substring(i, i + 1);
            }
        }
        originalString = stringWithoutSpaces;
        stringWithoutSpaces = "";

        // Change the case of characters based on their positions
        for (int i = 1; i <= originalString.length(); i++) {
            String currentChar = originalString.substring(i - 1, i);
            if (i % 2 == 0) {
                currentChar = currentChar.toUpperCase();
            } else {
                currentChar = currentChar.toLowerCase();
            }
            stringWithoutSpaces += currentChar + " ";
        }
        modifiedString = stringWithoutSpaces;
        stringWithoutSpaces = "";

        // Print the modified string
        System.out.println(modifiedString);

        // Remove spaces from the modified string
        for (int j = 0; j < modifiedString.length(); j++) {
            if (!modifiedString.substring(j, j + 1).equals(" ")) {
                stringWithoutSpaces += modifiedString.substring(j, j + 1);
            }
        }
        modifiedString = stringWithoutSpaces;
        stringWithoutSpaces = "";

        // Print the modified string without spaces
        System.out.println(modifiedString);

        // Reduce the length of the string by taking every second character
        while (modifiedString.length() > 1) {
            for (int j = 0; j < modifiedString.length(); j += 2) {
                stringWithoutSpaces += modifiedString.substring(j, j + 1);
            }
            modifiedString = stringWithoutSpaces;
            stringWithoutSpaces = "";

            // Print the current result
            System.out.println(modifiedString);
        }
    }
}