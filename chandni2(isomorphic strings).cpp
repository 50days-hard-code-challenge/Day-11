class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int n=s.size();
        int m=t.size();
        if(n!=m){
            return false;
        }
        unordered_map<char,vector<int>>s1;
        unordered_map<char,vector<int>>s2;
      for(int i=0;i<n;i++) {
          s1[s[i]].push_back(i);
      }
      for(int j=0;j<m;j++){
          s2[t[j]].push_back(j);
      }
      for(int i=0;i<n;i++){
          if(s1[s[i]]!=s2[t[i]]){
              return false;
          }
      }
      return true;
    }
};
