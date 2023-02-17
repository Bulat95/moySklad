package com.kata.trade_accounting.mapper;

import com.kata.trade_accounting.dto.TypeOfProductDto;
import com.kata.trade_accounting.model.TypeOfProduct;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-15T17:57:54+0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class TypeOfProductDtoMapperImpl implements TypeOfProductDtoMapper {

    @Override
    public TypeOfProductDto convert(TypeOfProduct source) {
        if ( source == null ) {
            return null;
        }

        TypeOfProductDto typeOfProductDto = new TypeOfProductDto();

        typeOfProductDto.setId( source.getId() );
        typeOfProductDto.setName( source.getName() );
        typeOfProductDto.setTnved( source.getTnved() );
        typeOfProductDto.setModel( source.getModel() );
        typeOfProductDto.setGender( source.getGender() );
        typeOfProductDto.setTypeOfProduction( source.getTypeOfProduction() );
        typeOfProductDto.setAge( source.getAge() );
        typeOfProductDto.setRemoved( source.isRemoved() );

        return typeOfProductDto;
    }

    @Override
    public TypeOfProductDto toTypeOfProductDto(TypeOfProduct typeOfProduct) {
        if ( typeOfProduct == null ) {
            return null;
        }

        TypeOfProductDto typeOfProductDto = new TypeOfProductDto();

        typeOfProductDto.setId( typeOfProduct.getId() );
        typeOfProductDto.setName( typeOfProduct.getName() );
        typeOfProductDto.setTnved( typeOfProduct.getTnved() );
        typeOfProductDto.setModel( typeOfProduct.getModel() );
        typeOfProductDto.setGender( typeOfProduct.getGender() );
        typeOfProductDto.setTypeOfProduction( typeOfProduct.getTypeOfProduction() );
        typeOfProductDto.setAge( typeOfProduct.getAge() );
        typeOfProductDto.setRemoved( typeOfProduct.isRemoved() );

        return typeOfProductDto;
    }
}
