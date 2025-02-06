class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int j = n / i;
                if (i <= j) {
                answer++;
                }
                if (i == j) {
                count++;
                }
            }
        }
        return answer * 2 - count;
    }
}