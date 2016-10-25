/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsikou1_kadai;

/**
 *
 * @author Shion
 */
public class Bike {
    
    public String maker = "";
    public Integer displacement = 0;
    
    
    //追記分　課題4　コンストラクタの設定
    Bike (){
	this.maker = "HONDA";
	this.displacement = 400;
    }
    
    //2つの変数に値を設定するパブリックなメソッド
    public void setBike(String make, Integer dis){
	maker = make;
	displacement = dis;
    }
    
    
    //2つの変数の中身をprintするパブリックなメソッド
    public void getBike(){
	    System.out.println(maker + displacement);
	}
}