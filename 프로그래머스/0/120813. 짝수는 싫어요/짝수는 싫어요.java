import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int[] answer = IntStream.rangeClosed(1, n)
                .filter(m -> m % 2 != 0)
                .toArray();
        return answer;
    }
}