package Letter_Combinations_of_a_Phone_Number;

import java.util.*;

public class App_17_1 {
    private static Map<Character, String> letters = new HashMap<>();


    public static void main(String[] args) {
        letters.put('2', "abc");
        letters.put('3', "def");
        letters.put('4', "ghi");
        letters.put('5', "jkl");
        letters.put('6', "mno");
        letters.put('7', "pqrs");
        letters.put('8', "tuv");
        letters.put('9', "wxyz");

        System.out.println(letterCombinations("235")) ;

    }
    public static List<String> letterCombinations(String digits) {

        Queue<String> queue = new LinkedList<>();

        if(digits == null || digits.length() == 0){
            return new ArrayList<String>();
        }

        String first = letters.get(digits.charAt(0));
        for(char ch : first.toCharArray()){
            queue.offer(String.valueOf(ch));
        }

        if(digits.length() == 1){
            return new ArrayList<String>(queue);
        }

        for(int i = 1; i < digits.length(); i++){//i=1
            String current = letters.get(digits.charAt(i));//"def"
            int size = queue.size();//3 ["a", "b", "c"]
            for(int j = 0; j < size; j++){
                String c = queue.poll();// "a"
                for(char ch : current.toCharArray()){//ch = d
                    String newString = c + ch;//"ad"
                    queue.offer(newString);
                }
            }
        }
        return new ArrayList<String>(queue);
    }
}
