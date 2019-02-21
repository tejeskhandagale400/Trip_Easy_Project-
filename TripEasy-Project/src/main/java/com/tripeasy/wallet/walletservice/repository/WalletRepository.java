package com.tripeasy.wallet.walletservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tripeasy.wallet.walletservice.entity.Statement;
import com.tripeasy.wallet.walletservice.entity.Wallet;
@Repository
public interface WalletRepository extends JpaRepository<Wallet, Integer>{



}
