package com.dee.app.example.Repo;
//the packages
import com.dee.app.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//extending the jpa repo from the interface created

@Repository
public interface UserRepo extends JpaRepository<User,Long>{
}
