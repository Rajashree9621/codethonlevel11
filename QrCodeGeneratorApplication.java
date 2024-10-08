package qr.generate;

import java.awt.image.BufferedImage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;


@SpringBootApplication
public class QrCodeGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(QrCodeGeneratorApplication.class, args);
	}
	
	@Bean
	public HttpMessageConverter<BufferedImage> createImageHttpMessageConverter(){
		return new BufferedImageHttpMessageConverter();
	}
	

}
