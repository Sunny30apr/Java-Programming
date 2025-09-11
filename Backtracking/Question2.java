public class Question2 {
    public static final String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void printKeypadCombinations(String digits, int index, String combination) {
        if (index == digits.length()) {
            System.out.println(combination);
            return;
        }

        char currentDigit = digits.charAt(index);

        String mapping = keypad[currentDigit - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printKeypadCombinations(digits, index + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String args[]) {
        String digits = "2";
        printKeypadCombinations(digits, 0, "");
    }
}