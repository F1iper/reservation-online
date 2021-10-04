package com.kamann.config.common;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Configuration
public class ConfigurationMapper {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
