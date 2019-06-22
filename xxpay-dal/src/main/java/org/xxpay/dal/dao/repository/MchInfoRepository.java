package org.xxpay.dal.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xxpay.dal.dao.model.MchInfo;

public interface MchInfoRepository extends JpaRepository<MchInfo,String> {

}
