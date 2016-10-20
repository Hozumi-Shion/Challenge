/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kisokadai3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Shion
 */
public class Kisokadai3_6 {

    /**
     * @param args the command line arguments
     */
    
    //引数として渡したID番号のプロフィールを呼び出して表示する
    public static void main(String[] args) {

	System.out.println(Profile(99));
    }
//ID番号で呼び出さなきゃいけない
	
	  
    public static ArrayList<String> Profile(int number){
	
	HashMap<Integer, ArrayList<String>> bangou = new HashMap<Integer, ArrayList<String>>();

	ArrayList<String> profile1 = new ArrayList<String>();
	
	 
	profile1.add("ゴン=フリークス");		//インデックス番号0
	profile1.add("5月5日");			//1
	profile1.add("くじら島");		//2
	
	ArrayList<String> profile2 = new ArrayList<String>();

	profile2.add("キルア=ゾルディック");	//3
	profile2.add("8月8日");			//4
	profile2.add("パドキア共和国");		//5
	
	ArrayList<String> profile3 = new ArrayList<String>();

	profile3.add("レオリオ=パラディナイト");	//6
	profile3.add("4月4日");			//7
	profile3.add("不明");			//8
	
	  bangou.put(405, profile1);
	  bangou.put(99, profile2);
	  bangou.put(403, profile3);

	  for (Map.Entry<Integer, ArrayList<String>> search : bangou.entrySet()){
		if (number == search.getKey()){
		    return search.getValue();
		}
		
	  }
	  return null;
    }
}
