package org.xxpay.mgr.dao.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;

@Entity @Table(name="t_sys_role")
public class SysRoleEntity implements GrantedAuthority {

    @Id
    @GeneratedValue
    private long roleId;

    private String role;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "t_sys_role_permission", joinColumns = { @JoinColumn(name = "roleId") }, inverseJoinColumns = {@JoinColumn(name = "permissionId") })
    private List<SysPermissionEntity> permissionList;

    @Override
    public String getAuthority() {
        return role;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<SysPermissionEntity> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<SysPermissionEntity> permissionList) {
        this.permissionList = permissionList;
    }
}
