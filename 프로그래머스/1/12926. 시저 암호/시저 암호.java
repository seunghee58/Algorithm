class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] upperAlphabet = new char[26];
        for (int i=0; i<26; i++) {
            upperAlphabet[i] = (char)('A' + i);
        }
        
        char[] lowerAlphabet = new char[26];
        for (int i=0; i<26; i++) {
            lowerAlphabet[i] = (char)('a' + i);
        }
        
        
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int index = 0;
            
            if (ch == ' ') {
                answer += ' ';
                continue;
            }
            if (Character.isUpperCase(ch)) {
                index = ch - 'A';
            } else {
                index = ch - 'a';
            }
            
            
            index = (index + n) % 26;
            char password = ' ';
            
            if(Character.isUpperCase(ch)) {
                password = upperAlphabet[index];
            } else if (Character.isLowerCase(ch)) {
                password = lowerAlphabet[index];
            } else {
                password = ' ';
            }

            answer += password;
  
        }
        return answer;
    }
}