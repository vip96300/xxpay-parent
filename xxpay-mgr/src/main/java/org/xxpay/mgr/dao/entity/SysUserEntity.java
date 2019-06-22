package org.xxpay.mgr.dao.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity @Table(name="t_sys_user")
public class SysUserEntity implements UserDetails {

    @Id
    @GeneratedValue
    private long userId;

    private String userName;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "t_sys_user_role", joinColumns = { @JoinColumn(name = "userId") }, inverseJoinColumns = {@JoinColumn(name = "roleId") })
    private List<SysRoleEntity> roleList;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roleList;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    /**
     * 判断账号是否已经过期，默认没有过期
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    /**
     * 判断账号是否被锁定，默认没有锁定
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    /**
     * 判断信用凭证是否过期，默认没有过期
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    /**
     * 判断账号是否可用，默认可用
     * @return
     */
    @Override
    public boolean isEnabled() {
        return true;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SysRoleEntity> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRoleEntity> roleList) {
        this.roleList = roleList;
    }
}
