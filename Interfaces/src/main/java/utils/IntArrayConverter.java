package utils;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.TypedArgumentConverter;

import java.util.Arrays;
import java.util.stream.Collectors;

public class IntArrayConverter extends TypedArgumentConverter<String,Integer[]> {
    public IntArrayConverter() {
        super(String.class,Integer[].class);
    }

    @Override
    protected Integer[] convert(String source) throws ArgumentConversionException {
        String[] arr=((String) source).split("\\s*;\\s*");
        return Arrays.stream(arr).map(i->Integer.valueOf(i)).collect(Collectors.toList()).toArray(new Integer[0]);
    }
}