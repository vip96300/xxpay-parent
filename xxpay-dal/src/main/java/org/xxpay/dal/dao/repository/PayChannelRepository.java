package org.xxpay.dal.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xxpay.dal.dao.model.MchInfo;
import org.xxpay.dal.dao.model.PayChannel;

public interface PayChannelRepository extends JpaRepository<PayChannel,Integer> {

}
