package com.hb;


import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component("demo")
public class Demo {
	
	
	private Service servic;
	
	
	



	public Service getServic() {
		return servic;
	}





	@Resource(name="Service")
	public void setServic(Service servic) {
		this.servic = servic;
	}











	public void test(){
		System.out.println("dddddd");
		servic.show();
		
	}

}
