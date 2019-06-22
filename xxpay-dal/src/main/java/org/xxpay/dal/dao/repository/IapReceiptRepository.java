package org.xxpay.dal.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xxpay.dal.dao.model.IapReceipt;
import org.xxpay.dal.dao.model.MchInfo;

public interface IapReceiptRepository extends JpaRepository<IapReceipt,String> {

}
