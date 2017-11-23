package com.RacingDroneWIKI.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;

/**
 * The interface Extra pictures dao.
 * 辅助图片DAO(Data Access Object) 数据访问对象
 *
 * @author ChunsiYang
 * @version SSM 3.0
 */
@Repository
public interface ExtraPicturesDao {
    /**
     * Gets ext pic.
     *
     * @param model the model
     * @return the ext pic
     */
    LinkedList<String> getExtPic(String model);

    /**
     * Add ext pic boolean.
     *
     * @param model  the model
     * @param expImg the exp img
     * @return the boolean
     */
    boolean addExtPic(@Param("model") String model, @Param("expImg") LinkedList<String> expImg);
}