package com.example.domademo.entity;

import lombok.Data;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Metamodel;
import org.seasar.doma.Table;

@Entity(metamodel = @Metamodel)
@Table(name = "t_c")
@Data
public class TcEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "a_id")
    private Integer taId;
    @Column(name = "name")
    private String name;
}
