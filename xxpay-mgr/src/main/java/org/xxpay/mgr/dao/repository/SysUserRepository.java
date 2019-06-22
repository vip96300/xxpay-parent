package org.xxpay.mgr.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xxpay.mgr.dao.entity.SysUserEntity;

public interface SysUserRepository extends JpaRepository<SysUserEntity,Long> {

    SysUserEntity findByUserName(String userName);
}
