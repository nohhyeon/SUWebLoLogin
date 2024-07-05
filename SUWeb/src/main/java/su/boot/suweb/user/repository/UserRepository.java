package su.boot.suweb.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import su.boot.suweb.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
	boolean existsByLoginId(String loginId);

	boolean existsByNickname(String nickname);

	Optional<User> findByLoginId(String loginId);
}