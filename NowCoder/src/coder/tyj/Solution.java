package coder.tyj;

public class Solution {
	 public boolean Find(int target, int [][] array) {
         int i = array.length;//��ά����length Ĭ��������
         for(int j = 0; j < i;j++){  //����ÿ����Ԫ��
             if(array[j][0]>target){  //�ҵ���һ����Ŀ������
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


