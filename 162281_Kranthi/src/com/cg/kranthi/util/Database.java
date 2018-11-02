package com.cg.kranthi.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.kranthi.bean.TransportBean;

public class Database {

	private static Map<String, String> transportDetails = new HashMap<>();
	private static Map<Integer, TransportBean> bookTransport = new HashMap<>();

	public static Map<String, String> gettransportDetails() {
		// TODO Auto-generated method stub
		transportDetails.put("flight-1", "flight");
		transportDetails.put("train-1", "train");
		transportDetails.put("taxi-1", "taxi");
		return transportDetails;
	}

	public static void addTransport(TransportBean bean) {
				// TODO Auto-generated method stub
		bookTransport.put(bean.getId(), bean);
		
		
	}

}
