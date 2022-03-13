package com.gregorio.numismatic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gregorio.numismatic.model.Coin;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Long> {

}
