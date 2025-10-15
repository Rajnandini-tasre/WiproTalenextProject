public class Assignement9 {
    public static void main(String[] args) {
     
        char ch = 'b';

        System.out.print("Original character: " + ch + "  -->  ");


        if (ch >= 'a' && ch <= 'z') {
            // Convert to uppercase
            char upper = (char)(ch - 'a' + 'A');
            System.out.println("Uppercase: " + upper);
        } else {
            System.out.println("Character is not lowercase: " + ch);
        }
    }
}
