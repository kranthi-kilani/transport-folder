package com.cg.kranthi.service;

import java.util.Map;

import com.cg.kranthi.bean.TransportBean;

public interface ITransportService {

	Map<String, String> getTransportDetails();

	void addTransport(TransportBean bean);

}
