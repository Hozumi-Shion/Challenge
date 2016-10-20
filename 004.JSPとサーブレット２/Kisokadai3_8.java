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
public class Kisokadai3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Profile();
    }
    
        public static void Profile(){
	
	HashMap<Integer, ArrayList<String>> bangou = new HashMap<Integer, ArrayList<String>>();

	ArrayList<String> profile1 = new ArrayList<String>();
	
	 
	profile1.add("ゴン=フリークス");		//profile　1　のArrayListのインデックス番号0
	profile1.add("5月5日");		//1
	profile1.add("くじら島");		//2
	
	ArrayList<String> profile2 = new ArrayList<String>();

	profile2.add("キルア=ゾルディック");	//profile　2　のArrayListのインデックス番号0
	profile2.add("8月8日");		//1
	profile2.add(null);		//2
	
	ArrayList<String> profile3 = new ArrayList<String>();  //profile3(レオリオのデータ)をArrayListで宣言

	profile3.add("レオリオ=パラディナイト");	//profile　3　のArrayListのインデックス番号0
	profile3.add("4月4日");		//1
	profile3.add("不明");			//2
	
	  
	//HashMapの変数bangouの中に格納する<Integer型のID,ArrayList内のString型の各profile>
	  bangou.put(405, profile1);
	  bangou.put(99, profile2);
	  bangou.put(403, profile3);

	  Integer limit = 2;		//この回数ループしたらbreakする回数の変数の初期化宣言
	  int count = 1;		//ループの回数をカウントする変数の初期化宣言
	  
	  for (Map.Entry<Integer, ArrayList<String>> search : bangou.entrySet()){
	      //(Map.Entry<Keyの型,Valueの型> 変数 : Mapの変数.entrySet())
	
	      
	      for (String  a : search.getValue()){
		  if(a == null){
		      continue;
		  }
		  
		    System.out.println(a);
		
		    count++;
		
		    if(count == limit){
			break;
		}
	  }
    }
    
}
}
