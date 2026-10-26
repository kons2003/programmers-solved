class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder answer = new StringBuilder(my_string);

        int end = s + overwrite_string.length();

        answer.replace(s, end, overwrite_string);

        return answer.toString();
    }
}