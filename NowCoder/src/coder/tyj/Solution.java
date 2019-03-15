package coder.tyj;

public class Solution {
	 public boolean Find(int target, int [][] array) {
         int i = array.length;//二维数组length 默认是列数
         for(int j = 0; j < i;j++){  //遍历每列首元素
             if(array[j][0]>target){  //找到第一个比目标大的数
                     for(int k =0;k< array[j-1].length;k++ ){
                             if(array[j-1][k] == target){
                               return true;      
                             }
                     }
             }
         }
      return false;
        
  }
}


