package com.kata.trade_accounting.mapper;

import com.kata.trade_accounting.dto.LegalEntityRresponseDto;
import com.kata.trade_accounting.model.LegalEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-15T17:57:54+0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class LegalEntityDtoMapperImpl implements LegalEntityDtoMapper {

    @Override
    public LegalEntityRresponseDto convert(LegalEntity source) {
        if ( source == null ) {
            return null;
        }

        LegalEntityRresponseDto legalEntityRresponseDto = new LegalEntityRresponseDto();

        legalEntityRresponseDto.setId( source.getId() );
        legalEntityRresponseDto.setShortName( source.getShortName() );
        legalEntityRresponseDto.setCode( source.getCode() );
        legalEntityRresponseDto.setRemoved( source.isRemoved() );

        return legalEntityRresponseDto;
    }

    @Override
    public LegalEntityRresponseDto toLegalEntityDto(LegalEntity legalEntity) {
        if ( legalEntity == null ) {
            return null;
        }

        LegalEntityRresponseDto legalEntityRresponseDto = new LegalEntityRresponseDto();

        legalEntityRresponseDto.setId( legalEntity.getId() );
        legalEntityRresponseDto.setShortName( legalEntity.getShortName() );
        legalEntityRresponseDto.setCode( legalEntity.getCode() );
        legalEntityRresponseDto.setRemoved( legalEntity.isRemoved() );

        return legalEntityRresponseDto;
    }
}
