package net.ekobis.ekobis.customer.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.ekobis.ekobis.common.model.entity.BaseEntity;
import net.ekobis.ekobis.customer.model.entity.enums.Role;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity extends BaseEntity implements UserDetails {

    @Id
    @GeneratedValue
    @UuidGenerator
    private String customerId;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.DATE)
    private LocalDate birthDate;

    private String street;
    private String city;
    private String postalCode;

    @Column(unique = true)
    private String phone;

    @Column(unique = true)
    private String email;

    private String password;

    @Temporal(TemporalType.DATE)
    private LocalDate createdDate;

    private boolean enabled;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Role> roles;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
