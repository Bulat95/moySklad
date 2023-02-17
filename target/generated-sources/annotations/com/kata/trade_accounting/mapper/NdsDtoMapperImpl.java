package com.kata.trade_accounting.mapper;

import com.kata.trade_accounting.dto.NdsDto;
import com.kata.trade_accounting.model.Nds;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-15T17:57:54+0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class NdsDtoMapperImpl implements NdsDtoMapper {

    @Override
    public NdsDto convert(Nds source) {
        if ( source == null ) {
            return null;
        }

        NdsDto ndsDto = new NdsDto();

        ndsDto.setId( source.getId() );
        ndsDto.setNdsValue( source.getNdsValue() );
        ndsDto.setComment( source.getComment() );

        return ndsDto;
    }

    @Override
    public NdsDto toNdsDto(Nds nds) {
        if ( nds == null ) {
            return null;
        }

        NdsDto ndsDto = new NdsDto();

        ndsDto.setId( nds.getId() );
        ndsDto.setNdsValue( nds.getNdsValue() );
        ndsDto.setComment( nds.getComment() );

        return ndsDto;
    }
}
