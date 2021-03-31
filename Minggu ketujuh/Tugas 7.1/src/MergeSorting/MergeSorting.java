
package MergeSorting;

public class MergeSorting {

      private void Merge(int data[], int left, int middle, int right){
              int[] temp = new int[data.length];
              for(int i = 0; i <= right; i++){
                  temp[i] = data[i];
              }
              int a = left;
              int b = middle +1;
              int c = left;
              
              while(a <= middle && b<= right){
                  if(temp[a] <= temp[b]){
                      data[c] = temp[a];
                      a++;
                  } else {
                      data[c] = temp[b];
                      b++;
                  } 
                  c++;
              }
              int s = middle - a;
              for(int i = 0; i <= s; i++){
                  data[c + 1] = temp [a + 1];
              }
          }
      
      
      }
  

