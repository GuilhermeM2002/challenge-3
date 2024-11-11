package br.com.challenge3.OrderProcessingService.infra.config

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ModelMapperConfig {

    @Bean
    fun modelMapper () : ModelMapper {
        return ModelMapper()
    }
}