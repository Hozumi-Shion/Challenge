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
public class Kisokadai3_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Profile();
    }
    
    
    //ID番号で呼び出さなきゃいけない
	
	  
    public static void Profile(){
	
	HashMap<Integer, ArrayList<String>> bangou = new HashMap<Integer, ArrayList<String>>();

	ArrayList<String> profile1 = new ArrayList<String>();
	
	 
	profile1.add("ゴン=フリークス");		//インデックス番号0
	profile1.add("5月5日");			//1
	profile1.add("くじら島");		//2
	
	ArrayList<String> profile2 = new ArrayList<String>();

	profile2.add("キルア=ゾルディック");	//0
	profile2.add("8月8日");			//1
	profile2.add("パドキア共和国");		//2
	
	ArrayList<String> profile3 = new ArrayList<String>();

	profile3.add("レオリオ=パラディナイト");	//0
	profile3.add("4月4日");			//1
	profile3.add(null);			//2
	
	  bangou.put(405, profile1);
	  bangou.put(99, profile2);
	  bangou.put(403, profile3);

	  for (Map.Entry<Integer, ArrayList<String>> search : bangou.entrySet()){
		if (search.getValue().get(2) == null){
		     continue;
		    }
		System.out.println(search.getValue());
	  }
    }
    
}
