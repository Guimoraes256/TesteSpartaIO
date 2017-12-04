package testes;

public class Teste_3 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10,4));
    }

    private static class Solution {

        public int solution(int N, int M) {
            int consumedChocolates = 0;
            int i = 0;
            boolean[] emptyChocolates = new boolean[N];
            while(!emptyChocolates[i]){
                emptyChocolates[i] = true;
                consumedChocolates++;
                i = i + M;
                if(i >= N){
                    i = i - N;
                }
            }
            
            return consumedChocolates;
        }

    }
}
