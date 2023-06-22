package com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes;

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

    public void ValidateIdentification(Integer value) {
        if (value < 0) {
            throw new IllegalArgumentException("Identification must be positive");
        } else if (value == null) {
                    throw new IllegalArgumentException("Identification can not be null");
                } else if (value < 0) {
                    throw new IllegalArgumentException("Identification can not be negative");
                } else if (value < 1000000000) {
                    throw new IllegalArgumentException("Identification can not be less than 10 digits");
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
