import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
  
        ArrayList<Integer> list = new ArrayList<>();
        // 배열과 달리 크기를 미리 정하지 않아도 됨, 배열의 크기가 정확히 예측되지 않는 상황에서 사용
        
        for (int i=1; i < arr.length; i++) { // 0으로 초기화하면 첫번째 원소가 저장되지 않음
                if (arr[i] == arr[i-1]) {
                    continue;
                } else 
                    list.add(arr[i-1]);           
            }
        
        list.add(arr[arr.length-1]);
        
        int[] answer = new int[list.size()];
        
        for (int i=0; i < answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}


// 접근 : 배열의 각 인덱스 검사 -> 반복문으로 비교하여 같다면 출력 x, 다르다면 출력 o