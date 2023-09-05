package com.nick;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * @author Nick
 * @Classname RemoteInit
 * @Date 2023/09/05 14:59
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {InitApplication.class})
@ActiveProfiles(profiles = {"remote"})
public class RemoteInit {
	@Autowired
	private DataSource ds;

	@Test
	public void testDataSource() {
		Assert.assertNotNull(ds);
		System.out.println(ds);
	}
}
