package cuit.shop.mapper;

import cuit.shop.entity.Good;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodMapper {
    List<Good> GoodList();
    int AddGood(Good good);
    int DeleteGood(int id);
}
