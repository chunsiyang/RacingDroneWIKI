package com.RacingDroneWIKI.dao.dao;

import java.util.LinkedList;

public interface ExtraPictures {
    LinkedList<String> getExtPic(String model);
    boolean addExtPic(String model,LinkedList<String> expImg);
}