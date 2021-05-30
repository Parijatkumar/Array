import java.util.*;
class week2_prog1{

public static void main(String args[]){

      Scanner scan=new Scanner(System.in);
      System.out.println("Number of elements");
          int size=scan.nextInt();
          int revnum=0;
   int arr2[]=new int[size];
   int arr1[]=new int[size];
   for(int i=0;i<size;i++){     //taking the array 25 46 123 702 16
		arr1[i]=scan.nextInt();
		//System.out.println("The array value is "+arr1[i]);
    	}
    	arr2=arr1;
    	for(int i=0;i<size;i++){

			System.out.println("The content of array 2 is "+arr2[i]);
		}

System.out.println("content of the two arrays");
    for(int i=0;i<size;i++){
        revnum=0;

		while(arr2[i]>0)
		  {
		revnum=((revnum*10)+(arr2[i]%10));
	     arr2[i]=arr2[i]/10;
		  }
		System.out.println(" The reverse is " +revnum);
	}

}
}
