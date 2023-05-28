public static int find_min(int ar[], int i, int j){
        if(ar[i]>ar[j]){
            return ar[j];
        }
        else{
            return ar[i];
        }
}
