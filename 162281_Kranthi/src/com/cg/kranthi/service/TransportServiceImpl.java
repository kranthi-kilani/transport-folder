package com.cg.kranthi.service;

import java.util.Map;

import com.cg.kranthi.bean.TransportBean;
import com.cg.kranthi.dao.ITransportDao;
import com.cg.kranthi.dao.TransportDaoImpl;

public class TransportServiceImpl implements ITransportService {
          ITransportDao dao=new TransportDaoImpl();
	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return dao.getTransportDetails();
	}
	@Override
	public void addTransport(TransportBean bean) {
		// TODO Auto-generated method stub
		dao.addTransport(bean);
	}

}
