package net.ekobis.ekobis.common.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

    @Column(name = "CREATED")
    @CreatedBy
    private String created;

    @Column(name = "CREATED_AT")
    @CreatedDate
    private LocalDateTime createdAt;

    @PrePersist
    protected void prePersist() {
        created = "ekobis";
        createdAt = LocalDateTime.now();
    }


    @Column(name = "UPDATED")
    @LastModifiedBy
    private String updated;

    @Column(name = "UPDATED_AT")
    @LastModifiedDate
    private LocalDateTime updatedDateTime;

    @PreUpdate
    public void preUpdate(){
        this.updated = "ekobis";
        this.updatedDateTime = LocalDateTime.now();
    }
}
