package com.mrlonis.xml.shared;

import lombok.experimental.UtilityClass;

@UtilityClass
public class TestConstants {
    public static final String JSON_NO_ZONE =
            "{\"type\":\"${className}\",\"id\":1,\"title\":\"name\",\"date\":\"2024-07-05T14:06:07.617\",\"tag\":[\"tag1\",\"tag2\",\"tag3\"]}";
    public static final String JSON_ZONED =
            "{\"type\":\"${className}\",\"id\":1,\"title\":\"name\",\"date\":\"2024-07-05T14:06:07.617Z\",\"tag\":[\"tag1\",\"tag2\",\"tag3\"]}";

    public static final String XML_NO_ZONE =
            "<book type=\"${className}\" id=\"1\"><title>name</title><date>2024-07-05T14:06:07.617</date><tags><tag>tag1</tag><tag>tag2</tag><tag>tag3</tag></tags></book>";
    public static final String XML_ZONED =
            "<book type=\"${className}\" id=\"1\"><title>name</title><date>2024-07-05T14:06:07.617Z</date><tags><tag>tag1</tag><tag>tag2</tag><tag>tag3</tag></tags></book>";
}
