package com.seller.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seller.products.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

}
