public static int find_max(int ar[], int i, int j){
        if(ar[i]<ar[j]){
            return ar[j];
        }
        else{
            return ar[i];
        }
}
