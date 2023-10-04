class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int n=strs.size();
        int minsize=1000;
        string str="";
        for(int i=0;i<n;i++){
            int size=strs[i].size();
            if(size<minsize){
                minsize=size;
            } 
        }

        for(int j=0;j<minsize;j++ ){
            char c =strs[0][j];
            for(int k=1;k<n;k++){
              if(strs[k][j]!=c){
                  return str;
              }
            }
                  str=str+c;
            
        }
            return str;

        
    }  
    
};
