package me.neha;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserGroupRespository extends JpaRepository<Usergroup, Integer> {

    List<Usergroup> findByGroupname(String text, String textAgain);

}
