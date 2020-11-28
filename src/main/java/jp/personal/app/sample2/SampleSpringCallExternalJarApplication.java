package jp.personal.app.sample2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jp.personal.app.sample1.TestTableRepository;
import jp.personal.app.sample1.TestTableService;

@SpringBootApplication
public class SampleSpringCallExternalJarApplication {
	
	/** 外部Jarのクラス */
	@Autowired
	TestTableRepository repository;
	@Autowired
	TestTableService service;

	public static void main(String[] args) {
		try (var ctx = SpringApplication.run(SampleSpringCallExternalJarApplication.class, args)) {
			var self = ctx.getBean(SampleSpringCallExternalJarApplication.class);
			self.exec();
		}
	}
	
	public void exec() {
		System.out.println("実行");
		System.out.println(repository.selectOne(1));
		System.out.println(repository.selectOne(2));
		
		System.out.println(service.selectOne(1).getMessage());
		System.out.println(service.selectOne(2).getMessage());
	}

}
