package com.example.demo;

import com.example.demo.model.GasController;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private ObjectMapper objectMapper;

	private static String payload = "{  \n"
			+ "   \"data\":{  \n"
			+ "      \"lifeTime\":48256515,\n"
			+ "      \"state\":0,\n"
			+ "      \"pm1\":8.66666,\n"
			+ "      \"pm25\":10.55555,\n"
			+ "      \"pm10\":12,\n"
			+ "      \"fpm1\":8.66666,\n"
			+ "      \"fpm25\":10.55555,\n"
			+ "      \"fpm10\":12,\n"
			+ "      \"pnum03\":1683.666,\n"
			+ "      \"pnum05\":462.8888,\n"
			+ "      \"pnum1\":56.22222,\n"
			+ "      \"pnum25\":3,\n"
			+ "      \"pnum5\":1.777777,\n"
			+ "      \"pnum10\":0.111111,\n"
			+ "      \"temperature\":7.369999,\n"
			+ "      \"humidity\":55.04286,\n"
			+ "      \"pressure\":460.0541,\n"
			+ "      \"ozoneHigh\":93.0246,\n"
			+ "      \"ozoneLow\":93.0246,\n"
			+ "      \"co\":400,\n"
			+ "      \"no\":48.75145,\n"
			+ "      \"no2\":30.18935,\n"
			+ "      \"h2s\":2,\n"
			+ "      \"so2\":2,\n"
			+ "      \"c6h6\":60\n"
			+ "   },\n"
			+ "   \"deviceInfo\":{  \n"
			+ "      \"id\":3,\n"
			+ "      \"description\":\"anton miroshnichenko\",\n"
			+ "      \"ip\":\"192.168.88.192\",\n"
			+ "      \"packetsSent\":1452\n"
			+ "   },\n"
			+ "   \"deviceLocation\":{  \n"
			+ "      \"descriptiveLocation\":\"my home - kyiv, volodymyra salskogo str., 43\",\n"
			+ "      \"latitudeSet\":\"50.479820\",\n"
			+ "      \"longtitudeSet\":\"30.417506\",\n"
			+ "      \"altitudeSet\":\"6\"\n"
			+ "   },\n"
			+ "   \"messageInfo\":{  \n"
			+ "      \"messageId\":1616,\n"
			+ "      \"messageDateTime\":\"tue mar 6 9:26:46 2019\",\n"
			+ "      \"requestHash\":\"e2fe0cd229c09988aeabb8bce654d05c355462df\"\n"
			+ "   }\n"
			+ "}";

	private static String wrongPayload = "{\"lifeTime\":48256515,\"state\":0,\"pm1\":8.66666,\"pm25\":10.55555,\"pm10\":12,\"fpm1\":8.66666,\"fpm25\":10.55555,\"fpm10\":12,\"pnum03\":1683.666,\"pnum05\":462.8888,\"pnum1\":56.22222,\"pnum25\":3,\"pnum5\":1.777777,\"pnum10\":0.111111,\"temperature\":7.369999,\"humidity\":55.04286,\"pressure\":460.0541,\"ozoneHigh\":93.0246,\"ozoneLow\":93.0246,\"co\":400,\"no\":48.75145,\"no2\":30.18935,\"h2s\":2,\"so2\":2,\"c6h6\":60},\"deviceInfo\":{\"id\":3,\"description\":\"anton miroshnichenko\",\"ip\":\"192.168.88.192\",\"packetssent\":1452},\"deviceLocation\":{\"descriptiveLocation\":\"my home - kyiv, volodymyra salskogo str., 43\",\"latitudeSet\":\"50.479820\",\"longtitudeSet\":\"30.417506\",\"altitudeSet\":\"6\"}},\"messageId\":1616,\"messageDateTime\":\"tue mar 6 9:26:46 2019\",\"requestHash\":\"e2fe0cd229c09988aeabb8bce654d05c355462df\"}";

	@Test
	public void contextLoads() throws IOException {
		System.out.println("payload:");
		System.out.println(objectMapper.readValue(payload, GasController.class));
	}

}
