class Solution {
        public int solution(int[] num_list) {
            int answer = 0;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 == 1) {
                    sb.append(num_list[i]);
                } else {
                    sb2.append(num_list[i]);
                }
            }

            answer = Integer.parseInt(sb.toString()) + Integer.parseInt(sb2.toString());

            return answer;
        }
    }