package com.kata.trade_accounting.mapper;

import com.kata.trade_accounting.dto.ProductPackagingDto;
import com.kata.trade_accounting.model.ProductPackaging;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-15T17:57:54+0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class ProductPackagingDtoMapperImpl implements ProductPackagingDtoMapper {

    @Override
    public ProductPackagingDto convert(ProductPackaging source) {
        if ( source == null ) {
            return null;
        }

        ProductPackagingDto productPackagingDto = new ProductPackagingDto();

        productPackagingDto.setId( source.getId() );
        productPackagingDto.setName( source.getName() );
        productPackagingDto.setRemoved( source.isRemoved() );

        return productPackagingDto;
    }

    @Override
    public ProductPackagingDto toProductPackagingDto(ProductPackaging productPackaging) {
        if ( productPackaging == null ) {
            return null;
        }

        ProductPackagingDto productPackagingDto = new ProductPackagingDto();

        productPackagingDto.setId( productPackaging.getId() );
        productPackagingDto.setName( productPackaging.getName() );
        productPackagingDto.setRemoved( productPackaging.isRemoved() );

        return productPackagingDto;
    }
}
