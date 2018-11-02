package com.cg.kranthi.ui;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.cg.kranthi.bean.TransportBean;
import com.cg.kranthi.service.ITransportService;
import com.cg.kranthi.service.TransportServiceImpl;

public class Client {
	public static void main(String[] args) {
		TransportBean bean = new TransportBean();
		ITransportService service = new TransportServiceImpl();
		Map<String, String> transportDetails = service.getTransportDetails();
		System.out.println("mode of transport");
		int count = 1;
		for (Map.Entry<String, String> entrySet : transportDetails.entrySet()) {
			System.out.println(count + " " + entrySet.getValue());
			count++;
		}
		System.out.println("enter the option");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		int count1 = 1;
		for (Map.Entry<String, String> entrySet : transportDetails.entrySet()) {
			if (choice == count1) {
				bean.setTransportId(entrySet.getKey());
			}
			count1++;
		}
		int id = (int) ((Math.random()) * 10000);
		bean.setId(id);
		System.out.println("enter the reason");
		scanner.nextLine();
		String reason = scanner.nextLine();
		bean.setReason(reason);
		System.out.println("when\n 1.this week \n 2.next week\n 3.next month");
		int whenchoice = scanner.nextInt();
		if (whenchoice == 1) {
			bean.setWhen("A");
		}
		if (whenchoice == 2) {
			bean.setWhen("B");
		}
		if (whenchoice == 3) {
			bean.setWhen("C");
		}
		service.addTransport(bean);
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm a");
		System.out.println("Booked with "+" "+id+" "+ldt.format(f) );
	}

	

}
