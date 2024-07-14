package net.ekobis.ekobis.customer.domain.entity.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    CUSTOMER,ADMIN,MOD;

    @Override
    public String getAuthority() {
        return name();
    }
}
