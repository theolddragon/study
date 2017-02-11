package kr.theolddragon.bookStudy.domainDrivenDesign.chapter1;

/**
 * Chapter 1. 도메인 모델 시작 - Page 8
 * @author VAIO
 *
 */
public enum OrderState_v1 {

	PAYMENT_WAITING {
		public boolean isShippingChangeable() {
			return true;
		}
	},
	PREPARING {
		public boolean isShippingChangeable() {
			return true;
		}
	},
	SHIPPED, DELIVERING, DELIVERY_COMPLETED;
	
	public boolean isShippingChangeable() {
		return false;
	}
}
