package com.kamann.config.common;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Service
@RequiredArgsConstructor
@Configuration
@EnableSwagger2
public class ConfigurationMapper {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
