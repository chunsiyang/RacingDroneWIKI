package com.RacingDroneWIKI.controller;

import com.RacingDroneWIKI.pojo.*;
import com.RacingDroneWIKI.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 2017/11/13.
 */
@Controller
public class SearchByModel {
    final int PAGENUMBER = 10;
    @Autowired
    Search search;

    @RequestMapping(value = "/search_{page}")
    public String search(@RequestParam("searchModel") String searchModel, Model model, @PathVariable(value = "page") int page) {
        List<Moto> motoList = new LinkedList<>();
        List<ElectroSpeedRegulator> electroSpeedRegulatorList = new LinkedList<>();
        List<Frame> frameList = new LinkedList<>();
        List<ImageTransmission> imageTransmissionList = new LinkedList<>();
        List<Cam> camList = new LinkedList<>();
        List<FlightControl> flightControlList = new LinkedList<>();
        List<Antenna> antennaList = new LinkedList<>();
        List<PowerHub> powerHubList = new LinkedList<>();
        List<Prop> propList = new LinkedList<>();
        List<Battery> batteryList = new LinkedList<>();
        search.searchModel(searchModel, motoList, electroSpeedRegulatorList, frameList,
                imageTransmissionList, camList, flightControlList, antennaList,
                powerHubList, propList, batteryList);
        int pages;
        int first;
        int last;
        int size = motoList.size() + electroSpeedRegulatorList.size()
                + frameList.size() + imageTransmissionList.size() +
                camList.size() + flightControlList.size() + antennaList.size()
                + powerHubList.size() + propList.size() + batteryList.size();

        pages = size % PAGENUMBER != 0 ? size / PAGENUMBER + 1 : size / PAGENUMBER;
        first = (page - 1) * PAGENUMBER;
        last = size > (first + PAGENUMBER) ? first + PAGENUMBER : size;
        List<Item> list = new LinkedList();
        list.addAll(motoList);
        list.addAll(electroSpeedRegulatorList);
        list.addAll(frameList);
        list.addAll(imageTransmissionList);
        list.addAll(camList);
        list.addAll(flightControlList);
        list.addAll(antennaList);
        list.addAll(powerHubList);
        list.addAll(propList);
        list.addAll(batteryList);
        list = list.subList(first, last);
        motoList.clear();
        electroSpeedRegulatorList.clear();
        frameList.clear();
        imageTransmissionList.clear();
        camList.clear();
        flightControlList.clear();
        antennaList.clear();
        powerHubList.clear();
        propList.clear();
        batteryList.clear();
        Iterator<Item> itemIterator = list.iterator();
        while (itemIterator.hasNext()) {
            Item item = itemIterator.next();
            if (item instanceof Moto) {
                motoList.add((Moto) item);
            }
            if (item instanceof ElectroSpeedRegulator) {
                electroSpeedRegulatorList.add((ElectroSpeedRegulator) item);
            }
            if (item instanceof Frame) {
                frameList.add((Frame) item);
            }
            if (item instanceof ImageTransmission) {
                imageTransmissionList.add((ImageTransmission) item);
            }
            if (item instanceof Cam) {
                camList.add((Cam) item);
            }
            if (item instanceof FlightControl) {
                flightControlList.add((FlightControl) item);
            }
            if (item instanceof Antenna) {
                antennaList.add((Antenna) item);
            }
            if (item instanceof PowerHub) {
                powerHubList.add((PowerHub) item);
            }
            if (item instanceof Prop) {
                propList.add((Prop) item);
            }
            if (item instanceof Battery) {
                batteryList.add((Battery) item);
            }
        }
        model.addAttribute("uri", "/search_");
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        model.addAttribute("searchModel", "?searchModel=" + searchModel);
        model.addAttribute("motoList", motoList);
        model.addAttribute("electroSpeedRegulatorList", electroSpeedRegulatorList);
        model.addAttribute("frameList", frameList);
        model.addAttribute("imageTransmissionList", imageTransmissionList);
        model.addAttribute("camList", camList);
        model.addAttribute("flightControlList", flightControlList);
        model.addAttribute("antennaList", antennaList);
        model.addAttribute("powerHubList", powerHubList);
        model.addAttribute("propList", propList);
        model.addAttribute("batteryList", batteryList);
        return "resultSet";
    }
}
