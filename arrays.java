package Basic.programming_java;

import java.util.*;

public class arrays {

 public  static  void update(int marks[]){
  for(int i=0;i<marks.length;i++){
   marks[i]=marks[i]+1;
  }
 }

 public  static  void printArray(int marks[]){
  for(int i=0;i<marks.length;i++){
   System.out.print(marks[i] +" Marks  ");
  }
  System.out.println();
 }

 // Linear Search
 //Find  the index of element in a given array
 public  static int linearSearch(int numbers[],int key){
   for (int i=0;i<numbers.length;i++) {
    if (numbers[i] == key) {
     return i;
    }

   }
   return -1;
 }

 // Largest Numbers in Array
 public  static  int largestNumber(int num[]){
  int largest=Integer.MIN_VALUE; // -infinity
  for(int i=0;i<num.length;i++){
   if(num[i] >largest){
    largest=num[i];
   }
  }
  return largest;
 }

 // Binary Search in Array
 // Pre requisite - sorted Arrays
 public static  int binarySearch(int num[],int key){
  int start=0;
  int end=num.length-1;
  while(start <=end){
   int mid=(start+end)/2;

   //comparisons
   if(num[mid]==key){
    return mid;
   }
   if(num[mid]<key){
    start=mid+1;
   }
   else{
    end=mid-1;
   }
  }
  return -1;
 }

 //Reverse an Array
 public  static  void ReverseArray(int num[]){
  int first=0;
  int last=num.length-1;
  while(first <last){
   int temp=num[last];
   num[last]=num[first];
   num[first]=temp;
   first++;
   last --;
  }
 }

 // Paris in an Array
 public static void pairsArray(int num[]){
  for(int i=0;i<num.length;i++){
   int curr=num[i]; // 2,3 4 5
   for(int j=i+1;j<num.length;j++){
    System.out.print("(" +curr + ","+num[j] + ")");
   }
   System.out.println();
  }
 }

 // Sub Array - continuous part of array
 public static void subArray(int num[]){
  int ts=0;
      for (int i=0;i<num.length;i++){
       int start=i;
       for(int j=i;j<num.length;j++){
         int end=j;
        System.out.println("emd"+end);
         for(int k=start; k<=end;k++){
          System.out.print(num[k]+" ");
         }
         ts++;
        System.out.println();
       }
       System.out.println();

      }
  System.out.println("Toatl sub array "+ts);
 }

 // Max sub Array Sum
 public static void sumSubArraySum(int num[]){
  int currSum=0;
  int maxSum=Integer.MIN_VALUE;
  for (int i=0;i<num.length;i++){
   int start=i;
   for(int j=i;j<num.length;j++){
    int end=j;
    currSum=0;
    for(int k=start; k<=end;k++){
      currSum+=num[k];
    }
    System.out.println(currSum);
    if(maxSum <currSum){
     maxSum=currSum;
    }
   }
  }
  System.out.println("Max sum = "+maxSum);

 }

 public  static  void sumSubArrayPrefixArray(int num[]){
  int currSum=0;
  int maxSum=Integer.MIN_VALUE;
  int prefix[]=new int[num.length];

  prefix[0]=num[0];
  // Calculate prefix array
  for(int i=1;i<prefix.length;i++){
   prefix[i]=prefix[i-1]+num[i];
  }
  for (int i=0;i<num.length;i++){
   int start=i;
   for(int j=i;j<num.length;j++){
    int end=j;
    currSum=start==0? prefix[end]:prefix[end]-prefix[start-1];

    if(maxSum <currSum){
     maxSum=currSum;
    }
   }
  }
  System.out.println("Max sum = "+maxSum);

 }

 public static void sumSubArrayKadaneAlo(int num[]){
int ms=Integer.MIN_VALUE;
int cs=0;
for (int i=0;i<num.length;i++){
 cs=cs+num[i];
 if(cs<0){
  cs=0;
 }
 ms=Math.max(cs,ms);
}
  System.out.println("Our max sub array sum is : "+ms);
 }



 // Trapping Rain water
 public static int TrappedRainWater(int height[]){
  int n=height.length;
  // Calculate left max boundary - array
  int leftMax[]=new int[n];
  leftMax[0]=height[0];

  for(int i=1;i<n;i++){
   leftMax[i]=Math.max(height[i],leftMax[i-1]);
  }
  // Calculate right max boundary -array
  int rightMax[]=new int[n];
  rightMax[n-1]=height[n-1];
  for(int i=n-2;i>=0;i--){
   rightMax[i]=Math.max(height[i],rightMax[i+1]);
  }

  int trappedWater=0;

  //loop
  for(int i=0;i<n;i++){
   // water level = min(leftmax bound , rightmax bound)
   int waterLevel=Math.min(leftMax[i],rightMax[i]);

   // trapped water = water level - height[i]
   trappedWater+=waterLevel-height[i];

  }
  return trappedWater;


 }


// Buy and Sell stocks
 public static  int bug_and_sell_max_profit(int stock[]){
    int buyprice=Integer.MAX_VALUE;
    int maxprofit=0;

    for(int i=0;i<stock.length;i++){
     if(buyprice < stock[i]){
      int profit=stock[i] - buyprice; // today profit
      maxprofit=Math.max(maxprofit,profit) ; // golbal profit
     }else{
      buyprice=stock[i];
     }
    }
    return maxprofit;
 }




 public static void main(String args[]){
  // List of elements of the same type placed in a contiguous memory location
  // create , input , output , update
  // Create ---  datatype arrayName[] = new dataType[size]

//  int arr[]=new int[50];
//
//  int num[]={1,2,3,4};
//
//  String fruits[]={"apple","mango","orange"};


  System.out.println("Print Array");
  Scanner sc=new Scanner(System.in);
//  int marks[]= new int[100];
//  marks[0]=sc.nextInt();
//  marks[1]=sc.nextInt();
//  marks[2]=sc.nextInt();
//
//  System.out.println("Print Array--2");
//
//  System.out.println("Phy : "+marks[0]);
//
//  System.out.println("Phy : "+marks[1]);
//
//  System.out.println("Phy : "+marks[2]);
//
//  marks[2]=marks[2]+1;
//
//  System.out.println("Phy : "+marks[2]);


//  int num[]={60,50,40};
//  update(num);
//  printArray(num);



  // Linear Search
  System.out.println("Linear Search");
  int numbers[]={2,3,4,5,6};
  int key =10;
  int index=linearSearch(numbers,key);
  if(index==-1){
   System.out.println("Key is not present");
  }else {
   System.out.println("Key is present ");
  }

  // Largest Number in Array
  int number[]={3,4,5,9,50,40};
  int largest=largestNumber(number);
  System.out.println("Largest--->"+largest);

  // Binary search in Array
  int numb[]={2,3,4,5,6};
  int key1 =5;
  System.out.println("Binary serach elements "+binarySearch(numb,key1));

  // Reverse an Array
  int rev[]={2,5,6,7,8,9};
  ReverseArray(rev);
  printArray(rev);

  // Pairs an Array
  int pair[]={2,4,5,6,7};
  pairsArray(pair);

  // Print subarray
  int sub[]={3,4,5,5,6,7,8,9};
  subArray(sub);
  sumSubArraySum(sub);
  sumSubArrayPrefixArray(sub);

  int kd[]={-2,-3,4,-1,-2,1,5,-3};
  System.out.println("Kadane Algo");
  sumSubArrayKadaneAlo(kd);

  // Trapping Rain water
  int height[]={4,2,0,6,3,2,5};
  System.out.println(TrappedRainWater(height));

  // Buy and sell stocks
  int stock[]={7,1,5,3,6,4};
  System.out.println(bug_and_sell_max_profit(stock));





 }
}
