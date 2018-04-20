package com.RacingDroneWIKI.text.spring.aop.itemInsert;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

/** 
* InsertImg Tester. 
* 
* @author <Authors name> 
* @since <pre> 4, 20, 2018</pre>
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.RacingDroneWIKI.text.spring.config.RootConfig.class})
@WebAppConfiguration
@Transactional
public class InsertImgTest {
    private static MockMvc mockMvc;
    @Autowired
    private WebApplicationContext wac;
@Before
public void before() throws Exception {
    mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: itemImg(Item item, HttpServletRequest request, MultipartFile mainImg, MultipartFile[] files) 
* 
*/ 
@Test
public void testItemImg() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: upLoadItemImg(Item item, HttpServletRequest request, MultipartFile mainImg, MultipartFile[] files) 
* 
*/ 
@Test
public void testUpLoadItemImg() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: powerHubImg(PowerHub item, HttpServletRequest request, MultipartFile mainImg, MultipartFile[] files, MultipartFile pinDef) 
* 
*/ 
@Test
public void testPowerHubImg() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: flightControlImg(FlightControl item, HttpServletRequest request, MultipartFile mainImg, MultipartFile[] files, MultipartFile pinDef) 
* 
*/ 
@Test
public void testFlightControlImg() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: imageTransmissionImg(ImageTransmission item, HttpServletRequest request, MultipartFile mainImg, MultipartFile[] files, MultipartFile pinDef, MultipartFile fre) 
* 
*/ 
@Test
public void testImageTransmissionImg() throws Exception { 
//TODO: Test goes here... 
} 


} 
