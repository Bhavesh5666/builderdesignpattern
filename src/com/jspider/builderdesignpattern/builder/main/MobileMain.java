package com.jspider.builderdesignpattern.builder.main;

import com.jspider.builderdesignpattern.builder.MobileBuilder;
import com.jspider.builderdesignpattern.object.Mobile;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mobile = new MobileBuilder().brand("samsung").price(10000.0).model("s24").getMobile();
		System.out.println(mobile);

	}

}
