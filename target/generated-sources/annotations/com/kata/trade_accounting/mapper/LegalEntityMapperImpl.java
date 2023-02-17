package com.kata.trade_accounting.mapper;

import com.kata.trade_accounting.dto.LegalEntityRequestDto;
import com.kata.trade_accounting.model.LegalEntity;
import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-15T17:57:54+0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class LegalEntityMapperImpl implements LegalEntityMapper {

    @Override
    public LegalEntity convert(LegalEntityRequestDto source) {
        if ( source == null ) {
            return null;
        }

        LegalEntity legalEntity = new LegalEntity();

        legalEntity.setId( source.getId() );
        legalEntity.setShortName( source.getShortName() );
        legalEntity.setCode( source.getCode() );
        legalEntity.setPhone( source.getPhone() );
        legalEntity.setFax( source.getFax() );
        legalEntity.setEmail( source.getEmail() );
        legalEntity.setNds( source.isNds() );
        legalEntity.setCommentToAddress( source.getCommentToAddress() );
        legalEntity.setDirector( source.getDirector() );
        legalEntity.setPositionOfTheHead( source.getPositionOfTheHead() );
        legalEntity.setChiefAccountant( source.getChiefAccountant() );
        legalEntity.setIdFsrar( source.getIdFsrar() );
        legalEntity.setIpUtm( source.getIpUtm() );
        legalEntity.setPort( source.getPort() );
        byte[] bossSinPic = source.getBossSinPic();
        if ( bossSinPic != null ) {
            legalEntity.setBossSinPic( Arrays.copyOf( bossSinPic, bossSinPic.length ) );
        }
        byte[] stampPic = source.getStampPic();
        if ( stampPic != null ) {
            legalEntity.setStampPic( Arrays.copyOf( stampPic, stampPic.length ) );
        }
        byte[] logoPic = source.getLogoPic();
        if ( logoPic != null ) {
            legalEntity.setLogoPic( Arrays.copyOf( logoPic, logoPic.length ) );
        }

        return legalEntity;
    }

    @Override
    public LegalEntity toLegalEntity(LegalEntityRequestDto legalEntityRequestDto) {
        if ( legalEntityRequestDto == null ) {
            return null;
        }

        LegalEntity legalEntity = new LegalEntity();

        legalEntity.setId( legalEntityRequestDto.getId() );
        legalEntity.setShortName( legalEntityRequestDto.getShortName() );
        legalEntity.setCode( legalEntityRequestDto.getCode() );
        legalEntity.setPhone( legalEntityRequestDto.getPhone() );
        legalEntity.setFax( legalEntityRequestDto.getFax() );
        legalEntity.setEmail( legalEntityRequestDto.getEmail() );
        legalEntity.setNds( legalEntityRequestDto.isNds() );
        legalEntity.setCommentToAddress( legalEntityRequestDto.getCommentToAddress() );
        legalEntity.setDirector( legalEntityRequestDto.getDirector() );
        legalEntity.setPositionOfTheHead( legalEntityRequestDto.getPositionOfTheHead() );
        legalEntity.setChiefAccountant( legalEntityRequestDto.getChiefAccountant() );
        legalEntity.setIdFsrar( legalEntityRequestDto.getIdFsrar() );
        legalEntity.setIpUtm( legalEntityRequestDto.getIpUtm() );
        legalEntity.setPort( legalEntityRequestDto.getPort() );
        byte[] bossSinPic = legalEntityRequestDto.getBossSinPic();
        if ( bossSinPic != null ) {
            legalEntity.setBossSinPic( Arrays.copyOf( bossSinPic, bossSinPic.length ) );
        }
        byte[] stampPic = legalEntityRequestDto.getStampPic();
        if ( stampPic != null ) {
            legalEntity.setStampPic( Arrays.copyOf( stampPic, stampPic.length ) );
        }
        byte[] logoPic = legalEntityRequestDto.getLogoPic();
        if ( logoPic != null ) {
            legalEntity.setLogoPic( Arrays.copyOf( logoPic, logoPic.length ) );
        }

        return legalEntity;
    }
}
