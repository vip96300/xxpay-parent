package org.xxpay.dal.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xxpay.dal.dao.model.MchInfo;
import org.xxpay.dal.dao.model.TransOrder;

public interface TransOrderRepository extends JpaRepository<TransOrder,String> {

}
