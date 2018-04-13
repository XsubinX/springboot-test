package com.zourceview.soas.jpa.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zourceview.soas.SOASApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SOASApplication.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void repositoryTest() {
	Assert.assertNotNull(userRepository);
    }
}
