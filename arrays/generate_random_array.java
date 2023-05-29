public static int[] generate_random_array(int max, int min, int n){
        Random random = new Random();
        int temp_arr[] = new int[n];
        for(int i=0; i<n; i++){
            temp_arr[i] = random.nextInt(max + min) - min;
        }
        return temp_arr;
}
