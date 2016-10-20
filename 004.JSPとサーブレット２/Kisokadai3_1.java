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
public class Kisokadai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	String name = getName(" ");
	String birthday = getBirthday(" ");
	String profile  = getProfile(" ");
	
	//各メソッドに引数を渡して戻ってきた戻り値を10回表示させるループ処理
	for (int num = 1; num  <= 10; num++){
	    System.out.println(name);
	    System.out.println(birthday);
	    System.out.println(profile);
	}
	
    }
    	
	
    //nameを仮引数に置いて戻り値を返す
    static String getName(String name){
	return "穂積志音";
    }
    
    //birthdayを仮引数に置いて戻り値を返す
    static String getBirthday(String birthday){
	return "1995年2月10日";
    }
    
    //profileを仮引数に置いて戻り値を返す
    static String getProfile(String profile){
	return "バイクとゲームと煙草とバレーボールが好きです";
    }
}
