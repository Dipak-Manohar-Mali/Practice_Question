public class DuplicateElement{

     public static void main(String []args){
        int arr[]=new int[]{2,1,2,4,6,6};
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
     }
}