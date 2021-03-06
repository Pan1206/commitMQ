package com.pan.al.order;

/**
 * 非基于比较的排序
 */
public class order1 {
    /**
     *  ①计数排序
     *    假定伟哥输入的元素都是在1~k之间的整数；
     *    思想：
     *        对于每个输入的元素X,确定小于x的元素个数，根据这个信息将x直接放在正确的位置
     */

    private static int[] countSort(int[] array,int k)
    {
        int[] C=new int[k+1];//构造C数组
        int length=array.length,sum=0;//获取A数组大小用于构造B数组
        int[] B=new int[length];//构造B数组
        for(int i=0;i<length;i++)
        {
            C[array[i]]+=1;// 统计A中各元素个数，存入C数组
        }
        for(int i=0;i<k+1;i++)//修改C数组
        {
            sum+=C[i];
            C[i]=sum;
        }
        for(int i=length-1;i>=0;i--)//遍历A数组，构造B数组
        {

            B[C[array[i]]-1]=array[i];//将A中该元素放到排序后数组B中指定的位置
            C[array[i]]--;//将C中该元素-1，方便存放下一个同样大小的元素

        }
        return B;//将排序好的数组返回，完成排序

    }


}
