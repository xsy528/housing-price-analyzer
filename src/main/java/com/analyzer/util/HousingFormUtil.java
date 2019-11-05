package com.analyzer.util;

import com.analyzer.api.condition.BuyCondition;
import com.analyzer.api.condition.Condition;
import com.analyzer.api.condition.RentalCondition;
import com.analyzer.dao.HousingFormDao;
import com.analyzer.dao.entity.HousingFormEntity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class HousingFormUtil {

    private HousingFormDao housingFormDao;

    @Autowired
    public HousingFormUtil(HousingFormDao housingFormDao) {
        this.housingFormDao = housingFormDao;
    }

    public List<HousingFormEntity> getHosingEntity(Condition condition){
        if(condition!=null){

           return housingFormDao.findAll((root, query, build) -> {
                List<Predicate> list = new ArrayList<>();
                if(condition instanceof RentalCondition){
                    RentalCondition con = (RentalCondition)condition;
                    build.equal(root.get("isRhp"),true);
                    build.lessThanOrEqualTo(root.get("price"),con.getMaxPrices());
                    build.greaterThanOrEqualTo(root.get("price"),con.getMinPrices());
                    build.equal(root.get("region"),con.getRegion());
                    build.lessThanOrEqualTo(root.get("area"),con.getMaxArea());
                    build.greaterThanOrEqualTo(root.get("area"),con.getMinArea());
                    if(con.getFormat()!=null){
                        build.equal(root.get("format"),con.getFormat());
                    }
                    if(con.getDetail()!=null){
                        build.like(root.get("detail"),con.getDetail());
                    }
                    if(con.getOther()!=null){
                        build.like(root.get("other"),con.getOther());
                    }


                }else {
                    BuyCondition con = (BuyCondition)condition;
                    build.equal(root.get("isRhp"),true);
                    build.lessThanOrEqualTo(root.get("prices"),con.getMaxPrices());
                    build.greaterThanOrEqualTo(root.get("prices"),con.getMinPrices());
                    build.equal(root.get("region"),con.getRegion());
                    build.lessThanOrEqualTo(root.get("area"),con.getMaxarea());
                    build.greaterThanOrEqualTo(root.get("area"),con.getMinarea());
                    if(con.getFormat()!=null){
                        build.equal(root.get("format"),con.getFormat());
                    }
                    if(con.getDetail()!=null){
                        build.like(root.get("detail"),con.getDetail());
                    }
                    if(con.getOther()!=null){
                        build.like(root.get("other"),con.getOther());
                    }

                }
                return build.and(list.toArray(new Predicate[0]));
            });
        }else {

            return housingFormDao.findAll();
        }
    }
}
