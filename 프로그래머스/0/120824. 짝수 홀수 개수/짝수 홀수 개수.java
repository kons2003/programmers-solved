import java.util.Arrays;

class Solution {
    public long[] solution(int[] num_list) {
        long even = Arrays.stream(num_list)
                .filter(num -> num % 2 == 0)
                .count();
        long odd = num_list.length - even;
        long[] answer = {even, odd};
        return answer;
    }
}