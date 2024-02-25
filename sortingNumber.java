public class Main {
    
    public static void main(String [] args){

       int [] intial={2,0,13,1,0,4};
       int n=intial.length-1;
       int a=intial.length;
      
       while(a>0){
           for(int i=n;i>0;i--)
           {
               if(intial[i]==0){
                   intial[i]=intial[i];
               }
               else if(intial[i]>0 && intial[i-1]==0){

                   int temp=intial[i];
                   intial[i]=intial[i-1];
                   intial[i-1]=temp;


               }
       
           }
           a=a-1;
   
       }
    
    for(int i=0;i<=n;i++){

       System.out.print(intial[i]);
   }
   }

}
   
