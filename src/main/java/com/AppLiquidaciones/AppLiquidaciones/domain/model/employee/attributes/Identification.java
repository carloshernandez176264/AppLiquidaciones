package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.exceptions.ValidationException;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import org.springframework.validation.annotation.Validated;


@Builder
@Validated
public class Identification {

   @Pattern(regexp = "[0-9]+", message = "Identification only allows numbers")
    private Integer value;


    public Integer getValue() {
        return value;
    }

    private void ValidateIdentification(Integer value) {
        if (value < 0) {
            throw new ValidationException("Identification must be positive");
        } else if (value == null) {
                    throw new IllegalArgumentException("El número de cedúla no debe ser");
                } else if (value < 0) {
                    throw new IllegalArgumentException("Identification can not be negative");
                } else if (value < 1000000) {
                    throw new IllegalArgumentException("El número de cedúla no debe ser inferior a 7 digitos");
                } else if (value > 9999999999L) {
                    throw new IllegalArgumentException("Identification can not be more than 10 digits");
                } else if (value == 0) {
                    throw new IllegalArgumentException("Identification can not be 0");
                }else if (value.equals("*,/,+,-")) {
                    throw new IllegalArgumentException("Identification can not be a character");
                }else if (value.equals(" ")) {
                    throw new IllegalArgumentException("Identification can not be a space");
                }
        }


    @Override
    public String toString() {
        return "Identification{" +
                "value=" + value +
                '}';
    }
}
