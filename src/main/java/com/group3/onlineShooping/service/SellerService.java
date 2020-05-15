package com.group3.onlineShooping.service;

import com.group3.onlineShooping.domain.Follower;
import com.group3.onlineShooping.domain.Seller;

import java.util.List;

public interface SellerService {

    public void addSerller(Seller seller);
    public List<Seller> getAll();
    public Seller getSeller(Long id) throws Exception;
    public Seller editSeller(Seller seller);
    public Seller findByEmail(String email);
    public List<Seller> findAll();
    public Seller find(Long id);
    public Seller findById(Long id);
    public List<Seller> findAllBySeller(Long id, Follower.FollowerStatus followerStatus);
}
