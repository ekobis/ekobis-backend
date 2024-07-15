package net.ekobis.ekobis.customer.model.entity.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    CUSTOMER,ADMIN,MOD;

    @Override
    public String getAuthority() {
        return name();
    }
}
