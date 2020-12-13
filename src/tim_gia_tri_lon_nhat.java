public class tim_gia_tri_lon_nhat {
    public static void main(String[] args) {
        int[] arr = {100,90,26,95,10,34,63};
        int index=1;
        int maxValue = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (maxValue < arr[i]){
                maxValue = arr[i];
                index = i + 1;
            }
        }
        System.out.println("Gia tri lon nhat trong ma la: " + maxValue + " tai vi tri: " + index);
    }
}
