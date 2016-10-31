/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author Shion
 */

//DealerクラスとUserクラス両方に共通する部分の処理を書いてある抽象クラス
public abstract class Human {

    //myCardsというArrayList型のフィールド変数
    protected ArrayList<Integer> myCards = new ArrayList<>();

    //myCardsに手札にあるカードの情報を（ArrayListで受けたカード情報を）追加する（addする）
    public abstract void setCard(ArrayList<Integer> cards );
    
    //myCardsの手札にあるカードがJ,Q,Kだった時、それをチェックして10に変換する
    public abstract void checkCards();
    
    //myCardsの手札にあるカードでA（１）があるとき、手札の合計値を計算して1と認識するか11と認識するか判断するメソッド
    public abstract void aceCheck();

    //myCardsを確認してカードが必要ならtrue、必要なければfalseを返却する
    public abstract boolean checkSum();

    //myCardsの合計値の返却
    public abstract Integer open();

    //バストの処理（Openした時の合計値が22以上の時、そのプレイヤーはバストする（敗北）
    public boolean checkBust(){
	if (open() >= 22){
	    return true;
	}else{
	    return false;
	}
    }
    
}
