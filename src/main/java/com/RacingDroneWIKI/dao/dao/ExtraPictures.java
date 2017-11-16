package com.RacingDroneWIKI.dao.dao;

import org.apache.ibatis.annotations.Param;

import java.util.LinkedList;

public interface ExtraPictures {
    LinkedList<String> getExtPic(String model);

    boolean addExtPic(@Param("model") String model, @Param("expImg") LinkedList<String> expImg);
}