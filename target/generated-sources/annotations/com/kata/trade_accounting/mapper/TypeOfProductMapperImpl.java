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
public class TypeOfProductMapperImpl implements TypeOfProductMapper {

    @Override
    public TypeOfProduct convert(TypeOfProductDto source) {
        if ( source == null ) {
            return null;
        }

        TypeOfProduct typeOfProduct = new TypeOfProduct();

        typeOfProduct.setId( source.getId() );
        typeOfProduct.setName( source.getName() );
        typeOfProduct.setTnved( source.getTnved() );
        typeOfProduct.setModel( source.getModel() );
        typeOfProduct.setGender( source.getGender() );
        typeOfProduct.setTypeOfProduction( source.getTypeOfProduction() );
        typeOfProduct.setAge( source.getAge() );
        typeOfProduct.setRemoved( source.isRemoved() );

        return typeOfProduct;
    }

    @Override
    public TypeOfProduct toTypeOfProduct(TypeOfProductDto typeOfProductDto) {
        if ( typeOfProductDto == null ) {
            return null;
        }

        TypeOfProduct typeOfProduct = new TypeOfProduct();

        typeOfProduct.setId( typeOfProductDto.getId() );
        typeOfProduct.setName( typeOfProductDto.getName() );
        typeOfProduct.setTnved( typeOfProductDto.getTnved() );
        typeOfProduct.setModel( typeOfProductDto.getModel() );
        typeOfProduct.setGender( typeOfProductDto.getGender() );
        typeOfProduct.setTypeOfProduction( typeOfProductDto.getTypeOfProduction() );
        typeOfProduct.setAge( typeOfProductDto.getAge() );
        typeOfProduct.setRemoved( typeOfProductDto.isRemoved() );

        return typeOfProduct;
    }
}
