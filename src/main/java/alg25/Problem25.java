package alg25;

public class Problem25 {
    public static boolean isMatch(String regex, String str){
        if(regex.isBlank())
            return str.isBlank();

        boolean firstMatch;

        firstMatch = !str.isBlank() && (str.charAt(0) + Character.toString('.')).contains(Character.toString(regex.charAt(0)));

        if(regex.length() >= 2 && regex.charAt(1) == '*'){
            return isMatch(regex.substring(2), str) || (firstMatch && isMatch(regex, str.substring(1)));
        }
        else return firstMatch && isMatch(regex.substring(1), str.substring(1));
    }
    public static void main(String[] args) {
        Problem25 pr25 = new Problem25();
        System.out.println(pr25.isMatch("ra.", "ray"));
        System.out.println(pr25.isMatch("ra.*", "raymond"));
        System.out.println(pr25.isMatch(".*at", "chat"));
        System.out.println(pr25.isMatch(".*at", "chats"));
    }
}
