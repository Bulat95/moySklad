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
public class ProductPackingMapperImpl implements ProductPackingMapper {

    @Override
    public ProductPackaging convert(ProductPackagingDto source) {
        if ( source == null ) {
            return null;
        }

        ProductPackaging productPackaging = new ProductPackaging();

        productPackaging.setId( source.getId() );
        productPackaging.setName( source.getName() );
        productPackaging.setRemoved( source.isRemoved() );

        return productPackaging;
    }

    @Override
    public ProductPackaging toProductPackaging(ProductPackagingDto productPackagingDto) {
        if ( productPackagingDto == null ) {
            return null;
        }

        ProductPackaging productPackaging = new ProductPackaging();

        productPackaging.setId( productPackagingDto.getId() );
        productPackaging.setName( productPackagingDto.getName() );
        productPackaging.setRemoved( productPackagingDto.isRemoved() );

        return productPackaging;
    }
}
