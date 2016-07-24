package com.leon.main;

import com.leon.algorithm.SortImp;
import com.leon.utils.ArraysUtils;

public class Main {
	public static void main(String[] args) {
		int[] array=new int[]{7,6,5,4,3,2,1};
		System.out.println("-------直接插入排序--------");
		SortImp.straightInsertSort(array);
		ArraysUtils.printArrays(array);
		
		System.out.println("-------选择排序-------");
		SortImp.selectSort(array);
		ArraysUtils.printArrays(array);
		
		System.out.println("-------堆排序--------");
		SortImp.heapSort(array);
		ArraysUtils.printArrays(array);
		
		System.out.println("-------冒泡排序-------");
		SortImp.bubbleSort(array);;
		ArraysUtils.printArrays(array);
		
		System.out.println("-------冒泡排序_改进1-------");
		SortImp.bubbleSortPlus_1(array);
		ArraysUtils.printArrays(array);
		
		System.out.println("-------冒泡排序_改进2-------");
		SortImp.bubbleSortPlus_2(array);
		ArraysUtils.printArrays(array);
		
		System.out.println("-------快速排序-------");
		SortImp.quickSort(array, 0, array.length-1);
		ArraysUtils.printArrays(array);
	}
}
