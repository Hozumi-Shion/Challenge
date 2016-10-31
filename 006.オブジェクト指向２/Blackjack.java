/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Shion
 */
public class Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
	Dealer ds = new Dealer();
	User us = new User();
	
	ds.setCard(ds.deal());
	us.setCard(ds.deal());
	
	us.checkCards();
	us.aceCheck();
	
	while(us.checkSum()){
	    us.setCard(ds.hit());
	    us.checkCards();
	    us.aceCheck();
	}
	
	ds.checkCards();
	ds.aceCheck();
	
	while(ds.checkSum()){
	    ds.setCard(ds.hit());
	    ds.checkCards();
	    ds.aceCheck();
	}
	
	//open
	
	
	if(ds.checkBust() && us.checkBust()){
	    System.out.println("ディーラー:" + ds.open() + "点" + "  " + "ユーザー" + us.open() + "点" + "  " + "両者バースト");
	    System.out.println("ディーラーが勝利しました");
	}else if(ds.checkBust()){
	    System.out.println("ディーラー:" + ds.open() + "点" + "  " + "ユーザー" + us.open() + "点" + "  " + "ディーラーバースト");
	    System.out.println("ユーザーが勝利しました");
	}else if(us.checkBust()){
	    System.out.println("ディーラー:" + ds.open() + "点" + "  " + "ユーザー" + us.open() + "点" + "  " + "ユーザーバースト");
	    System.out.println("ディーラーが勝利しました");
	}else if(us.open() < ds.open()){
	    System.out.println("ディーラー:" + ds.open() + "点" + "  " + "ユーザー" + us.open() + "点" );
	    System.out.println("ディーラーが勝利しました");
	}else if(us.open() > ds.open()){
	    System.out.println("ディーラー:" + ds.open() + "点" + "  " + "ユーザー" + us.open() + "点");
	    System.out.println("ユーザーが勝利しました");
	}else if(us.open() == ds.open()){
	    System.out.println("ディーラー:" + ds.open() + "点" + "  " + "ユーザー" + us.open() + "点");
	    System.out.println("引き分けです");
	}
	
    }
    
}
