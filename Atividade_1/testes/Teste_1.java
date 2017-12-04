package testes;

public class Teste_1 {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{2, 1, 1, 2, 3, 1}));
    }

    private static class Solution {

        public int solution(int[] A) {
            int i, distinctIntegers = 0;

            for (int j = 0; j < A.length; j++) {
                for (i = 0; i < j; i++) {
                    if (A[j] == A[i])
                        break;
                }
                if (i == j)
                    distinctIntegers++;
            }
            return distinctIntegers;
        }

    }
}
