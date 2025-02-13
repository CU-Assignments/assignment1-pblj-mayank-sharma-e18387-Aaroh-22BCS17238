import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        System.out.println("Code By Aaroh Gaur(22BCS17238)");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int vow = 0;
        int cons = 0;
        int dig = 0;
        int special = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                char lowerCh = Character.toLowerCase(ch);
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vow++;
                } else {
                    cons++;
                }
            } else if (Character.isDigit(ch)) {
                dig++;
            } else {
                if(Character.isWhitespace(ch)==false)
                special++;
            }
        }
        System.out.println("vowels: " + vow);
        System.out.println("consonants: " + cons);
        System.out.println("Digits: " + dig);
        System.out.println("Special Characters: " + special);        
        scanner.close();
    }
}
