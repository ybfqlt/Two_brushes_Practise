package com.xns.ha;

import com.xns.ha.consumer.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: xns
 * @Date: 20-2-21 下午7:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloAppTests {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception{
        sender.send();
    }
}
