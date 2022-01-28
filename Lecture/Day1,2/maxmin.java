class maxmin{
    public static void main(String[] args) {
        int[] intArray = {3, 27, 13, 8, 235, 7, 22, 9, 435, 31, 54};

        int min = 1000;
        int max = 0;
        for(int num: intArray) {
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        System.out.printf("min: %d, max: %d%n", min, max);
    
    }
}