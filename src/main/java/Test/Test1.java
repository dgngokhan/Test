package Test;

public class Test1 {
    public static void main(String[] args) {
        String arr[][] =
                {
                        {"A", "W", "C", "E", "D"},
                        {"C", "A", "K", "E", "A"},
                        {"A", "K", "I", "E", "D"},
                        {"A", "E", "C", "E", "D"},
                        {"A", "B", "E", "E", "D"}
                };
        String word = "CAKE";
        System.out.println(checkingContainsWord(word, arr));
    }
    public static boolean checkingContainsWord(String givenWord, String matrix[][]) {
        String temp = "";
        for (String[] strings : matrix) {
            for (String string : strings) {
                temp += string;
            }
            if (temp.contains(givenWord)) {
                System.out.println(temp);
                return true;
            }
            temp = "";
        }
        return false;
    }
}
