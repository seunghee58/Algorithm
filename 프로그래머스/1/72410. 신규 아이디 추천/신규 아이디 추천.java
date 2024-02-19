class Solution {
    public String solution(String new_id) {
        
        // 1단계
        new_id = new_id.toLowerCase();
        
        // 2단계
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < new_id.length(); i++){
            char ch = new_id.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                sb.append(ch);
            } else if (ch >= '0' && ch <= '9'){
                sb.append(ch);
            } else if (ch == '-' || ch == '_' || ch == '.') {
                sb.append(ch);
            } else {
                continue;
            }
        }
        
        // 3단계
        String temp = sb.toString();
        sb = new StringBuilder();
        for (int i=0; i < temp.length(); i++){
            char ch = temp.charAt(i);
            if (ch == '.' && i > 0 && temp.charAt(i-1)=='.'){
                continue;
            }
            sb.append(ch);
        }
        
        // 4단계
        temp = sb.toString();
        if (temp.length() > 0 && temp.charAt(0) == '.'){
            temp = temp.substring(1);
        }
        if (temp.length() > 0 && temp.charAt(temp.length()-1) == '.') {
            temp = temp.substring(0, temp.length()-1);
        }
        
        // 5단계
        if (temp.length() == 0){
            temp = "a";
        }
        
        // 6단계
        if (temp.length() > 15) {
            temp = temp.substring(0, 15);     
        }
        if (temp.charAt(temp.length()-1) == '.') {
            temp = temp.substring(0, temp.length()-1);
        }
        
        // 7단계
        if (temp.length() <= 2){
            char last = temp.charAt(temp.length() - 1);
            while (temp.length() < 3) {
                temp += last;
            }
        }
        return temp;
    }
}