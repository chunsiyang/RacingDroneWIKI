package com.RacingDroneWIKI.text.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.fileUpload;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

/** 
* InsertItem Tester. 
* 
* @author <Authors name> 
* @since <pre> 4, 20, 2018</pre>
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.RacingDroneWIKI.spring.config.RootConfig.class})
@WebAppConfiguration
@Transactional
public class InsertItemTest {
    private static MockMvc mockMvc;
    @Autowired
    private WebApplicationContext wac;
    private final String REQUERST_MAP="/itemInsert/";
@Before
public void before() throws Exception {
    mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: dataInput(HttpSession session) 
* 
*/ 
@Test
public void testDataInput() throws Exception {
    MvcResult result =mockMvc.perform(MockMvcRequestBuilders.get(REQUERST_MAP+"dataInput"))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(MockMvcResultMatchers.forwardedUrl("itemInsert/dataInput"))
            .andReturn();
    Assert.assertTrue(result.getRequest().getSession().isNew());
}

/** 
* 
* Method: insertAnt(Antenna antenna, HttpServletRequest request, @RequestParam("mainImg") MultipartFile mainImg, @RequestParam("files") MultipartFile[] files) 
* 
*/ 
@Test
public void testInsertAnt() throws Exception {

}

/** 
* 
* Method: insertBat(Battery battery, HttpServletRequest request, @RequestParam("mainImg") MultipartFile mainImg, @RequestParam("files") MultipartFile[] files) 
* 
*/ 
@Test
public void testInsertBat() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insertProp(Prop prop, HttpServletRequest request, @RequestParam("mainImg") MultipartFile mainImg, @RequestParam("files") MultipartFile[] files) 
* 
*/ 
@Test
public void testInsertProp() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insertCam(Cam cam, HttpServletRequest request, @RequestParam("mainImg") MultipartFile mainImg, @RequestParam("files") MultipartFile[] files) 
* 
*/ 
@Test
public void testInsertCam() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insertPH(PowerHub powerHub, HttpServletRequest request, @RequestParam("mainImg") MultipartFile mainImg, @RequestParam("files") MultipartFile[] files, @RequestParam("pinDefinitionDiagramUrl") MultipartFile pinDef) 
* 
*/ 
@Test
public void testInsertPH() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insertEsc(ElectroSpeedRegulator electroSpeedRegulator, HttpServletRequest request, @RequestParam("mainImg") MultipartFile mainImg, @RequestParam("files") MultipartFile[] files) 
* 
*/ 
@Test
public void testInsertEsc() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insertMoto(Moto moto, HttpServletRequest request, @RequestParam("mainImg") MultipartFile mainImg, @RequestParam("files") MultipartFile[] files) 
* 
*/ 
@Test
public void testInsertMoto() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insertFra(Frame frame, HttpServletRequest request, @RequestParam("mainImg") MultipartFile mainImg, @RequestParam("files") MultipartFile[] files) 
* 
*/ 
@Test
public void testInsertFraForFrameRequestMainImgFiles() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insertFra(HttpSession session) 
* 
*/ 
@Test
public void testInsertFraSession() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insetFc(FlightControl flightControl, HttpServletRequest request, @RequestParam("mainImg") MultipartFile mainImg, @RequestParam("files") MultipartFile[] files, @RequestParam("pinDefinitionDiagramUrl") MultipartFile pinDef) 
* 
*/ 
@Test
public void testInsetFc() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insertFc(HttpSession session) 
* 
*/ 
@Test
public void testInsertFc() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insetIt(ImageTransmission imageTransmission, HttpServletRequest request, @RequestParam("mainImg") MultipartFile mainImg, @RequestParam("files") MultipartFile[] files, @RequestParam("pinDefinitionDiagramUrl") MultipartFile pinDef, @RequestParam("frequencyTableUrl") MultipartFile fre) 
* 
*/ 
@Test
public void testInsetIt() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: insertIt(HttpSession session) 
* 
*/ 
@Test
public void testInsertIt() throws Exception { 
//TODO: Test goes here... 
} 


} 
