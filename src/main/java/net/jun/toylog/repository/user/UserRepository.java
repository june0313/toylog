package net.jun.toylog.repository.user;

import net.jun.toylog.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wayne on 2017. 7. 23..
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name);
}
