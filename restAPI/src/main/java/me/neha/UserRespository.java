package me.neha;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRespository extends JpaRepository<User, Integer> {

    List<User> findByUserid(String text, String textAgain);

}
