class Solution {
    public int solution(int n) {
        
        String num = "";
        
        while (n > 0) {
            num += n%3;
            n/=3;
        }
        
        return Integer.parseInt(num, 3);
    }
}



// 접근 : n을 3진법 숫자로 바꾸기 -> 리버스 -> 10진법으로 출력
