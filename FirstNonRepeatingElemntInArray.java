class  FirstNonRepeatingElemntInArray{
    public static int firstNonRepeating(int arr[],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            int j;
            for(j=0;j<n;j++)
                if(i!=j && arr[i]==arr[j])
                    break;
            if(j==n)
            {
                return arr[i];
            }
        }
            return -1;
    }
    public static void main(String[] args) {
         int arr[] = { 9, 4, 9, 2, 7, 4 };
        int n = arr.length;
        int m=0;
 
        System.out.print(firstNonRepeating(arr, n,m));
    }
}
/*
Output : 2*/
