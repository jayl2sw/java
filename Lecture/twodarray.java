public class twodarray{
    public static void main(String[] args) {
        int[][] grid = {
            {2, 3, 1, 4, 7}, {8, 13, 3, 33, 1},
            {7, 4, 5, 80, 12}, {17, 9, 11, 5, 4},
            {4, 5, 91, 27, 7}
        };
        int count = 0;
        int sum = 0;
        for(int[] row: grid){
            for (int num:row){
                if (num%3 == 0){
                    count++;
                    sum += num;
                }
            }
        }
        System.out.println("개수: "+count+" 총합: " + sum);
    }
}
