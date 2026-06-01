class Solution {
    public void setZeroes(int[][] matrix) {
        int n =matrix.length;
        int m = matrix[0].length;

        int col0=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0){
                        matrix[0][j]=0;

                    }else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if (col0==0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }















    }
}    
        // int m =arr.length,n=arr[0].length;
        // boolean zeroRow=false;
        // boolean zeroCol=false;
        // for(int j=0;j<n;j++){
        //     if(arr[0][j]==0){
        //         zeroRow=true;
        //         break;
        //     }
        // }
        // for(int i=0;i<m;i++){
        //     if(arr[i][0]==0){
        //         zeroCol=true;
        //         break;
        //     }
        // }
        // for(int i=1;i<m;i++){
        //     for(int j=1;j<n;j++){
        //         if(arr[i][j]==0){
        //             arr[i][0]=0;
        //             arr[0][j]=0;
        //         }
        //     }
        // }
        //  for(int j=1;j<n;j++){
        //     if(arr[0][j]==0){
        //         for(int i=1;i<m;i++){
        //             arr[i][j]=0;
        //         }
        //     }
        //  }
        //   for(int i=1;i<m;i++){
        //     if(arr[i][0]==0){
        //         for(int j=1;j<n;j++){
        //             arr[i][j]=0;
        //         }
        //     }
        //   }
        //   if(zeroRow==true){
        //     for(int j=0;j<n;j++){
        //         arr[0][j]=0;
        //     }
        //   }
        //    if(zeroCol==true){
        //     for(int i=0;i<m;i++){
        //         arr[i][0]=0;
        //     }
        //   }     
//     }
// }