package org.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;

public class MockTest {

    JsonString jsonString;

    @Before
    public void setUp(){
        System.out.println("Run setUp");
        jsonString = Mockito.mock(JsonString.class);
    }
    

    @Test
    public void testJsonStringGetter() throws Exception {
        Mockito.when(jsonString.JsonStringGetter(any())).thenReturn("json");

        ProcessQuery processQuery = new ProcessQuery(jsonString);

        String result = processQuery.process("json test");
        assertThat(result).isEqualTo("JSON");
    }
}
