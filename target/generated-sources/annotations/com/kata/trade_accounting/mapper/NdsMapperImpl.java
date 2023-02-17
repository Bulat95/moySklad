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
public class NdsMapperImpl implements NdsMapper {

    @Override
    public Nds convert(NdsDto source) {
        if ( source == null ) {
            return null;
        }

        Nds nds = new Nds();

        nds.setId( source.getId() );
        nds.setNdsValue( source.getNdsValue() );
        nds.setComment( source.getComment() );

        return nds;
    }

    @Override
    public Nds toNds(NdsDto ndsDto) {
        if ( ndsDto == null ) {
            return null;
        }

        Nds nds = new Nds();

        nds.setId( ndsDto.getId() );
        nds.setNdsValue( ndsDto.getNdsValue() );
        nds.setComment( ndsDto.getComment() );

        return nds;
    }
}
