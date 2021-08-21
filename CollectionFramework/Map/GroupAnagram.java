package CollectionFramework.Map;

import java.io.*;
import java.util.*;

class GroupAnagram {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
        System.out.println();
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution T = new  Solution();
	        
	        List <List<String>> ans = T.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    public List<List<String>> Anagrams(String[] string) {
        Map<String,List<String>> x=new HashMap<>();
        for(String s:string){
            char[] array=s.toCharArray();
            Arrays.sort(array);
            String sorted=new String(array);
            if(!x.containsKey(sorted)){
                x.put(sorted, new LinkedList<String>());
            }
            x.get(sorted).add(s);
        }
        return  new LinkedList<>(x.values());
    }
}
