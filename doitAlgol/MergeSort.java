package doitAlgol;

public class MergeSort{
    static int buff[];
    static void mergeSort(int[] a, int left, int right){
        if(left < right){
            int i;
            int center = (left+right) / 2;
            int p = 0;
            int j = 0;
            int k = left;



            mergeSort(a, left, center); // 앞부분 병합정렬
            mergeSort(a, center+1, right); // 뒷부분 병합정렬

            for(i = left; i<=center; i++)
                buff[p++] = a[i];

            while(i <= right && j<p)
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];

            while(j < p)
                a[k++] = buff[j++];

        }
    }
}
