package com.hh.s1;

import static org.junit.Assert.*;
import javax.inject.Inject;
import org.junit.Test;
import com.hh.s1.notice.NoticeDAO;

public class TestCase extends TestAbstractCase{

	@Inject
	private NoticeDAO noticeDAO;
	
	@Test
	public void test() {
		assertNotNull(noticeDAO);
	}

}
