package com.example;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import org.hamcrest.Matcher;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.service.FDInterestCalculatorService;


@WebMvcTest

public class OpenAPIDefinitionTest {
	
	@MockBean
	private FDInterestCalculatorService fDInterestCalculatorService;
	
	
	@Autowired
	private MockMvc mockMvc;

    @Test
    public void getBankBankName_BankNameDefined_Is_Yes() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/bank/{bankName}",
        "A"
);        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isOk());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    @Test
    public void getBankBankName_BankNameValueLength_Is_Gt_1() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/bank/{bankName}",
        "M=RPyOeBglqDPLzBBBbiYp<DlbJDDva>Ictd<lXFrThUmfbfgPbLSh?TIke=<<Phq=cahqoDTZFFINYVILuqvy?lcPl@kNp@lKiIbmvxVfr"
);        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isOk());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    @Test
    public void getBankBankName_BankNameDefined_Is_No() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/bank/{bankName}",
        ""
);        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isNotFound());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    @Test
    public void getBankBankName_BankNameType_Is_Null() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/bank/{bankName}",
        ""
);        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isNotFound());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    @Test
    public void getBankBankName_BankNameValueLength_Is_0() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/bank/{bankName}",
        ""
);        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isNotFound());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    @Test
    public void getCalculateFdinterest_BankDefined_Is_Yes() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/calculate/fdinterest")
        .queryParam( "bank", ")ehpnA}qNTpiDg2mFeI3;I~u%lVux:\"pwfQNEAbyE,.$LbsuJCyYE>A\"a24u[ae/9/v`\\5mk=BxC{1RQk%:=(~{[m7ZE@s5p0PTWO57<V6bj%8wyAkN}N1jwmqp3?YYfY<Xz=Ebo=;Lu:S+<!G(R/|n#(#p#c\"m(Jv")
        .queryParam( "durationInYear", "-452735710")
;        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isOk());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    @Test
    public void getCalculateFdinterest_BankValueLength_Is_0() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/calculate/fdinterest")
        .queryParam( "bank", "")
        .queryParam( "durationInYear", "0")
;        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isOk());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    @Test
    public void getCalculateFdinterest_DurationInYearValue_Is_Gt_0() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/calculate/fdinterest")
        .queryParam( "bank", "!z,)TI`txPV:6xF&>kQZtks|a')<=*[3[2{nbGe qk&ZtnhZAX%jW-.KU4?YM,TF?C FQ |UZ p0/:th8#_x`m$RxD$ySUO%dL<,z8_G`Bvz!.0Gauug4lr8i']LEl")
        .queryParam( "durationInYear", "671440151")
;        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isOk());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    @Test
    public void getCalculateFdinterest_BankDefined_Is_No() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/calculate/fdinterest")
        .queryParam( "durationInYear", "-122379217")
;        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isBadRequest());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    @Test
    public void getCalculateFdinterest_BankType_Is_Null() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/calculate/fdinterest")
        .queryParam( "bank", "null")
        .queryParam( "durationInYear", "-549514044")
;        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isBadRequest());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    @Test
    public void getCalculateFdinterest_DurationInYearDefined_Is_No() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/calculate/fdinterest")
        .queryParam( "bank", "")
;        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isBadRequest());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    @Test
    public void getCalculateFdinterest_DurationInYearType_Is_Null() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/calculate/fdinterest")
        .queryParam( "bank", "")
        .queryParam( "durationInYear", (String) null)
;        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isBadRequest());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    @Test
    public void getCalculateFdinterest_DurationInYearType_Is_NotInteger() {
        MockHttpServletRequestBuilder req = MockMvcRequestBuilders.get("/calculate/fdinterest")
        .queryParam( "bank", "")
        .queryParam( "durationInYear", "")
;        try {
        mockMvc.perform(req).andExpect(MockMvcResultMatchers.status()
.isBadRequest());        } catch (Exception e) {
	e.printStackTrace();
} 
    }

    private static Matcher<Integer> isSuccess() {
        return allOf( greaterThanOrEqualTo(200), lessThan(300));
    }

    private static Matcher<Integer> isBadRequest() {
        return allOf( greaterThanOrEqualTo(400), lessThan(500));
    }

    private static String forTestServer( String defaultUri) {
        String testServer = tcasesApiServer();
        return
            defaultUri == null || !testServer.isEmpty()
            ? testServer
            : defaultUri;
    }

    private static String tcasesApiServer() {
        String uri = System.getProperty( "tcasesApiServer");
        return uri == null? "" : uri.trim();
    }
}
