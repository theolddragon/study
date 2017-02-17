package kr.theolddragon.bookStudy.domainDrivenDesign.chapter1;

import java.util.List;

/**
 * Chapter 1. 도메인 모델 시작 - Page 13
 * @author VAIO
 *
 */
public class Order_v4 {

	private List<OrderLine_v1> orderLines;
	private int totalAmounts;
	
	public Order_v4(List<OrderLine_v1> orderLines) {
		setOrderLines(orderLines);
	}
	
	private void setOrderLines(List<OrderLine_v1> orderLines) {
		verifyAtLeastOneOnMoreOrderLines(orderLines);
		this.orderLines = orderLines;
		calculateTotalAmount();
	}
	
	private void verifyAtLeastOneOnMoreOrderLines(List<OrderLine_v1> orderLines) {
		if(orderLines == null || orderLines.isEmpty()) {
			throw new IllegalArgumentException("no OrderLine");
		}
	}
	
	private void calculateTotalAmount() {
		this.totalAmounts = new Money(orderLines.stream()
				.mapToInt(x -> x.getAmounts().getValue()).sum());
	}
}
