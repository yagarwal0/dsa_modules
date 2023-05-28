public static int[] generate_random_array(int range, int n){
        Random random = new Random();
        int temp_arr[] = new int[n];
        for(int i=0; i<n; i++){
            temp_arr[i] = random.nextInt(range);
        }
        return temp_arr;
}
