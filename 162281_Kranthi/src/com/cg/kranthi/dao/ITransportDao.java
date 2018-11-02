package com.cg.kranthi.dao;

import java.util.Map;

import com.cg.kranthi.bean.TransportBean;

public interface ITransportDao {

	Map<String, String> getTransportDetails();

	void addTransport(TransportBean bean);


}
