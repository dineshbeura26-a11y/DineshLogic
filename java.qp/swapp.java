public class swapp {
    public static void main(Strint args[]){
        int arr1[]={10,20,30,40,50,};
        int langth=arr1.langth;
        int left=0;
        int right=langth-1;
        int temp;
        while(left<right)
        {
         temp=arr[left];
         arr[left]=arr[right];
         arr[right]=temp;
         left++;
         right--;
        }
        for(int i=0;i<langth;i++){
            System.out.print("Revers Arry is:"+arr[i]);
        }
    }
}
