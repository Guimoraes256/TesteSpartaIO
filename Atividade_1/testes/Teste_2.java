package testes;

public class Teste_2 {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    private static class Solution {

        public int solution(int[] A) {
            int pairCount, number = 0;

            for (int i = 0; i < A.length; i++) {
                if (A[i] == 0) {
                    continue;
                }
                pairCount = 0;
                number = A[i];
                for (int j = i; j < A.length; j++) {
                    if (A[j] == 0) {
                        continue;
                    }
                    if (number == A[j]) {
                        pairCount++;
                        A[j] = 0;
                    }
                }
                if (pairCount % 2 == 1) {
                    break;
                }
            }

            return number;
        }

    }
}
