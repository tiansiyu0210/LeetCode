package Letter_Combinations_of_a_Phone_Number;

import java.util.*;

public class App_17_1 {
    private Map<Character, String> letters = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");

    public List<String> letterCombinations(String digits) {
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
