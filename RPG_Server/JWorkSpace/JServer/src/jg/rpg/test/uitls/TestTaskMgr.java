package jg.rpg.test.uitls;

import static org.junit.Assert.*;

import org.dom4j.DocumentException;
import org.junit.Test;

import jg.rpg.common.manager.TaskMgr;
import jg.rpg.exceptions.InitException;

public class TestTaskMgr {

	@Test
	public void testLoading() throws InitException, DocumentException {
		TaskMgr.getInstance().init();
	}
}