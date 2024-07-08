package com.mrlonis.example.model.jackson.jakarta;

import static com.mrlonis.example.util.Constants.AUTHOR;
import static com.mrlonis.example.util.Constants.ID;
import static com.mrlonis.example.util.Constants.JODA_DATE_TIME;
import static com.mrlonis.example.util.Constants.JODA_LOCAL_DATE_TIME;
import static com.mrlonis.example.util.Constants.NAME;
import static com.mrlonis.example.util.Constants.NO_ZONE;
import static com.mrlonis.example.util.Constants.TAGS;
import static com.mrlonis.example.util.Constants.ZONED;

import com.mrlonis.example.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJakartaJodaTimeConstants {
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeField
            JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeNone
            JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeProperty
            JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypePublicMember
            JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAKARTA_JODA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property", JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeField
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeNone
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_NONE =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeProperty
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypePublicMember
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tag(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAKARTA_JODA_TIME_ZONED_MAP = Map.of(
            "field",
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none",
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property",
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member",
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<String, Map<String, BaseModel<?>>> JACKSON_JAKARTA_JODA_TIME_MAP =
            Map.of(ZONED, JACKSON_JAKARTA_JODA_TIME_ZONED_MAP, NO_ZONE, JACKSON_JAKARTA_JODA_TIME_NO_ZONE_MAP);
}
