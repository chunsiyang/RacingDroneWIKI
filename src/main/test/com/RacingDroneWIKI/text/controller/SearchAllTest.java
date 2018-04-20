package com.RacingDroneWIKI.text.controller;

import com.RacingDroneWIKI.pojo.*;
import com.RacingDroneWIKI.text.spring.config.RootConfig;
import com.RacingDroneWIKI.text.spring.config.WebConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * SearchAll Tester.
 *
 * @author chunsiyang
 * @version 1.0
 * @since 4, 19, 2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class, WebConfig.class})
@WebAppConfiguration
public class SearchAllTest {
    private static MockMvc mockMvc;
    @Autowired
    private WebApplicationContext wac;

    private static MvcResult getResult(MockHttpServletRequestBuilder request) throws Exception {
        return mockMvc.perform(request)
                .andDo(MockMvcResultHandlers.print())
                .andExpect(view().name("resultSet"))
                .andExpect(forwardedUrl("/resultSet.jsp"))
                .andExpect(model().attributeExists("uri"))
                .andExpect(model().attributeExists("page"))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Before
    public void before() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: motoList(Model model, @PathVariable(value = "page") int page, HttpServletRequest request)
     */
    @Test
    public void testMotoList() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/moto_{page}", 1);
        MvcResult result = getResult(request);
        List<Moto> list = (List<Moto>) (result.getModelAndView().getModel().get("motoList"));
        Assert.assertTrue(list.size() > 0);
    }

    /**
     * Method: electroSpeedRegulatorList(Model model, @PathVariable(value = "page") int page, HttpServletRequest request)
     */
    @Test
    public void testElectroSpeedRegulatorList() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/electroSpeedRegulator_{page}", 1);
        MvcResult result = getResult(request);
        List<ElectroSpeedRegulator> list = (List<ElectroSpeedRegulator>) (result.getModelAndView().getModel().get("electroSpeedRegulatorList"));
        Assert.assertTrue(list.size() > 0);
    }

    /**
     * Method: frameList(Model model, @PathVariable(value = "page") int page, HttpServletRequest request)
     */
    @Test
    public void testFrameList() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/frame_{page}", 1);
        MvcResult result = getResult(request);
        List<Frame> list = (List<Frame>) (result.getModelAndView().getModel().get("frameList"));
        Assert.assertTrue(list.size() > 0);
    }

    /**
     * Method: imageTransmissionList(Model model, @PathVariable(value = "page") int page, HttpServletRequest request)
     */
    @Test
    public void testImageTransmissionList() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/imageTransmission_{page}", 1);
        MvcResult result = getResult(request);
        List<ImageTransmission> list = (List<ImageTransmission>) (result.getModelAndView().getModel().get("imageTransmissionList"));
        Assert.assertTrue(list.size() > 0);
    }

    /**
     * Method: camList(Model model, @PathVariable(value = "page") int page, HttpServletRequest request)
     */
    @Test
    public void testCamList() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/cam_{page}", 1);
        MvcResult result = getResult(request);
        List<Cam> list = (List<Cam>) (result.getModelAndView().getModel().get("camList"));
        Assert.assertTrue(list.size() > 0);
    }

    /**
     * Method: flightControlList(Model model, @PathVariable(value = "page") int page, HttpServletRequest request)
     */
    @Test
    public void testFlightControlList() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/flightControl_{page}", 1);
        MvcResult result = getResult(request);
        List<FlightControl> list = (List<FlightControl>) (result.getModelAndView().getModel().get("flightControlList"));
        Assert.assertTrue(list.size() > 0);
    }

    /**
     * Method: antennaList(Model model, @PathVariable(value = "page") int page, HttpServletRequest request)
     */
    @Test
    public void testAntennaList() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/antenna_{page}", 1);
        MvcResult result = getResult(request);
        List<Antenna> list = (List<Antenna>) (result.getModelAndView().getModel().get("antennaList"));
        Assert.assertTrue(list.size() > 0);
    }

    /**
     * Method: powerHubList(Model model, @PathVariable(value = "page") int page, HttpServletRequest request)
     */
    @Test
    public void testPowerHubList() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/powerHub_{page}", 1);
        MvcResult result = getResult(request);
        List<PowerHub> list = (List<PowerHub>) (result.getModelAndView().getModel().get("powerHubList"));
        Assert.assertTrue(list.size() > 0);
    }

    /**
     * Method: propList(Model model, @PathVariable(value = "page") int page, HttpServletRequest request)
     */
    @Test
    public void testPropList() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/prop_{page}", 1);
        MvcResult result = getResult(request);
        List<Prop> list = (List<Prop>) (result.getModelAndView().getModel().get("propList"));
        Assert.assertTrue(list.size() > 0);
    }

    /**
     * Method: batteryList(Model model, @PathVariable(value = "page") int page, HttpServletRequest request)
     */
    @Test
    public void testBatteryList() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/battery_{page}", 1);
        MvcResult result = getResult(request);
        List<Battery> list = (List<Battery>) (result.getModelAndView().getModel().get("batteryList"));
        Assert.assertTrue(list.size() > 0);
    }

} 
