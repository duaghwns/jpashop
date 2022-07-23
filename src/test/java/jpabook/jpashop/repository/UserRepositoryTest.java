package jpabook.jpashop.repository;

import jpabook.jpashop.entity.User;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired UserRepository userRepository;

    @Test
    @Transactional
    @Rollback
    public void testUser() throws Exception {
        // given
        User user = new User();
        user.setUsername("hojoon");
        // when
        Long savedId = userRepository.save(user);
        User findUser = userRepository.find(savedId);
        // then
        Assertions.assertThat(findUser.getUserId()).isEqualTo(user.getUserId());
        Assertions.assertThat(findUser.getUsername()).isEqualTo(user.getUsername());
    }
}