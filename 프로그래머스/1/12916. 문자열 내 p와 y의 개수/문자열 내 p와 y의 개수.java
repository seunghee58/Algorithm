class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pcnt = 0;
        int ycnt = 0;
        
        String[] array = s.toLowerCase().split("");
        
        for (int i=0; i < array.length; i++) {
            if (array[i].equals("p")) {
                pcnt++;
            } else if (array[i].equals("y")) {
                ycnt++;
            }
        }
        if (pcnt == ycnt) {
            answer = true;
        } else {
            answer = false;
        }


        return answer;
    }
}