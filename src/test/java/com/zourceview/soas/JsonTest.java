package com.zourceview.soas;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zourceview.soas.jpa.User;

public class JsonTest {

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testDeviceAttributesJSONWrite() throws JsonGenerationException, JsonMappingException, IOException {
	mapper.writerWithDefaultPrettyPrinter().writeValue(System.out, new User());
    }
}
