package cuit.shop.service;

import cuit.shop.entity.Good;
import cuit.shop.mapper.GoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodService {
    @Autowired
    GoodMapper goodMapper;

    public List<Good> GoodList() {
        return goodMapper.GoodList();
    }

    public int AddGood(Good good) {
        return goodMapper.AddGood(good);
    }

    public int DeleteGood(int id) {
        return goodMapper.DeleteGood(id);
    }
}