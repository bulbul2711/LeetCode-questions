class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
//         int target[]=new int[index.length];
//         Arrays.fill(target,-1);
//         for(int i=0;i<nums.length;i++)
//         {
//             if(target[index[i]]==-1)
//             {
//             target[index[i]]=nums[i];
//             }
//             else
//             {
//                 int j=index[i];
//                 while(j!=-1)
//                 {
//                     target[j+1]=target[j];
//                 }
//                 target[index[i]]=nums[i];
//             }
//          }
//         return target;
// }
        ArrayList<Integer> a=new ArrayList();
for(int i=0;i<nums.length;i++){
a.add(index[i],nums[i]);
}
int output[]=new int[nums.length];
for(int i=0;i<nums.length;i++){
output[i]=a.get(i);
}
return output;
}
}
