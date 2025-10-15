interface WordCount {
    int count(String str);
}

public class Assignment88 {
    public static void main(String[] args) {
        WordCount wc = (str) -> {
            if (str == null || str.isEmpty()) {
                return 0;
            }
            String[] words = str.trim().split("\\s+");
            return words.length;
        };

        String input = "Java is a widely used programming language";
        int wordCount = wc.count(input);

        System.out.println("Input String: " + input);
        System.out.println("Number of words: " + wordCount);
    }
}
