package com.RacingDroneWIKI.test.service;

import com.RacingDroneWIKI.pojo.Antenna;
import com.RacingDroneWIKI.service.AntennaService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/** 
* AntennaService Tester. 
* 
* @author <Authors name> 
* @since <pre>4, 23, 2018</pre>
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.RacingDroneWIKI.spring.config.RootConfig.class})
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
* 
* Method: addAntenna(Antenna ant) 
* 
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
* 
* Method: deleteAntenna(Antenna ant) 
* 
*/ 
@Test
public void testDeleteAntenna() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: updatAantenna(Antenna ant) 
* 
*/ 
@Test
public void testUpdatAantenna() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findDetail(String model) 
* 
*/ 
@Test
public void testFindDetail() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findAll() 
* 
*/ 
@Test
public void testFindAll() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findByModel(String model) 
* 
*/ 
@Test
public void testFindByModel() throws Exception { 
//TODO: Test goes here... 
} 


} 
