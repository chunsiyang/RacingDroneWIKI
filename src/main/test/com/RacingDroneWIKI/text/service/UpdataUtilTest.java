package com.RacingDroneWIKI.text.service;

import com.RacingDroneWIKI.pojo.Antenna;
import com.RacingDroneWIKI.pojo.Item;
import com.RacingDroneWIKI.service.UpdataUtil;
import com.RacingDroneWIKI.spring.config.RootConfig;
import com.RacingDroneWIKI.spring.config.WebConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/** 
* UpdataUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>4, 23, 2018</pre>
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class, WebConfig.class})
@WebAppConfiguration
@Transactional
public class UpdataUtilTest {
    private static MockMvc mockMvc;
    @Autowired
    private WebApplicationContext wac;
@Autowired
    UpdataUtil updataUtil;
@Before
public void before() throws Exception {
    mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: insertImg(Item item, HttpServletRequest request, MultipartFile img) 
* 
*/ 
@Test
public void testInsertImg() throws Exception { 
    Item item=new Antenna();
    item.setModel("test");
    MockHttpServletRequest request=new MockHttpServletRequest();
    request.setRequestURI("/itemInsert/InsertAnt");
    MultipartFile file = new MockMultipartFile("sda.jpg",
            "sda.jpg",
            null,
            new byte[]{1,2,3,4,5});
    item.setImgUrl(updataUtil.insertImg(item, request, file));
    Assert.assertEquals("ant/test.jpg",item.getImgUrl());
}

/** 
* 
* Method: insertImgMutl(Item item, HttpServletRequest request, MultipartFile[] img) 
* 
*/ 
@Test
public void testInsertImgMutl() throws Exception {
    Item item=new Antenna();
    item.setModel("test");
    MockHttpServletRequest request=new MockHttpServletRequest();
    request.setRequestURI("/itemInsert/InsertAnt");
    MultipartFile[] file =new MultipartFile[]{new MockMultipartFile("sda.jpg",
            "sda.jpg",
            null,
            new byte[]{1,2,3,4,5}),
            new MockMultipartFile("sdb.jpg",
            "sdb.jpg",
            null,
            new byte[]{1,2,3,4,5})};
    item.setExtraPictures(updataUtil.insertImgMutl(item, request, file));
    Assert.assertEquals("ant/test_ep0.jpg",item.getExtraPictures().get(0));
    Assert.assertEquals("ant/test_ep1.jpg",item.getExtraPictures().get(1));

} 

/** 
* 
* Method: insertSpecialImg(Item item, HttpServletRequest request, MultipartFile img, String type) 
* 
*/ 
@Test
public void testInsertSpecialImg() throws Exception {
    Item item=new Antenna();
    item.setModel("test");
    MockHttpServletRequest request=new MockHttpServletRequest();
    request.setRequestURI("/itemInsert/InsertAnt");
    MultipartFile file = new MockMultipartFile("sda.jpg",
            "sda.jpg",
            null,
            new byte[]{1,2,3,4,5});
    String pin=(updataUtil.insertSpecialImg(item, request, file, updataUtil.PIN_DEFINTION_DIAGRAM));
    String fre=(updataUtil.insertSpecialImg(item, request, file, updataUtil.FREQUENCY_TABLE));
    Assert.assertEquals("ant/test_pin.jpg",pin);
    Assert.assertEquals("ant/test_fre.jpg",fre);
}

} 
