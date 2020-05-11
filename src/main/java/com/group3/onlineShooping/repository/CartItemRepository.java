package com.group3.onlineShooping.repository;

import com.group3.onlineShooping.domain.Buyer;
import com.group3.onlineShooping.domain.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends CrudRepository <CartItem, Long> {
    CartItem findCartItemByBuyer(Buyer buyer);
}
