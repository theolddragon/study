package kr.theolddragon.bookStudy.domainDrivenDesign.chapter1;

/**
 * Chpater 1. 도메인 모델 시작 - Page 7
 * @author VAIO
 *
 */
public class Order_v1 {

	private OrderState_v1 state;
	private ShippingInfo shippingInfo;
	
	public void changeShippingInfo(ShippingInfo newShippingInfo) {
		if(!state.isShippingChangeable()) {
			throw new IllegalStateException("can't change shipping in " + state);
		}
		
		this.shippingInfo = newShippingInfo;
	}
	
	public void changeShipped() {
		//로직 검사
		this.state = OrderState_v1.SHIPPED;
	}
}