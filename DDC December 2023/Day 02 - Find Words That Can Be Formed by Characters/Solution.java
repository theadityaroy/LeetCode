// Problem Link : https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/description/

public class Solution {
    public int countCharacters(String[] words, String chars) {
        int countWord = 0;

        int[] charCount = new int[26];
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (String str : words) {
            if (canFormWord(str, charCount.clone())) {
                countWord += str.length();
            }
        }

        return countWord;
    }

    private boolean canFormWord(String word, int[] charCount) {
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (charCount[index] == 0) {
                return false;
            } else {
                charCount[index]--;
            }
        }
        return true;
    }

    // Ignore this main class
    public static void main(String[] args) {
        
    }
}