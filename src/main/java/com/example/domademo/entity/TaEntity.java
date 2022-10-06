package com.example.domademo.entity;

import lombok.Data;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Metamodel;
import org.seasar.doma.Table;
import org.seasar.doma.Transient;

import java.util.ArrayList;
import java.util.List;

@Entity(metamodel = @Metamodel)
@Table(name = "t_a")
@Data
public class TaEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Transient
    private List<TbEntity> tbs = new ArrayList<>();
    @Transient
    private List<TcEntity> tcs = new ArrayList<>();
}
