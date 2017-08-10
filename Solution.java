
import java.util.*;

class Solution {
    
    int top = 0;
    static ArrayList<Integer> a = new ArrayList<Integer>();
    
    public int pop()
    {
        int e = empty(); 
        if(e == 1)
        {
            return 0;
        }
        top = top - 1;
        return a.get(a.size()-1); 
    }
    public int empty()
    {
        if(top == 0)
        {
        	return 1; 
        }
        else return 0;
    }
    public void push(int v)
    {
       a.add(v);
       top = top + 1;
    }
    
    
    public static void main(String args[] ) {
        
    Solution tc = new Solution();    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int q = 0;
    for(int i = 0; i < n; i++)
    {
    	q = scan.nextInt(); 
    if(q == 1) 
    {
        int rate = tc.pop();
        if(rate == 0)
        {
            System.out.println("No Food");
        }
        else {
            System.out.println(rate);
            a.remove(a.size() - 1);
    }}
    if(q == 2)
    {
        int value = scan.nextInt();
        tc.push(value);
    }
    }
    }
}
