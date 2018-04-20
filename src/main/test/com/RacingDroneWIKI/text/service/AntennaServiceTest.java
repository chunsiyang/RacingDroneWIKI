package com.RacingDroneWIKI.text.service;

import com.RacingDroneWIKI.pojo.Antenna;
import org.junit.After;
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
@ContextConfiguration(classes = {com.RacingDroneWIKI.text.spring.config.RootConfig.class})
@Transactional
public class AntennaServiceTest {
    @Autowired
    AntennaService antennaService;

    @Before
    public void before() throws Exception {
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

    }

    /**
     * Method: deleteAntenna(Antenna ant)
     */
    @Test
    public void testDeleteAntenna() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: updatAantenna(Antenna ant)
     */
    @Test
    public void testUpdatAantenna() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: findDetail(String model)
     */
    @Test
    public void testFindDetail() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: findAll()
     */
    @Test
    public void testFindAll() throws Exception {
        //TODO: Test goes here...
        List<Antenna> res = antennaService.findAll();
        org.junit.Assert.assertNotNull(res);
    }

    /**
     * Method: findByModel(String model)
     */
    @Test
    public void testFindByModel() throws Exception {
//TODO: Test goes here... 
    }


} 
