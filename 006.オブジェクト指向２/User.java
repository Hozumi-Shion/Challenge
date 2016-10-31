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
public class User extends Human{


     @Override
    public void setCard(ArrayList<Integer> cards) {
	myCards.addAll(cards);
    }

            @Override //ArrayListの中身を一旦変更しているからそれを戻したい
    public void checkCards() {
	for(int i = 0; i <myCards.size(); i++){
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
    public boolean checkSum() {
	int a =0;
	for (int i = 0; i < myCards.size(); i++) {
	    a += myCards.get(i);
	}

	if (a <= 18) {
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
