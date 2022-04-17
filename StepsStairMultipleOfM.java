package testing;

public class StepsStairMultipleOfM {
	//Your friend Misha wants to climb a staircase consisting of n stairs
	//In one step she ccan either climb one or two stairs
	//But Misha wants the total number of steps taken at the end
	//of the staircase to be divisible by a number m
	
	// What is the minimum number of steps she would need to take to climb
	//the staircase while satisfying the above-mentioned condition?
	
	//Input: The first line of input contains an integer n
	//The second line of input contains an integer m.
	
	//scratch paper:
	/*
	 * if n = 4 & m = 3 return 3 (1, 1, 2)
	 * if n = 5 & m = 3 return 3 (1, 2, 2)
	 * if n = 6 & m = 3 return 3 (2, 2, 2)
	 * if n = 7 & m = 3 return 6(1, 1, 1, 1, 1, 2)
	 * this continues to n = 12 (2, 2, 2, 2, 2, 2)
	 * if n = 13 & n = 3 return 9 (1, 1, 1, 1, 1, 2, 2, 2, 2)
	 * cont to 18
	 * if n = 19 & n = 3, return 12(7 2s, 8 1s)
	 * cont to 24
	 * if n = 24 & n = 3, return 12(12 2s)
	 * if n = 25 & n =3 return 15 (10 2s, 15 1s)
	 * answer is floor(n/(n*2)) +1) *  m ? nope
	 * Another approach then
	 * in m steps, one coves between m and m*2 stairs. Call this a set
	 *We want as few sets as possible to reach n
	 *first n must be equal to or greater than m or we return -1 Otherwise if
	 *n<m*2return 1
	 *third get n/m*2 big sets and n%(m*2) remanider
	 *if remainder is 0 retrun big set *m
	 *if remainder is non zero then add one more set to split the axcess between them 
	 */
public static int solve(int n, int m) {
	//There are not enough steps 
	if (m> n) {
		return -1;
	}
	else {
		return ((n/(m*2))+1)*m;
		
		}
	}
public static int solve2(int n, int m) {
	int result = 0;
	if(m>n) {
		return -1;
	}
	else {
	int bigSets = n/(m*2);
	int remainder = n%(m*2);
	
	if(remainder == 0) {
	result = (bigSets)*m;}
	else {result = (bigSets+1)*m;}}

return result;}
		
//return (bigSets+1)*m;}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(10, 2));
		System.out.println(solve(3, 5));
		System.out.println(solve(100, 7));
		System.out.println(solve(13,3));
		System.out.println(solve2(10, 2));
		System.out.println(solve2(3, 5));
		System.out.println(solve2(100, 7));
		System.out.println(solve2(13,3));
	}

}
