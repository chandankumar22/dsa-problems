// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int inpArr[], int n) {
        // code here
        int duplicate = 0;
		for(int i=0;i<n;i++){
			if(inpArr[Math.abs(inpArr[i])-1]<0){
				duplicate = Math.abs(inpArr[i]); 
			}
			else  inpArr[Math.abs(inpArr[i])-1] = inpArr[Math.abs(inpArr[i])-1]*-1;
		}
			int missing=-111;
		for(int i=0;i<n;i++){
		    if(inpArr[i]>0){
		        missing = i+1;
		        break;
		    }
		}
		return new int[]{duplicate,missing};
    }
}