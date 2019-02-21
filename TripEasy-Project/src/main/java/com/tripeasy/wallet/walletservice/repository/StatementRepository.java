package com.tripeasy.wallet.walletservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tripeasy.wallet.walletservice.entity.Statement;

@Repository
public interface StatementRepository extends JpaRepository<Statement, Integer> {

}
