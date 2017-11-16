package com.RacingDroneWIKI.dao;

        import org.apache.ibatis.annotations.Param;
        import org.springframework.stereotype.Repository;

        import java.util.LinkedList;
@Repository
public interface ExtraPictures {
    LinkedList<String> getExtPic(String model);
    boolean addExtPic(@Param("model") String model,@Param("expImg") LinkedList<String> expImg);
}