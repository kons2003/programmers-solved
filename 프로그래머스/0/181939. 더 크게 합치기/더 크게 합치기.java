class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        int aLength = (int) (Math.log10(a) + 1);
        int bLength = (int) (Math.log10(b) + 1);

        int result1 = a + b * (int) Math.pow(10, aLength);
        int result2 = b + a * (int) Math.pow(10, bLength);

        if (result1 > result2) {
            answer = result1;
        } else {
            answer = result2;
        }

        return answer;
    }
}