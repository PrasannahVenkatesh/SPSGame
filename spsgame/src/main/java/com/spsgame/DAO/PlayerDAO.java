package com.spsgame.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spsgame.ENTITY.PlayerEntity;

public interface PlayerDAO extends JpaRepository<PlayerEntity,String>{

}
