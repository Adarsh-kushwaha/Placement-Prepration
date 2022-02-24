// You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

// The ith item is said to match the rule if one of the following is true:

// ruleKey == "type" and ruleValue == typei.
// ruleKey == "color" and ruleValue == colori.
// ruleKey == "name" and ruleValue == namei.
// Return the number of items that match the given rule.


package Array;
import Array.List;

public class MatchingRule {
    public static void main(String[] args) {
        
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = 0;
        if(ruleKey.equals("name")){
            index = 1;
        }

        if(ruleKey.equals("color")){
            index = 2;
        }
        // for(List<String> item : items) {
        //     if(item.get(index).equals(ruleValue))
        //         count++;
        // }
        

        return count;
    }
}
