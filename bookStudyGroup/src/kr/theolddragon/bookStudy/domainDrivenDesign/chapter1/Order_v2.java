package kr.theolddragon.bookStudy.domainDrivenDesign.chapter1;

/**
 * Chapter 1. 도메인 모델 시작 - Page 9
 * @author VAIO
 *
 */
public class Order_v2 {

	private OrderState_v2 state;
	private ShippingInfo shippingInfo;
	
	public void changeShippingInfo(ShippingInfo newShippingInfo) {
		if(!isShippingChangeable()) {
			throw new IllegalStateException("can't change shipping in " + state); 
		}
		
		this.shippingInfo = newShippingInfo;
	}
	
	private boolean isShippingChangeable() {
		return state == OrderState_v2.PAYMENT_WAITING ||
				state == OrderState_v2.PREPARING;
	}
}
