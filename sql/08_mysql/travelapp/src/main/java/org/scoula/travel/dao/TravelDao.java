package org.scoula.travel.dao;


import org.scoula.travel.domain.TravelVO;

import java.util.List;
import java.util.Optional;

public interface TravelDao {
    void insert(TravelVO travel);
    void insertImage(TravelImageVO Image);

    int getTotalCount();
    List<TravelVO> getTravels();
    List<TravelVO> getTravels(int page);

    List<TravelVO> getTravels(String district);
    Optional<TravelVO> getTravel(Long no);

    List<String> getDistricts();
}
