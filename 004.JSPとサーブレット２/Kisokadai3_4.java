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
public class Kisokadai3_4 {
    private static boolean type;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	String name = getName(" ");
	String birthday = getBirthday(" ");
	String profile  = getProfile(" ");
	
	//課題3-4追記　booleanメソッドを呼び出し
	boolean result = getResult(type);
	
	//各メソッドに引数を渡して戻ってきた戻り値を10回表示させるループ処理
	for (int num = 1; num  <= 10; num++){
	    System.out.println(name);
	    System.out.println(birthday);
	    System.out.println(profile);
	    
	    //trueを受け取れたらfalseを受け取れたらの条件分岐
	    if(result){
		System.out.println("この処理は正しく実行できました");
	    }else{
		System.out.println("正しく実行できませんでした");
	    }
	}
	
    }
    	
	
    //nameを仮引数に置いて戻り値を返す
    public static String getName(String name){
	return "穂積志音";
    }
    
    //birthdayを仮引数に置いて戻り値を返す
    public static String getBirthday(String birthday){
	return "1995年2月10日";
    }
    
    //profileを仮引数に置いて戻り値を返す
    public static String getProfile(String profile){
	return "バイクとゲームと煙草とバレーボールが好きです";
    }
    
    //課題3-4追記　booleanでメソッド定義してtrueを返却

    /**
     *
     * @param type
     * @return
     */
        public static boolean getResult(boolean type){
	return true;
    }
    
    
}
