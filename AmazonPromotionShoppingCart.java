package testing;

import java.util.List;

public class AmazonPromotionShoppingCart {
	/*Input to the function/method consists of two arguments:
	 * codeList, a string array of space-separated values representing the order and grouping of speciic 
	 * fruits that must be purchased in order to win the prize for the day
	 * Shopping cart, a list representing the order in which a customer purchases fruit
	 * Output: return an integer 1 if the customer is a winnder else return 0
	 * 
	 */
	public static int check(String[][] codeList, String[] shoppingCart) {
		
//		public static int foo(List<String> codeList, List<String> shoppingCart){
			
	if(codeList == null || codeList.length == 0) return 1;
	if(shoppingCart == null || shoppingCart.length == 0) return 0;
	int i = 0, j = 0;
	while (i < codeList.length && j + codeList[i].length <= shoppingCart.length) {
		boolean match = true;
		for(int k = 0; k < codeList[i].length; k++) {
			if(!codeList[i][k].equals("anything") && !shoppingCart[j +k].equals(codeList[i][k])){
				match = false;
				break;
			}
		}
		if(match) {
			j+= codeList[i].length;
			i++;
			
		}else {
			j++;
		}
		
	}
	return (i == codeList.length)?1:0;
	
	}


	public static void main(String[] args) {
		

	}

}
