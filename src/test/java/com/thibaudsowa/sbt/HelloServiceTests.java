package com.thibaudsowa.sbt;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTests {

	@Test
	public void sayHelloThibaudSuccess() {
		Assert.assertEquals(HelloService.sayHello("thibaud"), "Hello thibaud!!!");
	}

	@Test
	public void sayHelloThibaudFailure() {
		Assert.assertEquals(HelloService.sayHello("thibaud"), "Yo thibaud");
	}

}
