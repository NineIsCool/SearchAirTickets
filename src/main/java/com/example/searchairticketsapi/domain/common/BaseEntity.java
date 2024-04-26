package com.example.searchairticketsapi.domain.common;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;

import static jakarta.persistence.GenerationType.SEQUENCE;
import static lombok.AccessLevel.PROTECTED;

@Getter
@MappedSuperclass
@FieldNameConstants(innerTypeName = "BaseFields")
@FieldDefaults(level = PROTECTED)
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = HibernateSequence.NAME)
    @SequenceGenerator(name = HibernateSequence.NAME, allocationSize = HibernateSequence.ALLOCATION_SIZE)
    Long id;

    @Version
    Integer version;

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o==null || o.getClass()!=this.getClass()){
            return false;
        }
        var other = (BaseEntity) o;

        return id != null && id.equals(other.getId());
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
