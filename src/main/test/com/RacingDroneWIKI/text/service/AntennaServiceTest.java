package com.RacingDroneWIKI.text.service;

import com.RacingDroneWIKI.pojo.Antenna;
import com.RacingDroneWIKI.service.AntennaService;
import org.apache.log4j.Logger;
import org.apache.tools.ant.taskdefs.Ant;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * AntennaService Tester.
 *
 * @author chunsiyang
 * @version 1.0
 * @since 4, 19, 2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.RacingDroneWIKI.spring.config.RootConfig.class})
@Transactional
public class AntennaServiceTest {
    private Antenna testAnt=new Antenna();
    @Autowired
    AntennaService antennaService;

    @Before
    public void before() throws Exception {
        testAnt.setModel("123");
        testAnt.setCaption("using for test");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: addAntenna(Antenna ant)
     */
    @Test
    public void testAddAntenna() throws Exception {
        Antenna antenna = new Antenna();
        antenna.setModel("spring test");
        int res = antennaService.addAntenna(antenna);
        org.junit.Assert.assertEquals(1,res);
        Logger log = Logger.getLogger(AntennaServiceTest.class);
        log.debug("12344132123");

    }

    /**
     * Method: deleteAntenna(Antenna ant)
     */
    @Test
    public void testDeleteAntenna() throws Exception {
        antennaService.deleteAntenna(
                antennaService.findDetail(testAnt.getModel()));
        Assert.assertNull(antennaService.findDetail(testAnt.getModel()));
    }

    /**
     * Method: updatAantenna(Antenna ant)
     */
    @Test
    public void testUpdatAantenna() throws Exception {
        antennaService.addAntenna(testAnt);
        Antenna antenna=antennaService.findDetail(testAnt.getModel());
        antenna.setCaption("123123");
        antennaService.updatAantenna(antenna);
        Assert.assertEquals(antennaService.findDetail(
                testAnt.getModel()).getCaption(),
                "123123");
    }

    /**
     * Method: findDetail(String model)
     */
    @Test
    public void testFindDetail() throws Exception {
        antennaService.addAntenna(testAnt);
        Antenna antenna=antennaService.findDetail(testAnt.getModel());
        Assert.assertTrue(antenna.getCaption().equals(testAnt.getCaption()));
    }

    /**
     * Method: findAll()
     */
    @Test
    public void testFindAll() throws Exception {
        List<Antenna> res = antennaService.findAll();
        org.junit.Assert.assertNotNull(res);
    }

    /**
     * Method: findByModel(String model)
     */
    @Test
    public void testFindByModel() throws Exception {
        List<Antenna> res = antennaService.findAll();
        Assert.assertNotNull(res);
    }


} 
