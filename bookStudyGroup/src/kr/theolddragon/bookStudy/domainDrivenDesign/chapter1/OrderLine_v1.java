package kr.theolddragon.bookStudy.domainDrivenDesign.chapter1;

/**
 * Chapter 1. 도메인 모델 시작 - Page 12
 * @author VAIO
 *
 */
public class OrderLine_v1 {

	private Product product;
	private int price;
	private int quantity;
	private int amounts;
	
	public OrderLine_v1(Product product, int price, int quantity) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.amounts = this.calculateAmount();
	}
	
	private int  calculateAmount() {
		return price * quantity;
	}
	
	public int getAmounts() {
		return this.amounts;
	}
}
