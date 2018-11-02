package com.cg.kranthi.dao;

import java.util.Map;

import com.cg.kranthi.bean.TransportBean;
import com.cg.kranthi.util.Database;

public class TransportDaoImpl implements ITransportDao {

	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return Database.gettransportDetails();
	}

	@Override
	public void addTransport(TransportBean bean) {
		// TODO Auto-generated method stub
	 Database.addTransport(bean);
	}

	

}
