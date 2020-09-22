class arrayC{
static int counter=0;
static int total=0;
        public static void main (String args[]){
                     int a[] = {1,2,3};
                     int b[] = {1,2,3,44,55};
                     int c[] = {1,2,3};
                     int arr[] [] = new int [3] [];
                     arr [0] =a;
                     arr [1] =b;
                     arr [2] =c;

                     for (int ar [] : arr ){
total=0;
counter++;

 for(int e : ar){

 System.out.println(""+e);
total++;
}

System.out.println("no of element in this one-d array array="+total);
                                      System.out.print(" ");
                                    }

System.out.println("no of one d array="+counter);
                  

}

}
                                                              
                     