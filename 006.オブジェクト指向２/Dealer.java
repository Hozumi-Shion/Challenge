/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Shion
 */
public class Dealer extends Human {

    //cardsという52枚からなるトランプのデッキのArrayList変数定義
    ArrayList<Integer> cards = new ArrayList();

//ディーラーが一番最初に持っている52枚のカードをコンストラクタ（初期設定）
    //markは4種類の判断、numberは1~13の数字のカードの判断
    public Dealer() {
	for (int mark = 1; mark <= 4; mark++) {
	    for (int number = 1; number <= 13; number++) {
		cards.add(number);
	    }
	}
	Collections.shuffle(cards);	//52枚のcardsをシャッフルしてArrayList（cards）に返却
    }

    //bjというArrayList変数にcardsからカードを2枚受け取るまでループさせる処理の後
    //cardsから受け取ったためcardsの中の2枚を削除する処理をループごとに行うためループ内で処理
    //returnでbj変数内の値を返却する
    public ArrayList<Integer> deal() {
	ArrayList<Integer> bj = new ArrayList<>();
	for (int a = 0; a < 2; a++) {
	    bj.add(cards.get(a));
	    cards.remove(a);
	}
	return bj;
    }

    //こちらはdealメソッドとほぼ一緒
    //違いは1枚をドローするかどうかの処理（ブラックジャックルールではhitするかどうかの処理）
    public ArrayList<Integer> hit() {
	ArrayList<Integer> bj = new ArrayList<>();
	bj.add(cards.get(0));
	cards.remove(0);
	return bj;
    }
    
        @Override //ArrayListの中身を一旦変更しているからそれを戻したい
    public void checkCards() {
	for(int i = 0; i < myCards.size(); i++){
	    if(myCards.get(i) >= 11){
		myCards.set(i , 10);
	    }
	}
    }
    
    @Override
    public void aceCheck() {
	for(int i = 0; i <myCards.size(); i++){
	    if(myCards.get(i) >= 10){
		myCards.set(i ,11);
	    }else{
		myCards.set(i , 1);
	    }
	}
    }
    
@Override
    public void setCard(ArrayList<Integer> cards) {
	this.myCards.addAll(cards);
    }
    
    @Override
    public boolean checkSum() {
	int a =0;
	for (int i = 0; i < myCards.size(); i++) {
	    a += myCards.get(i);
	}

	if (a <= 16) {
	    return true;
	} else {
	    return false;
	}
    }

    @Override
    public Integer open() {
	int tefuda = 0;
	for (int i = 0; i <myCards.size(); i++){
	    tefuda += myCards.get(i);
	}
	return tefuda;
    }
}
