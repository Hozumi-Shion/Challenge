/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kisokadai3;

/**
 *
 * @author Shion
 */
public class Kisokadai3_2 {

    /**
     * @param args the command line arguments
     */
    public  static void main(String[] args) {
	int Number = 133;
	if(isEven(Number)){
			 System.out.println(Number + "は偶数です");
		              }else{
			 System.out.println(Number +  "は奇数です" );
		              }
    }
    
    
    public static boolean isEven(int num){
	return num % 2 == 0;
    }
    
}
