/**
* This program swaps two values.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-09
*/

package question02;

public class SwapVals {
	/**
	   * This is the only method of this program. It swaps two values.
	   * @param args Arrays of arguments passed to the program (Not Used).
	   * @return void This method returns void.
	   */
	public static void main(String[] args) {
		int swapa = 1;
		int swapb = 2;
		int temp = 0;
		System.out.print(swapa+"");
		System.out.println(swapb);
		//swap values
		temp = swapa;
		swapa = swapb;
		swapb = temp;
		System.out.print(swapa+ "");
		System.out.println(swapb);
		
	}
}