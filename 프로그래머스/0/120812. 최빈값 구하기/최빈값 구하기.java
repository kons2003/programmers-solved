import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        // 숫자별 빈도를 저장할 해쉬맵
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int mode = -1; // 최빈값 저장 변수
        int maxCount = 0; // 현재 최빈값 카운트
        boolean isDuplicate = false; // 중복 여부 체크

        // 최빈값 찾기
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                mode = num;
                isDuplicate = false;
            } else if (count == maxCount) {
                isDuplicate = true;
            }
        }

        return isDuplicate ? -1 : mode;
    }
}