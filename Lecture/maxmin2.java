public class maxmin2 {
    public static void main(String[] args) {
        int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : intArray){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.println("min: "+min+ " max: "+max);


       
    }
}
