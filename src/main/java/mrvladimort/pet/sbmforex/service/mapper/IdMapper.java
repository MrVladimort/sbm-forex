package mrvladimort.pet.sbmforex.service.mapper;

import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public abstract class IdMapper {
    String uuidToString(UUID uuid) {
        return uuid.toString();
    }

    UUID stringToUUID(String string) {
        return UUID.fromString(string);
    }
}
