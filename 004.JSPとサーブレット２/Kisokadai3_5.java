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
public class Kisokadai3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	 System.out.println("名前:" + getName());
	 System.out.println("生年月日:" + getBirthday());
	 System.out.println("住所:" + getAddress());
    }
    
    //ID番号、名前、生年月日、住所を返却するメソッド
    public static int Number(){
	return 35;
    }
	
    public static String getName(){
	return "星飛雄馬";
    }
    
    public static String getBirthday(){
	return "1980年8月1日";
    }
    
    public static String getAddress(){
	return "東京都新宿区歌舞伎町1-1-1";
    }
    
    
    
    
}
