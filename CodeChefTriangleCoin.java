package testing;

import java.util.Scanner;

public class CodeChefTriangleCoin {

	public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        long t=scn.nextLong();
        while(t-->0)
        {
            long n=scn.nextLong();
            solve(n);
        }
    }
    public static void solve(long n)
    {
        long ans=1;
        long lo=1;
        long high=n;
        while(lo<=high)
        {
            long mid=lo+(high-lo)/2;
            if(check(mid,n))
            {
                ans=Math.max(ans,mid);
                lo=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
    public static boolean check(long mid,long n)
    {
        return ((mid*(mid+1)/2))<=n;
    }
}
