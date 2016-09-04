package com.jd.risktest.beanannotation;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {

	@Resource // 也可以用Autowired
	private List<BeanInterface> list;
	@Resource // 也可以用Autowired
	private Map<String, BeanInterface> map;

	public void testDI() {

		if (list != null && 0 != list.size()) {
			System.out.println("List...");
			for (BeanInterface b : list) {
				b.sayName();
			}
		}

		if (map != null && 0 != map.size()) {
			System.out.println("Map...");
			for (Map.Entry<String, BeanInterface> entry : map.entrySet()) {
				System.out.println(entry.getKey() + "     " + entry.getValue().getClass().getName());

			}
		}
	}
}
