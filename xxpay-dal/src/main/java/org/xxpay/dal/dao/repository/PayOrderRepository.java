package org.xxpay.dal.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xxpay.dal.dao.model.MchInfo;
import org.xxpay.dal.dao.model.PayOrder;

public interface PayOrderRepository extends JpaRepository<PayOrder,String> {

}
