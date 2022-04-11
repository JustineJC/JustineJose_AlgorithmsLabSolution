package com.transaction.model;

public class mergeSort {
    public void merge(int arr[], int first,int mid, int last){
        int leftLength = mid - first + 1;
        int rightLength = last - mid;
        int leftArray[] = new int[leftLength];
        int rightArray[] = new int[rightLength];
        
        // populate array left and right
        for(int i=0;i<leftLength;i++)
        leftArray[i] = arr[first + i];
        for(int j=0;j<rightLength;j++)
        rightArray[j]= arr[mid + 1 + j];

        int i=0,j=0,k=first;
        while(i<leftLength && j<rightLength){
            if(leftArray[i]<=rightArray[j]){
            arr[k]=leftArray[i];
            i++;}
            else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }
        // remaining values in the are pushed to new array
        while(i<leftLength){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<rightLength){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }

     public void divideSort(int arr[],int first,int last){
       
        if(first<last){//check if the array is empty
        
        int midIndex = first+(last-first) / 2; // middle location of the array, halfed array location
        
        //divide the array Recursively into sub array until each array size is reduced to 1

       divideSort(arr,first,midIndex);
       divideSort(arr,midIndex+1,last);
        
        //Merging the left and right array
        merge(arr,first,midIndex,last);
        }
    }

    public void printArray(int[] A){
        int n = A.length;
        for(int i=0;i<n;i++)
        System.out.printf(A[i]+" ");
    }
}
