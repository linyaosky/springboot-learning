package com.skyline.learn;

import com.skyline.learn.service.BlogProperties;
import com.sun.glass.ui.Application;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2016/8/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
public class ApplicationTest {
    private static final Log log = LogFactory.getLog(ApplicationTest.class);

    @Autowired
    private BlogProperties blogProperties ;

    @Test
    public void test() throws Exception{
        Assert.assertEquals("spring boot",blogProperties.getName());
        Assert.assertEquals("是什么",blogProperties.getTitle());
    }
}
