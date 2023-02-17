package com.kata.trade_accounting.mapper;

import com.kata.trade_accounting.dto.CountryDTO;
import com.kata.trade_accounting.model.Country;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-15T17:57:54+0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class CountryMapperImpl implements CountryMapper {

    @Override
    public CountryDTO toDto(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryDTO countryDTO = new CountryDTO();

        countryDTO.setId( country.getId() );
        countryDTO.setShortName( country.getShortName() );
        countryDTO.setFullName( country.getFullName() );
        countryDTO.setDigitalCode( country.getDigitalCode() );
        countryDTO.setDoubleLetterCode( country.getDoubleLetterCode() );
        countryDTO.setTripleLetterCode( country.getTripleLetterCode() );

        return countryDTO;
    }

    @Override
    public Country toModel(CountryDTO countryDTO) {
        if ( countryDTO == null ) {
            return null;
        }

        Country country = new Country();

        country.setId( countryDTO.getId() );
        country.setShortName( countryDTO.getShortName() );
        country.setFullName( countryDTO.getFullName() );
        country.setDigitalCode( countryDTO.getDigitalCode() );
        country.setDoubleLetterCode( countryDTO.getDoubleLetterCode() );
        country.setTripleLetterCode( countryDTO.getTripleLetterCode() );

        return country;
    }
}
