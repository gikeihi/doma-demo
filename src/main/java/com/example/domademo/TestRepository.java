package com.example.domademo;

import com.example.domademo.entity.TaEntity;
import com.example.domademo.entity.TaEntity_;
import com.example.domademo.entity.TbEntity_;
import com.example.domademo.entity.TcEntity;
import com.example.domademo.entity.TcEntity_;
import com.example.domademo.entity.TdEntity;
import com.example.domademo.entity.TdEntity_;
import lombok.RequiredArgsConstructor;
import org.seasar.doma.jdbc.criteria.Entityql;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TestRepository {
    private final Entityql entityql;
    public List<TaEntity> get(){
        var ta = new TaEntity_();
        var tb = new TbEntity_();
        var tc = new TcEntity_();
        return entityql.from(ta)
                .leftJoin(tb, on->{
                    on.eq(tb.taId, ta.id);
                })
                .leftJoin(tc, on->{
                    on.eq(tc.taId, ta.id);
                })
                .associate(ta,tb, (a,b)->a.getTbs().add(b))
                .associate(ta,tc, (a,c)->a.getTcs().add(c))
                .fetch();
    }
    public List<TdEntity> getTd(){
        var td = new TdEntity_();
        return entityql.from(td)
                .where(c->{
                    c.eq(td.sex, true);
                }).fetch();
    }
}
