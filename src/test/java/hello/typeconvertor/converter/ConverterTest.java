package hello.typeconvertor.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    void stringToInteger() {
        //given
        StringToIntegerConverter converter = new StringToIntegerConverter();

        //when
        Integer result = converter.convert("10");

        //then
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    void integerToString() {
        //given
        IntergerToStringConverter converter = new IntergerToStringConverter();

        //when
        String result = converter.convert(10);

        //then
        Assertions.assertThat(result).isEqualTo("10");
    }


}
